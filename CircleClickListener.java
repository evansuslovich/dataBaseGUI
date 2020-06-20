import java.awt.event.*;

public class CircleClickListener extends MouseAdapter{

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println(e.getX() + ", " + e.getY()); 
    }

}