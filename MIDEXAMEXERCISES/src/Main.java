import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        //fileinputstream=> used to read content of specified file byte by byte
        //it extends inputstream java class
        try {
            FileInputStream fis = new FileInputStream("src/file1.txt");
            int ch;
            while((ch = fis.read())!=-1){
                System.out.println((char) ch);
                //read the next byte
                //ch = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

