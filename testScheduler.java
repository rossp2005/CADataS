/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


/**
 *
 * @author Ross
 */
public class testScheduler implements QueueInterface {
    private ArrayList<patient> theQueue;
    
    public testScheduler() {
        theQueue = new ArrayList<>();
    }

    @Override
    // Check if the qeue is empty
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    @Override
    // Get the number of patients in the qeue
    public int size() {
        return theQueue.size();
    }

    @Override
    // Retrieve the next patient
    public Object frontElement() {
        if (!theQueue.isEmpty()) {
            return theQueue.get(0);
        }
        return null;
    }

    @Override
    // Adds patient to queue and makes ssure sorting by urgency
    public void enqueue(int priorityKey, patient newItem) {
        int index = 0;
        for (; index < theQueue.size(); index++) {
            if (newItem.compareTo(theQueue.get(index)) < 0) {
                break; // Insert before priority patient
            }
        }
        theQueue.add(index, newItem); // patients inserted in order
    }

    @Override
    // Removes and returns the first patient in the queue 
    public patient dequeue() {
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0);
        }
        return null;
    }

    // Sorts queue so that least urgent patients comes first
    private void sortQueue() {
        Collections.sort(theQueue, (p1, p2) -> p1.compareTo(p2)); // Low to high priority
    }

    // Returns all patients in the qeue must be string
    public String printQueue() {
        if (theQueue.isEmpty()) {
            return "No patients waiting.";
        }
        StringBuilder sb = new StringBuilder("Patients in Queue:\n");
        for (patient p : theQueue) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
