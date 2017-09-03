import java.awt.*;
import java.awt.event.*;

class slip7{
    Label l1;
    slip7(){
        Frame f=new Frame("Hello");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        l1=new Label("Which color do you want?");
        l1.setForeground(Color.YELLOW);
        Font f1=new Font("Georgia",Font.ITALIC,0);
        l1.setFont(f1);
        l1.setBackground(Color.BLUE);
        f.add(l1);
    }
    public static void main(String args[]){
        new slip7();
    }
}
