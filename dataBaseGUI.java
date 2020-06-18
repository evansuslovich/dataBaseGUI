import javax.swing.*; 


public class dataBaseGUI extends JFrame{
    private static final long serialVersionUID = 1L;

    JPanel panel = new JPanel(); 

    JLabel nameLabel = new JLabel("Enter your name"); 
    JLabel birthdayLabel = new JLabel("Enter your birthday"); 
    JLabel heightLabel = new JLabel("Enter your height"); 
    JLabel weightLabel = new JLabel(""); 

    JTextField name = new JTextField(); 
    JTextField birthday = new JTextField(); 
    JTextField height = new JTextField(); 
    JTextField weight = new JTextField(); 

    JButton submit = new JButton("Submit"); 
    


    public dataBaseGUI(){
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        setVisible(true); 
    }
    public static void main(String[] args) {
        new dataBaseGUI(); 
        
    }
}