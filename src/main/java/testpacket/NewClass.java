/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpacket;
import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class NewClass {
    public static void main ( String[] args){
        Scanner in = new Scanner( System.in);
        Double ab,ac,bc;
        Double [][]arr = new Double[3][3];
        for (int i=0; i<3; i++) {
            System.out.println("Введите число i " + (i+1)+ ": ");
            for (int j =0; j<3; j++) {
                System.out.println("Введите число j" + (i+1)+ ": ");
                arr[i][j]= in.nextDouble();    
        }
        }
        in.close();
        ab = Math.sqrt((arr[1][0]-arr[0][0])*(arr[1][0]-arr[0][0])+(arr[1][1]-arr[0][1])*(arr[1][1]-arr[0][1])+(arr[1][2]-arr[0][2])*(arr[1][2]-arr[0][2]));
        bc = Math.sqrt((arr[2][0]-arr[1][0])*(arr[2][0]-arr[1][0])+(arr[2][1]-arr[1][1])*(arr[2][1]-arr[1][1])+(arr[2][2]-arr[1][2])*(arr[2][2]-arr[1][2]));
        ac = Math.sqrt((arr[2][0]-arr[0][0])*(arr[2][0]-arr[0][0])+(arr[2][1]-arr[0][1])*(arr[2][1]-arr[0][1])+(arr[2][2]-arr[0][2])*(arr[2][2]-arr[0][2]));
        if ((ab < bc) && (ab < ac))  {
            System.out.println(" Наименьшее расстояние между точками A и B");
        }
        else if (( ac < ab) && (ac < bc)) {
            System.out.println("Наименьшее расстояние между точками А и С");
        }
        else {
            System.out.println("Наименьшее расстояние между точками В и С");
        }
}
}
