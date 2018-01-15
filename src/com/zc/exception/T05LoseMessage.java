package com.zc.exception;

import org.junit.Test;

public class T05LoseMessage
{
    public void me1() throws Exception
    {
        throw new Exception("异常1");
    }

    public void me2() throws Exception
    {
        throw new Exception("异常2");
    }

    @Test
    public void testLose1()
    {
        try
        {
            try
            {
                //1.先调用me2(),该方法已经抛出异常
                me2();
            }
            finally
            { //2.但是不catch me2()的异常,而是继续调用me1()
                me1();
            }
        }
        catch (Exception e)
        {
            //3.打印me1()抛出的异常
            e.printStackTrace();
        }
    }

    @Test
    public void testLose2()
    {
        try
        {
            throw new RuntimeException();
        }
        finally
        {//在finally中return也会导致异常信息丢失
            return;
        }
    }
}
