package org.example.collections.entity;

public class User {
    private static Integer userCounter = 0;
    private Integer id;
    String firstName;
    String lastName;

    public User(Integer id) {
        this.id = id;
    }

    Integer password;
    String email;

    public User(String firstName, String lastName, Integer password, String email) {
        this.firstName = firstName;
        this.id = ++userCounter;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Integer getUserCounter() {
        return userCounter;
    }

    public static void setUserCounter(Integer userCounter) {
        User.userCounter = userCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                '}';
    }

}
