package org.itstep;

import java.io.File;

public class Pwd {
    public static void main(String[] args) {



    }
    File parentDir = new File(System.getProperty("user.dir"));
    public void abspath(){
        System.out.println(parentDir.getAbsolutePath());
    }

}
