package proxy.virtualProxy;

import java.awt.*;

/**
 * Created by sa on 29.03.16.
 */
public interface Icon {
    int getIconWindth();
    int getIconHeight();
    void paitIcon(Component c, Graphics g,int x,int y);
}
