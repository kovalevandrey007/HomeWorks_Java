package HomeWork2;

import java.util.Scanner;

import static java.lang.Boolean.*;

public class Task1 {
    public static void main(String[] args) {
        String String, reverse="";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку чисел: ");
        String = in.nextLine();
        int length = String.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + String.charAt(i);
        System.out.println((Integer.parseInt(String) == Integer.parseInt(reverse) ? "Является полиндромом" : "Не является полиндромом"));
    }
}
