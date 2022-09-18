import javax.swing.*;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class add {
    static JFrame f;
    static JPanel panel;
    static JLabel fullName;
    static JTextField fullNameText;
    static JLabel genderLabel;
    static JComboBox<String> gender_option;
    static JLabel age;
    static JTextField ageText;
    static JButton add;
    public static void main() {
        f = new JFrame("Add Employee");
        panel = new JPanel();
        f.setSize(400,520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        panel.setLayout(null);

        JLabel title = new JLabel("Add Employee");
        title.setBounds(110,20,300,15);
        title.setFont(new Font("Serif", Font.BOLD, 15));
        panel.add(title);

        fullName = new JLabel("Name");
        fullName.setBounds(80,60,80,25);
        panel.add(fullName);
        fullNameText = new JTextField(30);
        fullNameText.setBounds(160,60,100,25);
        panel.add(fullNameText);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(80,100,80,25);
        panel.add(genderLabel);
        String[] gender = {"Male","Female"};
        gender_option = new JComboBox<String>(gender);
        gender_option.setBounds(160,100,100,25);
        panel.add(gender_option);

        age = new JLabel("Age");
        age.setBounds(80,140,80,25);
        panel.add(age);
        ageText = new JTextField(10);
        ageText.setBounds(160,140,100,25);
        panel.add(ageText);

        add = new JButton("Add ;)");
        add.setBounds(160,180,150,25);
        add.addActionListener(new  ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fullNameText.getText();
                String gender = gender_option.getSelectedItem().toString();
                String age = ageText.getText();
                int rs;
             try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
                if(con != null)
                    System.out.println("Connected");
                else
                    System.out.println("not Connected");
                String insert = "Insert into newemp values(?,?,?);";
                PreparedStatement ps = con.prepareStatement(insert);
                ps.setString(1, name);
                ps.setString(2, age);
                ps.setString(3, gender);     
                rs = ps.executeUpdate();    

             }
             
             catch (Exception e1) {
               
               System.out.println(e1); 
                // TODO: handle exception
             }  
                
            }
        });
        panel.add(add);
        f.setVisible(true);

    }
	public void setVisible() {
        main();
        f.setVisible(true);
	}
}
