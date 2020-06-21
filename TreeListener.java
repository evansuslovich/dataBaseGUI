import javax.swing.*; 
import java.awt.*; 


public class TreeListener extends JFrame{
    private static final long serialVersionUID = 1L;


    JPanel introPanel = new JPanel();
    JLabel introLabel = new JLabel("Welcome to the Tree Placer Game"); 

    JPanel panel = new JPanel(); 


   

    public TreeListener(){
        setTitle("Architect Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800); 

        introPanel.setBackground(Color.GREEN); 
        introPanel.add(introLabel); 

        setLayout(new BorderLayout()); 

        add(introPanel, BorderLayout.NORTH); 
        setLayout(new FlowLayout()); 

        panel.setBackground(Color.WHITE); 

        TreePanel panel = new TreePanel(); 
        setContentPane(panel); 
        panel.addMouseListener(new TreeClickListener(panel));

        


        setVisible(true); 

        // tree placer 

    }

   

    public static void main(String[] args) {
        new TreeListener(); 
        
    }

}