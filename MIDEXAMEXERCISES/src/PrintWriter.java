import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.PrintWriter pw = new java.io.PrintWriter("file6.txt");
        String data= "my name is miretu jaleta chala ";
        String data2= "my name is miretu jaleta chala ";
        pw.println(data);
        pw.println(data2);
        pw.close();

    }
}
