package Collections.Set.HashSet;

public class User {
    private String name;
    private String surname;

    public User( String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean equals(Object object) {
        User user = (User) object;
        String currentFullName = this.name + " " + this.surname;
        String compareFullName = user.name + " " + user.surname;
        return currentFullName.equals(compareFullName);
    }
    @Override
    public int hashCode() {
        return 1;
    }
    public String toString() {
        return this.name + " " + this.surname;
    }
}
