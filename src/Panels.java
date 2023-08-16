import javax.swing.*;
import java.awt.*;

public class Panels {
    static protected JPanel userAndPasswordPanel=new JPanel(new GridLayout(2,2,-80,10));
    static protected JPanel loginAndClearPanel=new JPanel(new FlowLayout(3,30,2));
    static JPanel loginMainPanel=new JPanel(new FlowLayout(FlowLayout.CENTER,0,30));

    static JPanel homeMainPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
    Panels(){
        loginMainPanel.setBounds(200,0,400,500);
        homeMainPanel.setBounds(200,0,400,500);
        setHomeMainPanelOff();

    }


    void setLoginPaneOff(){
        loginMainPanel.setVisible(false);
    }
    void setLoginPanelOn(){
        loginMainPanel.setVisible(true);
    }
    void setHomeMainPanelOff(){
        homeMainPanel.setVisible(false);
    }
    void setHomeMainPanelOn(){
        homeMainPanel.setVisible(true);
    }


}
