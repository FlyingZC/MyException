package com.zc.exception;

/**
 * @author Flyin
 * 异常发生时尝试一定次数
 */
public class T04MoreTry
{
    private static int tryCount = 0;

    public static void moreEx()
    {
        try
        {
            System.out.println("第" + tryCount + "次调用moreEx方法");
            throw new Exception();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            //第一次 调用 发生异常后,再重试三次
            if (tryCount++ < 3)
            {
                moreEx();
            }
        }
    }

    public static void main(String[] args)
    {
        moreEx();
        System.out.println(testReturn());
    }

    public static String testReturn()
    {
        try
        {
            throw new Exception();
        }
        catch (Exception e)
        {

        }
        return "a";
    }
}
