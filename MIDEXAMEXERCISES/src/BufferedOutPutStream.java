import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStream {
    public static void main(String[] args)  throws IOException {
        FileOutputStream fos = new FileOutputStream("file3.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String fullName = "\nmy name is miretu jaleta chala";
        byte [] name = fullName.getBytes();
        bos.write(name);
        bos.flush();

    }
}
