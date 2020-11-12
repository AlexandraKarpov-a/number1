/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new1;
import java.util.Scanner;
/**
 *
 * @author Александра
 */
public class NewClass {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c, D, x1, x2;
       
        System.out.println("Введите числа a, b, c");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        D= (b*b)-(4*a*c);
        if (D<0) {
            System.out.println(" Нет решений");}
            else { 
            x1=((-b+ Math.sqrt(D))/(2*a));
            x2=((-b- Math.sqrt(D))/(2*a));
            System.out.println(x1);
            System.out.println(x2);
                    
        }   
               
    }
    
}
