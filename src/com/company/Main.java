package com.company;

public class Main
{

    public static void main(String[] args)
    {

       task83();
    }
    //Известна масса каждого из 12 предметов. Определить массу самого тяжёлого предмета.
    private static void task83() {
        int n = 12, max = 0;
        System.out.println("Масса каждого из предметов: ");


        for (int i = 0; i < n; i++) {

            int b = (int) (Math.random() * 100 + 1);
            System.out.println("Предмет номер "+(i+1)+",масса:  "+b);
            if (b>max)
            {
                max=b;
            }

        }
        System.out.println("\nВыводим массу самого тяжелого предмета: " + max);
    }
    }

