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
public class Newлаб32 {
    public static void main(String[] args) { 
Scanner in = new Scanner(System.in); 
boolean isException; 

//Ввод размерности матрицы с обработкой исключения 
String input; 
int m = 1; 
int n = 1; 
int[][] matrix = new int[0][0]; 
do { 
isException = false; 
try { 
System.out.print("Введите число строк матрицы: "); 
input = in.nextLine(); 
m = Integer.parseInt(input); 
System.out.print("Введите число столбцов матрицы: "); 
input = in.nextLine(); 
n = Integer.parseInt(input); 
matrix = new int[m][n]; 
} catch (NumberFormatException ex) { 
System.out.println("Вы ввели строку или не целое число! Повторите ввод. \n"); 
isException = true; 
} 
} while (isException); 

//Ввод элементов матрицы 
//Обработка исключений: ввод не целого числа или строки, отсутствие чётного элемента 
int max = 0; 
int maxIndex = 0; 
boolean isAllOdd; 
do { 
isException = false; 
isAllOdd= true; 
try { 
System.out.println("Последовательно введите элементы матрицы (целые числа):"); 
for (int i = 0; i < m; i++) 
for (int j = 0; j < n; j++) { 
input = in.nextLine(); 
matrix[i][j] = Integer.parseInt(input); 
} 

//Поиск хотя бы одного чётного элемента матрицы 
for (int i = 0; i < m; i++) { 
for (int j = 0; j < n; j++) { 
if (matrix[i][j] % 2 == 0) { 
max = matrix[i][j]; 
maxIndex = j; 
isAllOdd = false; 
break; 
} 
} 
if (!isAllOdd) break; 
} 
if (isAllOdd) throw new Exception(); 
} catch (NumberFormatException ex) { 
System.out.println("Вы ввели строку или не целое число! Повторите ввод. \n"); 
isException = true; 
} catch (Exception ex) { 
System.out.println("В матрице нет ни одного чётного числа! Повторите ввод. \n"); 
isException = true; 
} 
} while (isException); 

//Поиск максимального чётного элемента и номера его столбца 
for (int i = 0; i < m; i++) { 
for (int j = 0; j < n; j++) { 
if (matrix[i][j] > max && matrix[i][j] % 2 == 0) { 
max = matrix[i][j]; 
maxIndex = j; 
} 
} 
} 

//Вывод всей матрицы 
System.out.println("Матрица:"); 
for (int i = 0; i < m; i++) { 
for (int j = 0; j < n; j++) { 
System.out.printf("%-3d ", matrix[i][j]); 
} 
System.out.println(); 
} 

//Вывод столбца с максимальным чётным элементом 
System.out.println("Столбец с максимальным чётным элементом:"); 
for (int i = 0; i < m; i++) System.out.println(matrix[i][maxIndex]); 
} 
} 