package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> getUserList(){
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50 , 7 , "Chemists"));
        users.add(new User("Jessie Pinkman", 25 , 4548 , "Sales"));
        users.add(new User("Tuco Salamanca", 34 , 116 , "Manager"));
        users.add(new User("Gus Fring", 49 , 0 , "Board"));
        users.add(new User("Gale Boetticher", 49 , 0 , "Chemists"));
        users.add(new User("MIke Ehrnmantraut", 57 , 0 , "Security"));
        return users;
    }
    public static List<User> getUserList2() {
        List<User> users = new ArrayList<>();
        users.add(new User(null, 50, 7, "Chemists"));
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(null);
        return users;
    }
}
