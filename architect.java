import javax.swing.*; 
import java.awt.*; 


public class architect extends JFrame{
    private static final long serialVersionUID = 1L;


    JPanel introPanel = new JPanel();
    JLabel introLabel = new JLabel("Welcome to the Tree Placer Game"); 


    private ImageIcon image1; 
    private JLabel label1; 

   

    public architect(){
        setTitle("Architect Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800); 

        introPanel.setBackground(Color.GREEN); 
        introPanel.add(introLabel); 

        setLayout(new BorderLayout()); 

        add(introPanel, BorderLayout.NORTH); 
        setLayout(new FlowLayout()); 



        //image1 = new ImageIcon(getClass().getResource("treeOFFICIAL.png")); 
        //label1 = new JLabel(image1); 
        //add(label1); 
    
    

        setVisible(true); 

        // tree placer 

    }

   

    public static void main(String[] args) {
        new architect(); 
        
    }

}