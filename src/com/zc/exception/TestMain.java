package com.zc.exception;

import java.util.Scanner;

public class TestMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            int row = 3, col = 5;
            int input = sc.nextInt();
            if (input == 1)
            {
                row = sc.nextInt();
                print(row, 5);
            }
            else if (input == 2)
            {
                col = sc.nextInt();
                print(row, col);
            }
        }

    }

    public static void print(int row, int col)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                if (i == row && j == col)
                {
                    System.out.print("+ ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
