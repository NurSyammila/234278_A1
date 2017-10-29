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
public class CountFile {

    public static int countFile(File dir) {
        int count = 0;

        File[] listFiles = dir.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    count++;
                } else {
                    count += countFile(file);
                }
            }
        }
        return count;
    }
}
