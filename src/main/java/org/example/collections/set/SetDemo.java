package org.example.collections.set;

import org.example.collections.entity.User;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main() {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(9);
        set.add(12);
        set.add(8);
        set.add(8);

        System.out.println(set);

        Set<User> users = new HashSet<>();

        User user1 = new User("John", "Jim",1234,"john.jim@email.com");
        User user2 = new User("John", "Jim",1234,"john.jim@email.com");
        user2.setId(1);
        User user3 = new User();
        user3=user1;
        users.add(user2);
        users.add(user1);

        users.add(user3);

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        for(User u:users){
            System.out.println("user :"+u);
        }
    }
}
