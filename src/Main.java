import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Movie> movieList = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);
    private static final Scanner string = new Scanner(System.in);


    public static void main(String[] args) {
        objects();


        command();
    }

    public static void command() {
        while (true) {
            System.out.println("=================== Command=========================");
            System.out.println("Press 1 to print catalog");
            System.out.println("Press 2 to sort by full or part name");
            System.out.println("Press 3 to sort by year");
            System.out.println("Press 4 to sort by name");
            System.out.println("Press 5 to sort by director");
            System.out.println("Press 6 to find movies by actor's name");
            System.out.println("Press 7 to find movies by director's name");
            System.out.println("Press 8 to find movies by year");
            System.out.println("Press 9 to list movies and roles by actor's name");
            System.out.println("Press 10 to sort list of all actors with his roles");
            System.out.println("======================================================");

            start();

        }

    }

    public static void start() {
        Movie movie = new Movie();
        try {
            int scnum = scanner.nextInt();
            switch (scnum) {
                case 1:
                    System.out.println(movieList);
                    break;
                case 2:
                    movie.findMovieByName(movieList);
                    break;
                case 3:
                    movie.sortByYear(movieList);
                    break;
                case 4:
                    movie.sortByMovieName(movieList);
                    break;
                case 5:
                    movie.sortByDirector(movieList);
                    break;
                case 6:
                    movie.findMovieByActorName(movieList);
                    break;
                case 7:
                    movie.findMovieByDirector(movieList);
                    break;
                case 8:
                    movie.findMovieByYear(movieList);

                    break;
                case 9:
                    movie.findMovieByRole(movieList);
                    break;
                case 10:
                    movie.findMovieByDescription(movieList);
                    break;

            }
            if (scnum > 10) {
                throw new Exception("error");


            }

        } catch (Exception e) {
            System.err.println("error");
        }

    }

    public static void objects() {
        List<Cast> casts = new LinkedList<>(Arrays.asList(new Cast("David Tennant", "Crowley")));
        List<Cast> casts1 = new LinkedList<>(Arrays.asList(new Cast("SomeGirl", "Angry Fae")));
        List<Cast> casts2 = new LinkedList<>(Arrays.asList(new Cast("Daniel Radcliffe", "Harry Potter")));
        List<Cast> casts3 = new LinkedList<>(Arrays.asList(new Cast("Richard Armitage", "Thorin")));
        List<Cast> casts4 = new LinkedList<>(Arrays.asList(new Cast("Lee Pace", "Thranduil")));
        List<Cast> casts5 = new LinkedList<>(Arrays.asList(new Cast("Lee Pace", "Thranduil")));
        List<Cast> casts6 = new LinkedList<>(Arrays.asList(new Cast("Chris Hemsworth", "Thor")));
        List<Cast> casts7 = new LinkedList<>(Arrays.asList(new Cast("Una Stubbs", "Mrs. Hudson")));
        movieList = new ArrayList<>(Arrays.asList(
                new Movie("Good omens", 2019, "TV Series", new Director("Douglas", "Mackinnon"), casts),
                new Movie("Carnival Row", 2019, "TV Series", new Director("Some", "Director"), casts1),
                new Movie("Harry Potter", 2005, "Movie", new Director("Happy ", "Guy"), casts2),
                new Movie("Hobbit: An Unexpected Journey", 2012, "Movie", new Director("Poter", "Jackson"), casts3),
                new Movie("The Desolation of Smaug", 2013, "Movie", new Director("Peter", "Jackson"), casts4),
                new Movie("The Battle of the Five Armies", 2014, "Movie", new Director("Peter ", "Jackson"), casts5),
                new Movie("Avengers: Endgame", 2019, "Movie", new Director("Anthony", "Russo"), casts6),
                new Movie("Sherlock: Season1", 2010, "TV Series", new Director("Paul", "McGuigan"), casts7)


        ));

    }
}