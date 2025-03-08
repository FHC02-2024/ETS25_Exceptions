package org.campus02;

public class ExceptionsDemo {


    public static void main(String[] args) {
        System.out.println("Programm Start");
        // exception syntax
        try {
            // code teil (programm code)
            // hier können mögliche exceptions geworfen werden
            System.out.println("Dividieren");
            System.out.println(divide(3, 0));
            System.out.println(divide(2, 1));
            System.out.println(divide(3,3));
        } catch (Exception e) {
            System.out.println("oje, fehler ist passiert");
        } finally {
            System.out.println("Finally: Aufräumen");
            System.out.println("Kühlschrank schließen");
        }


        try {
            callDoSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Programm Ende");
    }

    private static double divide(int a, int b) {
        return a / b;
    }

    private static void callDoSomething() throws Exception {
        doSomething();
    }

    private static void doSomething() throws Exception {
        System.out.println("Do something");
        throw new Exception("Fehler");
    }
}
