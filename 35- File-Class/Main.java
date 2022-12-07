import java.io.File;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // File = An abstract representation of file and directory pathnames


        //Detecting the File that we have in the directory
        File file = new File("myMessage.txt");

        if(file.exists()) {
            System.out.println("This file is in our directory");
            //Get the path
            System.out.println(file.getPath());
            //absolute path of the file
            System.out.println(file.getAbsolutePath());
            // file.delete(); will delete the file
        } else {
            System.out.println("Where is the file?");
        }



    }

}