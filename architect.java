import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class architect extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;


    JPanel menu = new JPanel(); 
    



    public architect(){
        setTitle("Architect Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800); 



        setVisible(true); 

        // open new frames to design new things 
        // tree placer 

    }

    public static void main(String[] args) {
        
    }

}