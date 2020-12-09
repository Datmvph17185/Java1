/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class demo2 {

    public static void main(String[] args) {
        List<Integer> listofAge = new ArrayList<>();
        listofAge.add(23);
        listofAge.add(25);
        listofAge.add(93);
        listofAge.add(44);

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        listofAge.forEach((counter) -> {
            System.out.println(counter);
        });
        /* Sort statement*/
        Collections.sort(listofAge);
        /* Sorted List*/
        System.out.println("After Sorting:");
        listofAge.forEach((counter) -> {
            System.out.println(counter);
        });
        System.out.println("Đảo ngược");
        Collections.reverse(listofAge);
        listofAge.forEach((x) -> {System.out.println(x);});
    }
}
