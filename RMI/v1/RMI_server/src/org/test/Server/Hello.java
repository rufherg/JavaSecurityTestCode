package org.test.Server;

import org.test.exp.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String hello(Message msg) throws RemoteException;
}