public class File {
    public static void main(String[] args) {
        //This class is used to get the properties of a file like what is the length of the file, what is the path
        // of the file, whether it is a file or not,
        // readable or not, writable or not, existed or not, etc. Using File class we can also delete the file
        // and rename the file.File class is not meant for reading the file or writing the file
        java.io.File file = new java.io.File("file3.txt");
        if(file.exists()){
            System.out.println("absolute path: "+file.getAbsolutePath());
            System.out.println("file path: "+file.getPath());
            System.out.println("Wether readable: "+file.canRead());
            System.out.println("Wether writeable: "+file.canWrite());
            System.out.println("wether exists: "+ file.exists());
            System.out.println("Length of file: "+ (file.length())/(1024) +"kb");
            System.out.println("welcome you have successfully completed!");
        }
        else{
            System.out.println("Sorry, there is no such file or directory!");
        }

    }
}
