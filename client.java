import java.io.*;
import java.net.*;
public class client {
    public static void main(String args[]) throws Exception{
        Socket s= new Socket("169.254.51.187",7777);
        if(s.isConnected()){
            System.out.println("onnected to server");
        }
        FileOutputStream fout=new FileOutputStream("received.txt");
        DataInputStream din= new DataInputStream(s.getInputStream());
        int r;
        while((r=din.read())!=-1){
            fout.write((char)r);
        }
        s.close();
    }
    
}
