package pakka;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPServer {
    private static DatagramSocket serverSocket;

	public static void main(String args[]) throws Exception {
    	
        serverSocket = new DatagramSocket(5000);
        
        byte[] receiveData = new byte[1024];
        
        byte[] sendData = new byte[1024];
        
        while (true) {
        	
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            
            
            serverSocket.receive(receivePacket);
            
            
            String radiusStr = new String(receivePacket.getData());
            
            
            double radius = Double.parseDouble(radiusStr.trim());
            
            
            double area = Math.PI * radius * radius;
        
           
            String areaStr = String.valueOf(area); // Format area to two decimal places
            
            
            InetAddress IPAddress = receivePacket.getAddress();
            
            
            int port = receivePacket.getPort();
            
            
            sendData = areaStr.getBytes();
            
            
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            
            
            serverSocket.send(sendPacket);
            
            
            System.out.println("Received radius: " + radius);
            
            
            System.out.println("Calculated area: " + area);
            
            
            System.out.println("Sent area: " + areaStr + "\n");
            
            
        }
    }
}

