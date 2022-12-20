import java.io.FileInputStream;
class FileInputStreamDemo
{
    public static void main (String[]args)
    {
        try
        {
            FileInputStream fis = new FileInputStream ("input.txt");

            System.out.println ("Data in the file: ");

            // Reads the first byte
            int ch = fis.read ();

            while (ch != -1)
            {
                System.out.print ((char) ch);

                // Reads next byte from the file
                ch = fis.read ();
            }
            fis.close ();
        }
        catch (Exception e)
        {
            e.getStackTrace ();
        }
    }
}