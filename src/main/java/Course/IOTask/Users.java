package Course.IOTask;

public enum Users {
    USERNAME("Katya");
    String user;

    Users(String user) {
        this.user = user;
    }

    public String getName() {
        return this.user;
    }
}
