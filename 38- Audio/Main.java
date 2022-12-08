import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        //Creating a scanner So we can have the user choose to play the song

        Scanner scanner = new Scanner(System.in);
        String response = "";

        //Importing the File

        File file = new File("./Audio/chillin.wav");

        //Adding the audio file to Input Stream

        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);

        //Have the clip ready

        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);

        //Start the clip (Only works in a background thread), we need either something on the console or GUI to run it


        while(!response.equals("Q")) {
            System.out.println("P = play, S Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                    
                    break;

                case ("S"): clip.stop();

                    break;

                case ("R"): clip.setMicrosecondPosition(0);

                    break;

                case ("Q"): clip.close();

                    break;
            
                default: System.out.println("Not a valid response");
                    break;
            }
        }

        System.out.println("Thank you for your time!");



    }

}