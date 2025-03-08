package org.campus02.stack;

import org.campus02.stack.stackexceptions.StackEmptyException;
import org.campus02.stack.stackexceptions.StackFullException;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {

        if (pointer == stack.length - 1) {
            throw new StackFullException("Stack ist bereits voll");
        }
        pointer++;
        stack[pointer] = value;
    }

    public int pop() throws StackEmptyException {
        if (pointer == -1) {
            throw new StackEmptyException("Stack ist leer");
        }
        int actualValue = stack[pointer];
        stack[pointer] = 0;
        pointer--;
        return actualValue;
    }
}
