package proxy.virtualProxy;


import javax.swing.*;
import java.awt.*;

/**
 * Created by sa on 30.03.16.
 */
public class ImageComponent extends JComponent {
    private Icon icon;
    ImageComponent(Icon icon){
        this.icon=icon;
    }

    public void setIcon(Icon icon){
        this.icon=icon;
    }
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        int w=icon.getIconWindth();
        int h=icon.getIconHeight();
        int x=(800-w)/2;
        int y=(600-h)/2;
        icon.paitIcon(this,g,x,y);
    }
}
