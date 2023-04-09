package pakka;


import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String args[]) throws Exception {
    	
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        
        DatagramSocket clientSocket = new DatagramSocket();
        
        InetAddress IPAddress = InetAddress.getByName("localhost");
        
        byte[] sendData = new byte[1024];
        
        
        byte[] receiveData = new byte[1024];
        
        
        System.out.print("Enter the radius of the circle: ");
        
        
        String radiusStr = inFromUser.readLine();
        
        
        sendData = radiusStr.getBytes();
        
        
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);
        
        
        clientSocket.send(sendPacket);
        
        
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        
        
        clientSocket.receive(receivePacket);
        
        
        String areaStr = new String(receivePacket.getData());
        
        
        double area = Double.parseDouble(areaStr.trim());
        
        
        System.out.println("The area of the circle is: " + areaStr);
        
        
        clientSocket.close();
        
        
    }
}


