package com.zc.exception;

/**
 * @author Flyin
 * 异常 在 父子类中的表现
 */
public class T07ExpExtend
{

}

class SuperException extends Exception
{
    
}

class SubException extends SuperException
{
    
}

class TwoException extends Exception
{
    
}

class Super
{
    public Super() throws TwoException,SubException 
    {
        
    }
    
    public void method() throws SuperException
    {
        
    }
}

class Sub extends Super
{
    /**
     * Unhandled exception type SuperException
     * 子类构造器必须处理父类构造器 抛出的异常类型 ,或者抛出更大范围的异常
     */
    public Sub() throws TwoException,SuperException
    {
        
    }
    
    public Sub(String arg) throws Exception
    {
        
    }
    
    /* 
     * 子类需抛出更具体或相同于父类方法的异常
     */
    @Override
    public void method() throws SubException
    {
        
    }
    
}