/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class доп51 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int mini = -1;
        int minj = -1;
        int min = Integer.MAX_VALUE;
        System.out.println("Введите количество строк");
        int n = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int m = scan.nextInt();
        int[][] arr = new int[n + 1][m + 1];
        System.out.println("Исходный массив: ");
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                arr[i][j] = (int) (Math.random() * 99);
                if ((arr[i][j] < min) && (arr[i][j] % 2 == 0)) {
                    min = arr[i][j];
                    mini = i;
                    minj = j;
                }
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println("");
        }
        List list = new ArrayList();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (arr[i][j] % min == 0) {
                    list.add(0, arr[i][j]);
                }
            }
        }
        System.out.println("элементы, которые при делении на минимальный четный элемент имеют остаток равный нулю:" + list);
        System.out.println("индекс минимального четного элемента:" + mini + "," + minj);
        System.out.println("значение минимального четного элемента:" + min);
    }
}
