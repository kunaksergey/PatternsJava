package proxy.virtualProxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by sa on 29.03.16.
 */
public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame=new JFrame("CD Cover Viwer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String,String> cds=new Hashtable();
    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive testDrive=new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws MalformedURLException {
        cds.put("Ambient: Music for Airporyts","http://media.corporate-ir.net/media_files/IROL/97/97664/images/amazon_logo_RGB.jpg");
        cds.put("Budda Bar","http://www.buddhabar.com/buddha/ckfinder/userfiles/images/BBAR%20SALLE%20ANIMEE.JPG");
        URL initialURL=new URL(cds.get("Budda Bar"));
        menuBar=new JMenuBar();
        menu=new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        for(Enumeration e=cds.keys();e.hasMoreElements();){
            String name= (String) e.nextElement();
            JMenuItem menuItem=new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }
        Icon icon=new ImageProxy(initialURL);
        imageComponent=new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name){
        try{
            return new URL((String) cds.get(name));
        }catch(MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }
}
