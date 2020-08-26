package com.cedric;

public class TestUser
{
    
    public static void main(String[] args)
    {
//       User user1 = User.create();
//       User user2 = User.create();
//       System.out.println(user1.hashCode());
//       System.out.println(user2.hashCode());
       for (int i=0;i<15;i++) {
           System.out.println("hello"+i);
           if (i==5) {
               System.err.println("error");
           }
       }
    }
    
}
