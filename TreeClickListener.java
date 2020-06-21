import java.awt.event.*; 

public class TreeClickListener extends MouseAdapter{

    private TreePanel panel; 

    public TreeClickListener(TreePanel panel){
        super(); 
        this.panel = panel; 

    }

    @Override
    public void mouseClicked(MouseEvent e){
        panel.addTree(new TreeIcon(e.getX() - 12 , e.getY() - 12)); 
    }

   
    

}