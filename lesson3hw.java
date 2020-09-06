package homepractice;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class lesson3 {

    public static void main(String[] args)
    {
        howmuch();
    }

        public static void howmuch()
        {
            //Объявление сканнера
            Scanner sc = new Scanner(System.in);

            //Установка лимитов случайных чисел
            Random rand = new Random();
            int r = (int)(Math.random()*10);
            int a;
            System.out.println("Загаданно число от 1 до 9. Вы должны отгадать его с трех попыток");




            //Сравнение заданного пользователем числа с выданным рандомайзером

            for (int i = 0; i < 3; i++)
            {
                a=sc.nextInt();

                if (a > r)
                {
                    System.out.println("Ваше значение больше загаданного");
                }
                if (a < r)
                {
                    System.out.println("Ваше значение меньше загаданного");
                }
                if (a == r)
                {
                    System.out.println("Вы угадали! Хорошего дня!");
                    System.out.println("Ещё игру? 1 - Да, 2- нет");
                    a = sc.nextInt();
                    if (a == 1)
                    {
                        howmuch();
                    }
                    else
                    {
                        System.out.println("Всего хорошего!");
                        break;
                    }
                }
                System.out.println("Все попытки неверны");
                System.out.println("Ещё игру? 1 - Да, 2- нет");
                a=sc.nextInt();
                if (a==1)
                {
                    howmuch();
                }
                else
                {
                    System.out.println("Хорошего дня!");
                }
            }

        }
    }



