//A datagram is an independent, self-contained message sent over the network whose arrival, arrival time, and content are not guaranteed.

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class MeetClient {
    public static void main(String[] args) {
        System.out.println("--------------UDP Client Connection---------------");
        Scanner sc = new Scanner(System.in);
        try {
            DatagramSocket ds = new DatagramSocket(); //LINK
            InetAddress ip = InetAddress.getLocalHost(); //IP
            byte buf[] = null; //to hold byte of input from client

            while (true) {
            System.out.println("Client Side :");

            String inp = sc.nextLine(); //RECEIVING INPUT - A boy
            buf = inp.getBytes(); 
            // inp.length(); //5
            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 
            1234); 
            ds.send(DpSend); 
            // break the loop if user enters "end"
            if (inp.equals("end"))
                break;
            }
        }
        catch(Exception e){
            System.out.println("Exception Arised:"+e.getMessage());
        }
    }
}
