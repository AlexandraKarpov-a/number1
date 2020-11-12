/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new3;
import java.util.Scanner;
/**
 *
 * @author Александра
 */
public class NewClass {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
System.out.println("Введите размер");
int k= in.nextInt();

int arr[][] = new int[k][k];
for (int i=0; i<k; i++){
System.out.println("Введите число" + (i+1)+":");
for (int j=0; j<k; j++) {
System.out.println("Введите число" +(j+1)+":");
arr[i][j]= in.nextInt();
}
}
in.close();
System.out.println("Содержимое массива");
for(int i=0; i<k; i++){
for(int j=0; j<k; j++){
System.out.printf(arr[i][j] + " ");

}
System.out.println();
}
int sod;
for(int i=0; i<k; i++){ 
for (int j=0; j<k; j++){
if (i< k/2 && i<j && j<k-i-1) {
sod= arr[i][j];
arr[i][j]=arr[k-i-1][j];
arr[k-i-1][j]=sod;

}
}
}
System.out.println("Новая матрица");
for(int i=0; i<k; i++){
for(int j=0; j<k; j++){
System.out.printf( arr[i][j] + " ");
}
System.out.println();
}

}

}
    

