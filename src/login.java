import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class login {
    static JFrame f; //static - np change //jframe - window interface // new - object
    static JPanel panel ; //jpanel - scaffold 
    static JLabel username ; //label - text
    static JLabel password ;
    JButton login;
    static JTextField userText ;
    static JPasswordField passwordText ;
    static JLabel success;
    static Button loginButton;
    public static void main(String[] args) {
        f = new JFrame();
        panel = new JPanel();
        f.setSize(500,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //function to close
        f.add(panel);
        panel.setLayout(null);

        username = new JLabel("User");
        username.setBounds(10,20,80,25);
        panel.add(username);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        password = new JLabel("Password");
        password.setBounds(10,50,80,25);
        panel.add(password);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        loginButton = new Button("Login");
        loginButton.setBounds(100,100,80,25);
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = passwordText.getText();
                if (username.equals("abusyeed") && password.equals("1234")) {
                    success.setText("Login Successful");
                    dashboard d = new dashboard();
                    d.setvisible();
                } else {
                    success.setText("Login Failed");
                    
                }
                
            }
        });
        panel.add(loginButton);

       

        success = new JLabel(" ");
        success.setBounds(90,125,300,25);
        panel.add(success);

        f.setVisible(true);
    }
    }

