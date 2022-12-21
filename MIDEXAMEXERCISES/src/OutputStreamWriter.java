import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriter {
    public static void main(String[] args) throws IOException {
//        The OutputStreamWriter class of the java.io package can be used to convert data in
//        character form into data in bytes form. It extends the abstract class Writer. The OutputStreamWriter
//        class works with other output streams. It is also known as a bridge between byte streams and character streams.
//                This is because the OutputStreamWriter converts its characters into bytes.
        FileOutputStream fos = new FileOutputStream("file7.txt");
        java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter(fos);
        osw.write("my name is miretu jaleta chala futasa kasa miju ode shumakar");
        osw.close();
        fos.close();
        System.out.println("succefully");

    }
}
