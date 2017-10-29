/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._a1;

import java.io.File;

/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 234278
 * Name: #NurSyammila
 */

public class Assignment1RT {

     public static void main(String[] args) {

        File baca = new File("C:\\Users\\Win8\\Documents\\NetBeansProjects\\234278_A2\\Assignment1Test");

        CountFile i = new CountFile();
        int f = i.countFile(baca);

        CountIssue j = new CountIssue(baca);

        System.out.println("Number of java file = " + f);
        System.out.println("Number of Issue = " + j.count);
    }
    
}
