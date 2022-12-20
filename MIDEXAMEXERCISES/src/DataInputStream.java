import java.io.*;

public class DataInputStream {
    public static void main(String[] args) throws IOException {
        //this is more and more about datainputstream in java
//        DataInputStream is a byte stream class which is used to perform reading operation
//        rom any input device like keyboard, file, etc. Java DataInputStream class
//        allows an application to read primitive data from the input stream in a machine-independent way.
        java.io.DataInputStream  dis = new java.io.DataInputStream(System.in);
        System.out.println("Enter your name: ");
        String name = dis.readLine();
        System.out.println("my name is "+name);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(dis.readLine());
        System.out.println("Your agbe is "+age);


    }
}
