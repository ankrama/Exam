package org.itstep;

public class Cd {

    public static void main(String[] args) {
        System.out.println(System.setProperty("user.dir", "C:\\Users\\User\\Desktop\\aktirf"));
        System.out.println(System.getProperty("user.dir"));
    }

    public void changeDir (String inDir){

        System.setProperty("user.dir", inDir);

    }
}
