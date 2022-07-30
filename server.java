import java.io.*;
import java.net.*;
public class server {
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(7777);
        Socket s= ss.accept();
        System.out.println("Connected......");
        FileInputStream fin= new FileInputStream("send.txt");
        DataOutputStream dout= new DataOutputStream(s.getOutputStream());
        int r;
        while((r=fin.read())!=-1)
        {
            dout.write(r);
        }
        System.out.println("\nFile Transfer Completed");
        s.close();
        ss.close();
    }
    
}
