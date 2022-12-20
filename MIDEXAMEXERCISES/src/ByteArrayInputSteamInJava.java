import java.io.ByteArrayInputStream;

public class ByteArrayInputSteamInJava {
    public static void main(String[] args) {
//       reading byte of array byte by byte in java
        String myName = "Miretu Jaleta Chala ";
        byte arr[] = myName.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        int ch;
        while((ch = bais.read())!=-1){
            System.out.println((char) ch);
            ch = bais.read();
            ch = bais.read();

        }
    }
}
