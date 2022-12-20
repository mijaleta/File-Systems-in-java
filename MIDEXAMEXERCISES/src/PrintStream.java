import java.io.FileOutputStream;
import java.io.IOException;

public class PrintStream {
    public static void main(String[] args) throws Exception{
        //he PrintStream class automatically flushes the data so there is no need
        // to call the flush() method. Moreover, its methods don’t throw IOException.
        FileOutputStream fos = new FileOutputStream("file5.txt");
        java.io.PrintStream ps = new java.io.PrintStream(fos);
        ps.println("My name si miretu jaleta chala ");
        ps.println("my ae is "+45);
        fos.close();
        ps.close();



    }
}
