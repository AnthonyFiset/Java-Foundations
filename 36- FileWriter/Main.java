import java.io.FileWriter;
import java.io.IOException;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("text.txt");
            //Inserting text using the writer
            writer.write("Writing my first line of text \nHoping this works \n How do we get this to work?");
            //Closing the writer
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }

}