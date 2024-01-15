import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MeetServerr {
     public static StringBuilder data(byte[] a){
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0){
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }       

     public static void main(String[] args)throws Exception {
        System.out.println("-------- UDP Connection Server --------------");
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];
        DatagramPacket DpReceive = null;
        while (true){
            // Step 2 : create a DatgramPacket to receive the data.
            DpReceive = new DatagramPacket(receive, receive.length);
            // Step 3 : revieve the data in byte buffer.
            ds.receive(DpReceive);
            System.out.println("Client---->>>>>" + data(receive));
            // Exit the server if the client sends "end"
            if (data(receive).toString().equals("end")){
                System.out.println("Client requests end ---------EXITING");
                break;
            }
            // Clear the buffer after every message.
            receive = new byte[65535];
        }
    }


}