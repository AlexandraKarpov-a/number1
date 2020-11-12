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
public class lab2{
   public static void main (String[] args){
 Scanner in = new Scanner(System.in);
double a, y;
int x1 = 1;
int x2 = -1;
System.out.println("Введите число a:");
a= in.nextDouble();
if (a >= x2 & a <= x1){
    System.out.println("y =" +a*a);
}
else {
    System.out.println("Вне области графика");
}
}
}
 
