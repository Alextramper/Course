package Collections.List;

import Collections.Set.HashSet.User;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User firstAlex = new User("Alex", "Kray");
        User secondAlex = new User( "Alex", "Westler");
        User thirdAlex = new User( "Alex", "West");

        users.add(firstAlex);
        users.add(secondAlex);
        users.add(thirdAlex);
        for (User user: users) {
            System.out.println(user);
        }
    }
}
