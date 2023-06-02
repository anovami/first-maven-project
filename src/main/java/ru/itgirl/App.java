package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите день недели на английском: ");
        String name = in.nextLine();
        if (name.equals("MONDAY")) {
            name = "Понедельник";
        }
        else if (name.equals("TUESDAY")) {
            name = "Вторник";
        }
        else if (name.equals("WEDNESDAY")) {
            name = "Среда";
        }
        else if (name.equals("THURSDAY")) {
            name = "Четверг";
        }
        else if (name.equals("FRIDAY")) {
            name = "Пятница";
        }
        else if (name.equals("SATURDAY")) {
            name = "Суббота";
        }
        else if (name.equals("SUNDAY")) {
            name = "Воскресенье";
        }
        System.out.println(name);
    }
}
