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
public class NewClass1 {
 public static void main ( String[] args){
        Scanner in = new Scanner(System.in);
        int k, m;
        System.out.println("Введите размерность массива");
        m=in.nextInt();
        int [][]arr = new int [m][m];
        for (int i=0; i<m; i++) {
            System.out.println("Введите число i" + (i+1)+ ": ");
            for (int j =0; j<m; j++) {
                System.out.println("Введите число j" + (i+1)+ ": ");
                arr[i][j]= in.nextInt();    
        }
        }
        in.close();
        System.out.println("Содержимое массива");
        for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
         System.out.printf(arr[i][j] + " ");
}
        System.out.println();
}
        System.out.println("Введите число на которое нужно сдвинуть массив");
        k=in.nextInt();
for(int i=0; i<k; i++){
    for(int j=0; j<k; j++){
        arr[i][j]=arr[j-1][i];
       System.out.println(arr[i][j]);
        
    }
}
        
 }   
}
