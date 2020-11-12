/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Александра
 */
public class доп5 {

    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вводимых элементов:");
        int n = scan.nextInt();
        List list = new ArrayList();

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(0, s);
        }
        System.out.println("Первоначальный список:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println("Неповторяющиеся элементы:" + set);
    }

}
