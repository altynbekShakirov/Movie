import java.util.List;
import java.util.Scanner;

public class Movie implements Findable,Sortable{

    private  static final Scanner scanner= new Scanner(System .in);
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;


    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie m:movies) {
            System.out.println(m);

        }





        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("write movies name: ");
        String world= scanner.nextLine();
        for (Movie s:movies) {
            if (world.contains(s.name)){
                System.out.println(s);
            }

        }


    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        int i = 0;

        System.out.println("Write the actor name");
        String world=scanner.nextLine();
        for(Movie m:movies){
            if (world.equalsIgnoreCase(m.getCast().get(i).getActorFullName())){
                System.out.println(m);
            }
        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write year");
        int year= scanner.nextInt();
        for (Movie y:movies) {
            if (year==y.getYear()){
                System.out.println(y);
            }

        }


    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {

        Sotr sort = new Sotr();
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int num = scanner.nextInt();
        for (Movie m:movies) {
            switch (num){
                case 1:
                    movies.sort(sort.sortDirectorName);
                    System.out.println(m);
                    break;
                case 2:
                    movies.sort(sort.sortDirectorName1);
                    System.out.println(m);
                    break;
            }

        }




    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {

        int i = 0;
        System.out.println("write actor's role name: ");
        String world= scanner.nextLine();
        for (Movie s:movies) {
            if (world.contains(s.getCast().get(i).getRole())){
                System.out.println(s);
            }

        }


    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        int i = 0;
        System.out.println("write actor's name: ");
        String world= scanner.nextLine();
        for (Movie s:movies) {
            if (world.contains(s.getCast().get(i).getActorFullName())){
                System.out.println(s);
            }

        }



    }








    public Movie() {
    }

    @Override
    public String toString() {
        return
                "name: " + name + '\n' +
                "year: " + year +"\n"+
                "description: " + description + '\n' +
                "director: " + director +'\n'+
                "cast: " + cast+"\n" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }


    @Override
    public void sortByMovieName(List<Movie> movies) {
        Sotr sort= new Sotr();
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int num = scanner.nextInt();
        for (Movie m:movies) {
            switch (num){
                case 1:
                    movies.sort(sort.getSortName1);
                    System.out.println(m);
                    break;
                case 2:
                    movies.sort(sort.getGetSortName2);
                    System.out.println(m);
                    break;
            }

        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        Sotr sort = new Sotr();
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int num = scanner.nextInt();
        for (Movie m:movies) {
            switch (num){
                case 1:
                    movies.sort(sort.getSortYear1);
                    System.out.println(m);
                    break;
                case 2:
                    movies.sort(sort.getSortYear2);
                    System.out.println(m);
                    break;
            }

        }




    }

    @Override
    public void sortByDirector(List<Movie> movies) {

        Sotr sort = new Sotr();
        System.out.println("Press 1 to sort by ascending");
        System.out.println("Press 2 to sort by descending");
        int num = scanner.nextInt();
        for (Movie m:movies) {
            switch (num){
                case 1:
                    movies.sort(sort.sortDirectorName);
                    System.out.println(m);
                    break;
                case 2:
                    movies.sort(sort.sortDirectorName1);
                    System.out.println(m);
                    break;
            }

        }




    }
}
