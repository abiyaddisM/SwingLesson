import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LogInPage extends Panels {
    private JButton logInButton=new JButton("Login");
    private JButton clearButton=new JButton("Clear");

    private JTextField userNameText=new JTextField(15);
    private JPasswordField passwordText=new JPasswordField(15);

    private JLabel userNameLable=new JLabel("Username");
    private JLabel passwordLable=new JLabel("Password");

    private HashMap<String,String> nameAndPassword=new HashMap<>();

    LogInPage(){
        userAndPasswordPanel.add(userNameLable);
        userAndPasswordPanel.add(userNameText);
        userAndPasswordPanel.add(passwordLable);
        userAndPasswordPanel.add(passwordText);

        loginAndClearPanel.add(logInButton);
        loginAndClearPanel.add(clearButton);

        loginMainPanel.add(userAndPasswordPanel);
        loginMainPanel.add(loginAndClearPanel);
        setNameAndPassword();
        actionLogInButton();
        actionClearButton();
    }
    void setNameAndPassword(){
        nameAndPassword.put("abiyaddis","12345");
        nameAndPassword.put("User42069","getAlife");
    }
    void actionLogInButton(){
        logInButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username=userNameText.getText(),password=passwordText.getText();

                if(nameAndPassword.containsKey(username)){
                    if (nameAndPassword.get(username).equals(password)){
                        setLoginPaneOff();
                        setHomeMainPanelOn();
                    }else {
                        System.out.println("Wrong password");
                    }
                }
                else {
                    System.out.println("There is no account with that username");
                }
            }
        });
    }
    void actionClearButton(){
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                userNameText.setText("");
                passwordText.setText("");
            }
        });
    }


}
