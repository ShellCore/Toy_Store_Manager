package com.shellcore.java.toystoremanager;

import java.util.*;

/**
 * Created by Cesar. 05/06/2017.
 */
public class Main {

    public static void main(String[] args) {

        String [] toys = new String [9];
        toys[0] = "Buzz Lightyear";
        toys[1] = "Sheriff Woody";
        toys[2] = "Mr. Potato Head";
        toys[3] = "Barbie";
        toys[4] = "Troll doll";
        toys[5] = "Tonka Truck";
        toys[6] = "Elmo";
        toys[7] = "Big bird";
        toys[8] = "Cookie Monster";

        //Make a list of lists or hashmap to classify the toys.
        //Then sort the list of lists or hashmap ascendingly
        //Print each value

        // Creating the list of lists
        Map<String, String[]> classifiedToys = new HashMap<>();
        classifiedToys.put("Boy", new String[] {toys[0], toys[1], toys[4]});
        classifiedToys.put("Girl", new String[] {toys[3]});
        classifiedToys.put("Enfant", new String[] {toys[2], toys[5]});
        classifiedToys.put("Sesame Street", new String[] {toys[6], toys[7], toys[8]});

        // Sorting each list
        classifiedToys.forEach((key, unsortedArray) -> {
                    List<String> orderedList = Arrays.asList(unsortedArray);
                    Collections.sort(orderedList);
                    String[] orderedArray = (String[]) orderedList.toArray();
                    classifiedToys.put(key, orderedArray);
        });

        // Printing the sorted lists
        classifiedToys.forEach((key, value) -> {
            System.out.println(key + ":");
            for (String element :
                    value) {
                System.out.println("\t" + element);
            }
        });
    }
}
