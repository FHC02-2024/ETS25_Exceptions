package org.campus02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basket {

    public static void main(String[] args) {

        // Zur Demonstration einer Runtime Exception (Unchecked Exception)

        ArrayList<Apple> apples = new ArrayList<>();
        Apple[] apples1 = {new Apple("Gala", 2), new Apple("A", 3)};


        //Collections.sort(apples);

        // Produziere Fehler absichtlich
        Arrays.sort(apples1);

    }
}
