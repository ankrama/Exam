package org.itstep;

import java.io.File;


// TODO: было бы классно сделать базовый класс или интерфейс
public class Dir {

    public void perform() {

        //File parentDir = new File(".");
        File parentDir = new File(System.getProperty("user.dir"));
        for (File f : parentDir.listFiles()) {
            if (f.isDirectory()) {
                System.out.printf("[DIR]          %-10s%n", f.getName());
            } else {
                System.out.printf("%-15d%-10s%n", f.length(), f.getName());
            }
        }

    }
}


