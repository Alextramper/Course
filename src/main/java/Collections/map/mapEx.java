package Collections.map;

import Collections.Set.HashSet.User;

import java.util.*;
import java.util.function.Consumer;

public class mapEx {
    public static void main(String[] args) {
        Map<Integer, Collection> users = new TreeMap<>();
        Set set = new HashSet();
        User user1 = new User("Garry", "Nilson");
        User user2 = new User("Ted", "Rase");
        User user3 = new User("Amy", "Shine");
        User user4 = new User("Rorr", "Gon");
        User user5 = new User("Mory", "Nil");
        User user6 = new User("Dog", "Lin");
        User user7 = new User("Roymn", "Vine");
        User user8 = new User("Katy", "Shon");

        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);

        List list = new LinkedList();
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().equals(user7)) {
                iterator.remove();
            }
        }
       /* Consumer<List> consumer = new Consumer<List>() {
            @Override
            public void accept(List list) {
                //Some method which is using for all elements
            }
        }*/
        users.put(34, set);
        users.put(23, list);

        for (Map.Entry<Integer, Collection> map: users.entrySet()) {
            System.out.println("In house number " + map.getKey() +
                    " live next persons " + map.getValue());
        }
    }
}
