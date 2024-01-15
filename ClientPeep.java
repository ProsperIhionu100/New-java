import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientPeep {

    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    // constructor to put ip address and port
    public ClientPeep(String address, int port){
        try {
            System.out.println("Try Connecting.......");
            socket = new Socket(address, port);
            System.out.println("Connection Successful");

            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException u) {
            System.out.println(u);

        }
        catch(IOException i) {
            System.out.println(i);

        }
        //String to read messages from input
        String msg = "";

        while(!msg.equals("end")) {
            try {
                msg = input.readUTF;
                out.writeUTF(msg);
            }
            catch(IOException i) {
                System.out.println(i);
            }
        }
        try {
            input.close();
            out.close();
            socket.close();
        }
        catch(IOException i) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ClientPeep cp = new ClientPeep("127.0.0.1", 5000);
    }
}