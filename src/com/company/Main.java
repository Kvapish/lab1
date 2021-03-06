package com.company;

public class Main {

    public static void main(String[] args) {

        //task83();
        //task108();
        //task33();
        task133();
        //task58();
    }

    /**
     * Известна масса каждого из 12 предметов. Определить массу самого тяжёлого предмета.
     */
    private static void task83() {
        int n = 12, max = 0;//Создаем переменную в которую записываем количество предметов и переменную max
        System.out.println("Масса каждого из предметов: ");
        for (int i = 0; i < n; i++) //Создаём счетчик
        {
            int b = (int) (Math.random() * 100 + 1);//Создаем рандомные значения в пределах 100
            System.out.println("Предмет номер " + (i + 1) + ",масса:  " + b);//Создаем счётчик для вывода
            if (b > max)//Создаем условие при котором масса предмета больше значения max
            {
                max = b;//Задаем переменной max максимальную массу
            }

        }
        System.out.println("\nВыводим массу самого тяжелого предмета: " + max);//Выводим массу самого тяжелого
    }

    /**
     * Сколько можно купить быков, коров и телят, платя за быка 7000 грн., за корову — 3000 грн., а за телёнка — 1000 грн., если на 100000 грн. надо купить 100 голов скота? Для решения задачи составить алгоритм.
     */
    private static void task108() {
        int bull = 7000, cow = 3000, calf = 1000, sum = 100000, sum2 = 100;//При общем количестве денег в 100000грн , у нас получается только один возможный вариант , если увеличить нашу сумму , то количество вариантов увеличится(150000грн).
        for (int i = 0; i <= sum / bull; i++)//Создаем цыкл в котором переменная i меньше или равняется сумме денег,делённой на стоимость быка
        {
            for (int b = 0; b <= sum / cow; b++)//Создаем цыкл в котором переменная b меньше или равняется сумме денег,делённой на стоимость коровы
            {
                for (int j = 0; j <= sum / calf; j++)//Создаем цыкл в котором переменная j меньше или равняется сумме денег делённой на стоимость телёнка
                {
                    if (i + b + j == sum2 && (i * bull) + (b * cow) + (j * calf) == sum)//Делаем расчет при котором выводим все возможные алгоритмы выполнения
                    {
                        System.out.println("Быков:" + i + " Коров:" + b + " Телят:" + j);//Выводим результат
                    }
                }
            }
        }
    }

    /**
     * Вычислить (1 + sin 0,1)(1 + sin 0,2) ... (1 + sin 10).
     */
    private static void task33() {
        float result = 1;//Создаем переменную и присваиваем ей значение 1
        for (float i = 0.1f; i <= 10f; i += 0.1f)//Создаем цыкл
        {
            System.out.println((1 + (float) Math.sin(i)));//Выводим сумму каждой скобки по отдельности
            result *= (1 + (float) Math.sin(i));//Перемножаем результаты между собой
        }
        System.out.println("\nВыводим результат: " + result);//Выводим результат
    }

    /**
     * Проверить, действительно ли число n^5 + 5n^3 + 4n при любом натуральном n делится на 120.
     */
    private static void task133() {
        int b = 120;//Создаем переменную и присваиваем ей значение 120
        int n = (int) (Math.random() * 100 + 1);//Создаем рандомное значение в диапозоне 100
        double v = Math.pow(n, 5) + (5 * Math.pow(n, 3)) + 4 * n;
        if (v % 120 == 0)//Создаём цыкл
        {
            System.out.println("При значении  n = " + n + " , выражение n^5 + 5n^3 + 4n , делится на цело на 120, результат : " + String.format("%10.5f", (v / 120)) + ".");//Просчитываем выводим результат
        } else {
            System.out.println("При значении n = " + n + " выражение n^5 + 5n^3 + 4n , не делится на цело на 120 .");//Если наше выражение при делении не делится на цело на 120,выводим соответствующие сообщение
        }
    }

    /**
     * Вычислить сумму при х+x^3/3+х^5/5+...х^11/11 при х=2.
     */
    private static void task58() {
        double result = 2;//Создаем переменную и присваиваем ей значение 2
        for (int x = 2; x <= 11; x += 2)//Создаём цыкл
        {
            result += (Math.pow(2, (x + 1))) / (x + 1);//Просчитываем результат
        }
        System.out.println("Сумма данного выражения : " + result);//Выводим результат
    }
}

