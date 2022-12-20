import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamReader {
    public static void main(String[] args) throws IOException {
//        The InputStreamReader class of the java.io package can be used to convert data
//        in bytes into data in characters. It extends the abstract class Reader. An InputStreamReader
//        is a bridge from byte streams to character streams: It reads bytes and decodes them into characters
//        using a specified charset. The charset that it uses may be specified by name
//        or maybe given explicitly, or the platform’s default charset may be accepted.
        FileInputStream fis = new FileInputStream("src/file1.txt");
        java.io.InputStreamReader isr = new java.io.InputStreamReader(fis);
        int data;
        while((data=isr.read())!=-1){
            System.out.print((char)data);

        }
    }
}
