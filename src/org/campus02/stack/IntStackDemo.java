package org.campus02.stack;

import org.campus02.stack.stackexceptions.StackEmptyException;
import org.campus02.stack.stackexceptions.StackFullException;

public class IntStackDemo {

    public static void main(String[] args) {
        IntStack intStack = new IntStack(2);
        try {
            //int result = intStack.pop();
            //System.out.println(result);
            intStack.push(4);
            intStack.push(6);
            intStack.push(8);
            intStack.push(8);
            intStack.push(8);
            intStack.push(8);
            intStack.push(8);
            intStack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Mein Stack ist leer - reagiere dementsprechend");
            e.printStackTrace();
        } catch (StackFullException e) {
            System.out.println("Mein Stack ist voll - bitte reagiere");
            e.printStackTrace();
        }
    }
}
