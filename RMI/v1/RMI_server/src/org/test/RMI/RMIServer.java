package org.test.RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import org.test.Server.Hello;
import org.test.exp.Message;

public class RMIServer {
    public class RemoteHelloWorld extends UnicastRemoteObject implements Hello {
        protected RemoteHelloWorld() throws RemoteException {
            super();
        }
        @Override
        public String hello(Message msg) throws RemoteException {
            System.out.println("call from");
            return msg.getMsg();
        }
    }

    private void start() throws Exception {
        RemoteHelloWorld h = new RemoteHelloWorld();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://127.0.0.1:1099/Hello", h);
    }

    public static void main(String[] args) throws Exception {
        new RMIServer().start();
    }
}