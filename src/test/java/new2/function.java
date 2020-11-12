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

 public class function {
    public static int func(int n){  
       int i; 
        i = 0;
       while( n > 0){
         n = n/10;
         i++;
       }
        return i; 
    }
    public static void main (String[] args){
       int k1, k2, n;
       Scanner in = new Scanner(System.in);
       System.out.println(" Введите число n");
       n = in.nextInt();
       k1 = func(n) ;
      n = n/2;
       k2 = func(n) ;
       if (k1 == k2){
       System.out.println("Количество порядков не изменилось");
       }
       else {
           System.out.println("Количество порядков изменилось");
       }  
}
}
  