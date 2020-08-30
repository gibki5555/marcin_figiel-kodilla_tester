package com.kodilla.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserManager {
    public static void main(String[] args) {
        UserRepository.getUserList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(u -> u.getUsername())
                .forEach(u -> System.out.println(u));
        System.out.println("----------------------------------");

        UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() > 40)
                .map(u -> u.getUsername())
                .forEach(u -> System.out.println(u));
        System.out.println("-------------------------------------");
        getusersWitchPosts().forEach(user -> System.out.println(user.getUsername()));

        System.out.println("--------------------------------------------");
        for (User user : UserRepository.getUserList2()) {
            System.out.println(Optional
                    .ofNullable(user)
                    .map(u -> u.getUsername())
                    .orElse("nie ma"));
        }
    }

    public static List<User> getusersWitchPosts() {
        return UserRepository.getUserList()
                .stream()
                .filter(u -> u.getNumberOfPosts() > 0)
                .collect(Collectors.toList());
    }


}
