package com.example.colliensepodder.retrofit.Model;

public class User {

    private String name;
    private String hobby;

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param name
     * @param hobby
     */
    public User(String name, String hobby) {
        super();
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}