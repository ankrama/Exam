package org.itstep;


// TODO: было бы классно сделать базовый класс или интерфейс
public class Cd {

    public static void main(String[] args) { // TODO: зачем здесь этот метод?
        System.out.println(System.setProperty("user.dir", "C:\\Users\\User\\Desktop\\aktirf")); // TODO: что за хардкод?
        System.out.println(System.getProperty("user.dir"));
    }

    public void changeDir (String inDir){

        System.setProperty("user.dir", inDir);

    }
}
