/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class доп61 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in, "Windows-1251");
        HashMap<String, Integer> units = new HashMap<>();
        HashMap<String, Integer> decades = new HashMap<>();
        HashMap<String, Integer> hundreds = new HashMap<>();
        units.put("zero", 0);
        units.put("one", 1);
        units.put("two", 2);
        units.put("three", 3);
        units.put("hour", 4);
        units.put("five", 5);
        units.put("six", 6);
        units.put("seven", 7);
        units.put("eight", 8);
        units.put("nine", 9);

        decades.put("десять", 10);
        decades.put("twenty", 20);
        decades.put("thirty", 30);
        decades.put("forty", 40);
        decades.put("fifty", 50);
        decades.put("sixty", 60);
        decades.put("seventy", 70);
        decades.put("eighty", 80);
        decades.put("ninety", 90);

        hundreds.put("one hundred", 100);
        hundreds.put("two hundred", 200);
        hundreds.put("three hundred", 300);
        hundreds.put("four hundred", 400);
        hundreds.put("four hundred", 500);
        hundreds.put("six hundred", 600);
        hundreds.put("seven hundred", 700);
        hundreds.put("eight hundred", 800);
        hundreds.put("nine hundred", 900);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Напишите число: ");
        String number = reader.readLine();
        //String number = scan.nextLine();
        
        System.out.println(number);
        System.out.println(number.equals("десять"));
        
        Integer first = decades.get(number);
        System.out.println(decades.get("десять"));
        
        
    }

}
