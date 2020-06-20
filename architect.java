import javax.swing.*; 
import java.awt.*; 


public class architect extends JFrame{
    private static final long serialVersionUID = 1L;


    JPanel introPanel = new JPanel();
    JLabel introLabel = new JLabel("Welcome to the Tree Placer Game"); 


    public architect(){
        setTitle("Architect Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800); 

        introPanel.setBackground(Color.GREEN); 
        introPanel.add(introLabel); 

        setLayout(new BorderLayout()); 
        add(introPanel, BorderLayout.NORTH); 

       


        setVisible(true); 

        // open new frames to design new things 
        // tree placer 

    }

   

    public static void main(String[] args) {
        new architect(); 
        
    }

}