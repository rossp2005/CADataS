/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

import java.util.ArrayList;

/**
 *
 * @author Ross
 */
public class DeletedPatients implements StackInterface {
    private ArrayList<Object> theStack;
    private final int MAX_SIZE = 5;

    public DeletedPatients() {
        theStack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    public boolean isFull() {
        return theStack.size() >= MAX_SIZE;
    }

    @Override
    public void push(Object newItem) {
        if (isFull()) {
            theStack.remove(theStack.size() - 1); // Remove oldest patient when ful
        }
        theStack.add(0, newItem); // Add new patient to top
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            return theStack.remove(0); // Remove last added 
        }
        return "No deleted patients available.";
    }

    @Override
    public int size() {
        return theStack.size();
    }

    public void emptyStack() {
        theStack.clear();
    }

    @Override
    public String displayStack() {
        if (isEmpty()) {
            return "No deleted patients available.";
        }
        StringBuilder sb = new StringBuilder("Deleted Patients:\n");
        for (Object p : theStack) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Object peek() {
        if (!isEmpty()) {
            return theStack.get(0); // Return the last patient
        }
        return "No deleted patients available.";
    }
}
