package com.cedric;

public class User
{
    private int age;
    private String name;
    private static User user;
    
    public static User create() {
        if (user == null) {
        user = new User();
        }
        return user;
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    private User()
    {
        System.out.println("hello");
    }
    
    
}
