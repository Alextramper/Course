package Exeptions;

//Создание своего эксепшна для пользования им в другом классе

public class userEx extends Exception {
    public userEx() {
        super();
    }

    public userEx(String message) {
        super(message);
    }

    public userEx(String message, Throwable e) {
        super(message, e);
    }
}

