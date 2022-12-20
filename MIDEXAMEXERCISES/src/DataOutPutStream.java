import java.io.*;
public class DataOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("src/file2.txt",true);
        DataOutputStream data = new DataOutputStream(file);
        data.writeBytes("mire");
        //data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}  