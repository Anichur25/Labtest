package Labtest;

import java.net.*;

public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException{
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("www.tplink.net");
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);

    }

}