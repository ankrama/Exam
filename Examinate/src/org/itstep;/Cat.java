package org.itstep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


// TODO: было бы классно сделать базовый класс или интерфейс
public class Cat {

    public static void main(String[] args) {// TODO: зачем здесь этот метод?
        System.out.println(textOut("byhart.txt"));
    }
    public static String textOut(String fileName) {
        String content = "";
        try {
            InputStream file = new FileInputStream(fileName);
            Scanner scanner = new Scanner(file);
            String line = "";

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                content += line + "\n";
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return content;
    }
}


