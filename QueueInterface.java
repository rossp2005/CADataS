/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

/**
 *
 * @author Ross
 */
public interface QueueInterface { 
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public void enqueue(int priorityKey, patient patient);
    public patient dequeue();
    public String printQueue();
}
