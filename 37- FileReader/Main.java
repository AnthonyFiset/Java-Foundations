import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // FileReader = read the contents of a file as a stream of characters.
        //              One by one read() returns an int value which contains the byte value. When read() returns -1, there is no more data to be read.

        try {
            FileReader reader = new FileReader("art.txt");

            //Using read()

            int data = reader.read();

            //Contuining reading the file as long as it does not reach -1

            while(data != -1) {
                //Making sure the int value is converted to char
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}