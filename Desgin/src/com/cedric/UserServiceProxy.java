package com.cedric;

import org.apache.log4j.Logger;

/**
 * 
 * 静态代理
 *  
 * @author  Cedric
 * @version  [V1.00, Aug. 19, 2020]
 * @see  [相关类/方法]
 * @since V1.00
 */

public class UserServiceProxy implements UserService
{
    private UserService service;
    
    public UserServiceProxy(UserService service) {
        this.service = service;
    }
    
    private static Logger log = Logger.getRootLogger();
    
    
    @Override
    public void logIn()
    {
        log.info("before logIn");
        service.logIn();
        log.info("after logIn");

    }

    @Override
    public void signUp()
    {
        log.info("before signUp");
        service.signUp();
        log.info("after signUp");
        
    }
    
}
