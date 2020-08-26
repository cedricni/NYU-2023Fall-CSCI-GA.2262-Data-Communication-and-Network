package com.cedric;

public class CarServiceImpl implements CarService
{

    @Override
    public int eat(String e)
    {
        System.out.println("eat"+e);
        return 102;
    }
    
}
