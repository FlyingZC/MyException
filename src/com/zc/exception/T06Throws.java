package com.zc.exception;

public class T06Throws
{
    /**
     * 若抛出编译期异常 需要声明throws,要么就try..catch处理掉
     * @throws Exception
     */
    public void testThrows() throws Exception
    {
        throw new Exception();
    }
    
    /**
     *若抛出运行时 异常及其子类,无需声明throws 
     */
    public void testThrows2()
    {
        throw new RuntimeException();
    }
}
