package com.company;

public class Main
{

    public static void main(String[] args)
    {

       //task83();
       //task108();
       task33();
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

    //Сколько можно купить быков, коров и телят, платя за быка 7000 грн., за корову — 3000 грн., а за телёнка — 1000 грн., если на 100000 грн. надо купить 100 голов скота? Для решения задачи составить алгоритм.
    private static void task108()
    {
    int bull=7000,cow=3000,calf=1000,sum=100000,sum2=100;
        System.out.println("Чтобы получить "+sum2 +" голов скота , мы должны купить "+sum/calf+" телят.");
    }

    //Вычислить (1 + sin 0,1)(1 + sin 0,2) ... (1 + sin 10).
    private static void task33()
    {
    float result=1;
        for (float i = (float) 0.1; i <= 10 ; i+=0.1)
        {
            System.out.println (( 1 + (float)Math.sin(i) ));
            result*=(1 + (float)Math.sin(i));
        }
        System.out.println("\nВыводим результат: "+result);
    }

    }

