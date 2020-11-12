/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;

import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class доп6 {
    public static final String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    public static final String[] TENS = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    public static final String[] THOUSAND = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            System.out.print("Число от 0 до 999: ");
            if (!scanner.hasNextInt()) {
                break;
            }
            int number = scanner.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("Попробуй ещё раз...");
                continue;
            }
            if (number < 20) {
                System.out.println(BELOW_TWENTY[number]);
            }
            if (number < 100) {
                int high = number / 10;
                int low = number % 10;
                String text = TENS[high];
                if (low != 0) {
                    text = text + " " + BELOW_TWENTY[low];
                }
                System.out.println(text);
            }
            if (number == 100) {
                System.out.println(THOUSAND[0]);
            }
            if (number > 100) {
                int high1 = number / 100;
                int low1 = number % 100;
                String text = THOUSAND[high1];
                if (low1 != 0) {
                    if (low1 < 100) {
                        int high2 = low1 / 10;
                        int pow = low1 % 10;
                        String text1 = TENS[high2];
                        text = text + " " + text1 + " " + BELOW_TWENTY[pow];
                    }
                    if (low1 < 20) {
                        text = text + " " + BELOW_TWENTY[low1];
                    }
                }
                System.out.println(text);
            }
        }
        scanner.close();
    }

}
