/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class StringObjectt {

    public static void main(String args[]) {
        List<String> listofcountries = new ArrayList<>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Việt Nam");

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        listofcountries.forEach((xx) -> {
            System.out.println(xx);
        });

        /* Sort statement*/
        Collections.sort(listofcountries);

        /* Sorted List*/
        System.out.println("After Sorting:");
        for (String xx : listofcountries) {
            System.out.println(xx);
        }
//        Collections.reverse(listofcountries);
//        for (String counter : listofcountries) {
//            System.out.println(counter);
//        }
    }

}
