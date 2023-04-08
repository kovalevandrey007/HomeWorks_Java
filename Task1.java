package org.example;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        LinkedList<String> ln = new LinkedList<String>();
        System.out.printf("Введите строку: \n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            ln.addFirst(name);
            System.out.println("Введены: \n" + ln);

            try {
                name = String.valueOf(Integer.parseInt(ln.get(0)));
                System.out.println("\nЭто не строка! Введите строковое значение: ");
                ln.removeFirst();

            } catch (NumberFormatException e) {

                if (name.contains("print")) {
                    ln.removeFirst();
                    Collections.swap(ln, 0, ln.size() - 1);
                    System.out.println('\n' + "Результат с print: \n" + ln);

                } else if (name.contains("revert")) {
                    ln.removeFirst();
                    ln.remove(0);
                    System.out.println('\n' + "Результат с revert: \n" + ln);
                }
            }
        }
    }
}





