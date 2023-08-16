import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LogInPage logInPage=new LogInPage();
        HomePage homePage=new HomePage();
        Frame frame=new Frame();
        frame.add(LogInPage.loginMainPanel);
        frame.add(Panels.homeMainPanel);

    }
}
