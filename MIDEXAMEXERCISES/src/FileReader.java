import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
//        Java FileReader class is used to read data from the file.
//        This is a character stream class that is used to read the file information
//        char by char. It extends the InputStreamReader class.
        java.io.FileReader fr = new java.io.FileReader("src/file2.txt");
        int c ;
        while((c=fr.read())!=-1){
            System.out.print((char)c);
        }
    }
}
