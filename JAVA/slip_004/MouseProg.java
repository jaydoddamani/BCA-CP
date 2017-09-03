import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class MouseProg extends Frame{
    TextField statusBar;
    MouseProg(){
        statusBar = new TextField(20);
        add(statusBar);
        setLayout(new FlowLayout());
        setSize(275,100);
        setTitle("Mouse click position");
        setVisible(true);
        addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            statusBar.setText("Clicked at ("+ e.getX()+"."+ e.getY()+ ")");
            repaint();
        }
        });
    }
    public static void main(String []args)
    {
        new MouseProg();
    }
}  