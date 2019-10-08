package org.itstep;

import java.io.File;


// TODO: было бы классно сделать базовый класс или интерфейс
public class Pwd {
    public static void main(String[] args) { // TODO: зачем здесь этот метод?



    }
    File parentDir = new File(System.getProperty("user.dir"));
    public void abspath(){
        System.out.println(parentDir.getAbsolutePath());
    }

}
