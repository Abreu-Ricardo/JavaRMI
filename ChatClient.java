
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ChatClient extends UnicastRemoteObject implements ChatClientIF{

    private ChatServerIF chatServer;
    private String name = null;
    private Scene2Controller scene2Controller;

    protected ChatClient(String name, ChatServerIF chatServer, Scene2Controller scene2Controller ) throws RemoteException {
        this.name = name;
        this.chatServer = chatServer;
        this.scene2Controller = scene2Controller;
        chatServer.registerChatClient(this);
    }

    public void retrieveMessage(String message) throws RemoteException {
        // TODO Auto-generated method stub
        this.scene2Controller.displayMessageRetrieved(message);
        
        
    }

//    public void run() {
//        // TODO Auto-generated method stub
//        Scanner scanner = new Scanner(System.in);
//
//        String message;
//        
//        while(true){
//                message = scanner.nextLine();
//            
//
//            try {
//                chatServer.broadcastMessage(name + ":" +message);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}