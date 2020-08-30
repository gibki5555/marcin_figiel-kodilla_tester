package com.kodilla.stream;

public class User {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String username, int age, int numberOfPosts, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUsername() {
        return this.username;


    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
