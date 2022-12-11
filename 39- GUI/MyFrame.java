import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * MyFrame
 */
public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Biz"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevents frame from being resized
        this.setSize(500,500); //sets x-dimension and y-dimension of frame
        this.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("BI-no-text.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(Color.BLUE); //change color of background
    }
    
}