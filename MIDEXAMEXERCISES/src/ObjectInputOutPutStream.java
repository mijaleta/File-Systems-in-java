import java.io.*;

public class ObjectInputOutPutStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writing parts of object into the file is called serializaion and reading whole object from file is called decerilization
        FileOutputStream fos = new FileOutputStream("file4.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        String name = "Miretu jaleta chala";
        oos.writeObject(name);
        fos.close();
        oos.close();
        FileInputStream fis = new FileInputStream("file4.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        ois.close();
        fis.close();




    }
}
