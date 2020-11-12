/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class lab4 {

    public static final
            Scanner scan = new Scanner(System.in);

    public static void main(String[] argc) {
        System.out.println("Введите нужный столбец:");
        try {
            int N = scan.nextInt();
            solve(N, fill(10));
        } catch (ArrayIndexOutOfBoundsException nfe) {
            System.out.println(nfe.getMessage() + ":Нет столбца с таким номером");
        } catch (InputMismatchException nfe) {
            System.out.println(nfe.getMessage() + ":Ввод строки вместо числа");
        }
    }

    public static int[][] fill(int N) {
        int[][] arr = new int[N][N];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 20);
                System.out.printf("%-3d ",arr[i][j]);
            }
            System.out.println("");
        }

        return arr;
    }

    public static void solve(int N, int[][] arr) {
        System.out.print("Нужный столбец: ");
        for (int j = 0; j < arr[N].length; j++) {

            System.out.printf("%-3d ",arr[j][N]);
        }
    }

}
