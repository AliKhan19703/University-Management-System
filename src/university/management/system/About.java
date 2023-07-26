package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon aboutImage = new ImageIcon(getClass().getResource("/icons/about.jpeg"));
        Image scaledImage = aboutImage.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(350, 0, 300, 200);
        add(imageLabel);
        
        JLabel headingLabel = new JLabel("<html>University<br/>Management System</html>");
        headingLabel.setBounds(70, 20, 300, 130);
        headingLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(headingLabel);
        
        JLabel nameLabel = new JLabel("<html>Developed By: Ali Khan,<br/>Abdul Basit Ihsan,<br/>Nofal Ahmad</html>");
        nameLabel.setBounds(70, 220, 550, 40);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(nameLabel);
        
        JLabel rollnoLabel = new JLabel("Roll number: 1, 2, 3");
        rollnoLabel.setBounds(70, 280, 550, 40);
        rollnoLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollnoLabel);
        
        JPanel contactPanel = new JPanel();
        contactPanel.setBounds(70, 340, 550, 40);
        contactPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contactPanel.add(contactLabel);
        
        JLabel emailLabel = new JLabel("alikhanofficial81@gmail.com");
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contactPanel.add(emailLabel);
        
        add(contactPanel);
        
        setLayout(null);
        
        setVisible(true);
    }
    

}
