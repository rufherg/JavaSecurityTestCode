package org.test.exp;

import java.io.Serializable;

public class Message implements Serializable {
    private String msg;
    public String getMsg(){
        System.out.println("Msg:" + msg);
        return msg;
    }
    public void setMessage(String msg){
        this.msg = msg;
    }
}