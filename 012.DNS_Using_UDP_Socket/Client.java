import java.net.*;

class Client {

  public static DatagramSocket ds;
  public static byte buffer[] = new byte[1024];

  public static void Myclient() throws Exception {
    while (true) {
      DatagramPacket p = new DatagramPacket(buffer, buffer.length);
      ds.receive(p);
      System.out.println(new String(p.getData(), 0, p.getLength()));
    }
  }

  public static void main(String args[]) throws Exception {
    try {
      InetAddress[] address = InetAddress.getAllByName("localhost");
      for (int j = 0; j < address.length; j++) System.out.println(address[j]);
    } catch (Exception e) {
      System.out.println("Error in accessing local host:  " + e);
    }
    System.out.println("client-press CTRL+C to quit");
    ds = new DatagramSocket(777);
    Myclient();
  }
}
