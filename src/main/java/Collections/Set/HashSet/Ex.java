package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

class Ex {
    public static void main(String[] args) {
        Set someSet = new HashSet();
        User firstAlex = new User("Alex", "Kray");
        User secondAlex = new User( "Alex", "Westler");
        someSet.add(firstAlex);
        someSet.add(secondAlex);

        System.out.println(someSet.size());

        if (someSet.contains(firstAlex)) {
            System.out.println("ass:");
        }

    }
}
