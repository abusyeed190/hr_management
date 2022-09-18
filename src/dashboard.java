import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class dashboard {
    static JFrame f;
    static JPanel panel;
    static JButton addEmp;
    static JButton updateEmp;
    static JButton deleteEmp;
    static JButton exit;
    public static void main() {
        f = new JFrame();
        panel = new JPanel();
        f.setSize(600,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        panel.setLayout(null);

        addEmp = new JButton("Add Employee");
        addEmp.setBounds(100,100,150,25);
        addEmp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add hj = new add();
                hj.setVisible();
            }
        });
        panel.add(addEmp);
        

        deleteEmp = new JButton("Delete Employee");
        deleteEmp.setBounds(100,300,150,25);
        deleteEmp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                delete jk = new delete();
                jk.setvisible();
            }
        });
        panel.add(deleteEmp);

        f.setVisible(true);


    }
    void setvisible(){
        main();
        f.setVisible(true);
    }
}
