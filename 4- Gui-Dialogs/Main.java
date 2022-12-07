import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        //Creating a dialog box
        String name = JOptionPane.showInputDialog("Enter your name");

        //Message Dialog with the message from last Input Dialog
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //If you need to do a Integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        //If you need to work with a Double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}