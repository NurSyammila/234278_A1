package com.mycompany._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 Semester: A171 
 * Course: STIW3054 
 * Group: A 
 * Task: Assignment 1 
 * Matric: 234278
 * Name: #NurSyammila
 */
public class CountIssue {

   public String[] listFile;
 
    public CountIssue(File f) {

        Collection<File> file = new ArrayList();
        set(f, file);
        Collection<File> q = file;
        listFile = filterjava(q);
        Count(listFile);

    }

    static void set(File file, Collection<File> all) {
        File[] x = file.listFiles();
        if (x != null) {
            for (File y : x) {
                all.add(y);
                set(y, all);
            }
        }
    }

    static String[] filterjava(Collection<File> a) {
        LinkedList<String> b = new LinkedList();
        Iterator<File> c = a.iterator();
        File d;
        while (c.hasNext()) {
            d = c.next();
            if (d.getName().endsWith(".java")) {
                b.add(d.getAbsolutePath());

            }
        }
        String[] list = new String[b.size()];
        for (int i = 0; i < b.size(); i++) {
            list[i] = b.get(i);
        }
        return list;
    }

       public int count;

    public void Count(String[] list) {
        for (int i = 0; i < list.length; i++) {
            try (BufferedReader read = new BufferedReader(new FileReader(list[i]))) {
                String rLine;

                while ((rLine = read.readLine()) != null) {
                    if (rLine.contains("public static void main")) {
                        count++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error, file cannot be read.");

            }

        }
    }
}

