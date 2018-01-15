package com.zc.exception;

public class T03Exception
{
    public static void main(String[] args)
    {
        T03Exception testException1 = new T03Exception();
        try
        {
            //1.调用testEx方法
            testException1.testEx();
        }
        catch (Exception e)//4.捕获异常
        {
            e.printStackTrace();
        }
    }

    public T03Exception()
    {

    }

    boolean testEx() throws Exception
    {
        boolean ret = true;
        //2.try
        try
        {
            ret = testEx1();
        }
        catch (Exception e)
        {
            System.out.println("testEx, catch exception");
            ret = false;
            //3.抛出异常
            throw e;
        }
        finally
        {
            System.out.println("testEx, finally; return value=" + ret);
            return ret;
        }
    }

    boolean testEx1() throws Exception
    {
        boolean ret = true;
        try
        {
            ret = testEx2();
            if (!ret)
            {
                return false;
            }
            System.out.println("testEx1, at the end of try");
            return ret;
        }
        catch (Exception e)
        {
            System.out.println("testEx1, catch exception");
            ret = false;
            throw e;
        }
        finally
        {
            System.out.println("testEx1, finally; return value=" + ret);
            return ret;
        }
    }

    boolean testEx2() throws Exception
    {
        boolean ret = true;
        try
        {
            int b = 12;
            int c;
            for (int i = 2; i >= -2; i--)
            {
                c = b / i;
                System.out.println("i=" + i);
            }
            return true;
        }
        catch (Exception e)
        {
            System.out.println("testEx2, catch exception");
            ret = false;
            throw e;
        }
        finally
        {
            System.out.println("testEx2, finally; return value=" + ret);
            return ret;
        }
    }
}
