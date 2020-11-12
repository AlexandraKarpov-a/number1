/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package минмакс;

import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int k, i;
        System.out.println("Введите размерность массива:");
        k = in.nextInt();
        double arr[] = new double[k];
        for (i = 0; i < k; i++) {
            System.out.println("Введите число " + (i + 1) + ":");
            arr[i] = in.nextInt();
        }
        for (i = 0; i < k; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (i = 0; i < k; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}
