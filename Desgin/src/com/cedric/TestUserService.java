package com.cedric;

/**
 * 静态代理测试
 *  
 * @author  Cedric
 * @version  [V1.00, Aug. 19, 2020]
 * @see  [相关类/方法]
 * @since V1.00
 */

public class TestUserService
{
    public static void main(String[] args)
    {
        UserService user = new UserServiceImpl();
        UserService proxy = new UserServiceProxy(user);
        proxy.logIn();
    }
}
