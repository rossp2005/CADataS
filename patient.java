/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

import java.util.Map;

/**
 *
 * @author Ross
 */
public class patient implements Comparable<patient> {
   
    int age;  
    String fullName, doctorInfo, urgency;
    boolean hospitalPatient; 

    public patient(String fullName, int age, String urgency, String doctorInfo, boolean hospitalPatient) {
        this.fullName = fullName;
        this.age = age;
        this.urgency = urgency;
        this.doctorInfo = doctorInfo;
        this.hospitalPatient = hospitalPatient;
    }

    @Override
    public int compareTo(patient other) {
        Map<String, Integer> urgencyScale = Map.of("urgent", 3, "medium", 2, "low", 1);

        if (!this.urgency.equals(other.urgency)) {
            return Integer.compare(urgencyScale.get(other.urgency), urgencyScale.get(this.urgency));
        }
        if (this.age != other.age) {
            return Integer.compare(other.age, this.age);
        }
        return Boolean.compare(other.hospitalPatient, this.hospitalPatient);
    }

    @Override
    public String toString() {
        return fullName + " (Priority: " + urgency + ", Age: " + age + ", Hospital: " + hospitalPatient + ")";
    }
}

