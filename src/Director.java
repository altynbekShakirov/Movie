public class Director {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return
                "name: " + name + '\n' +
                "lastName: " + lastName + '\n' ;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
