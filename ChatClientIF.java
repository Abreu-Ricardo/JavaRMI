
import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public interface ChatClientIF extends Remote{
    void retrieveMessage(String message) throws RemoteException;
    
}