/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystemrun;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Sabura11
 */
public class Gui extends JFrame {
    
    //these properties are for the login make sure to categorize the rest please
    private JLabel lblUsername, lblPassword, toplbl;
    private JTextField txtUsername, txtPassword;
    private JButton loginBtn, SignUpBtn;
    private JPanel northPnl, centerPnl, southPnl;

    public Gui() {
        super();
        // make sure to split the properties so we dont have a ton of classes setting up a Gui instead use the one we have here for all the work
        //this is for the log in
        toplbl = new JLabel("Login");
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");

        txtUsername = new JTextField("");
        txtPassword = new JTextField("");
        
        loginBtn = new JButton("login");
        SignUpBtn = new JButton("sign up page");
        
        northPnl = new JPanel();
        centerPnl = new JPanel();
        southPnl = new JPanel();
        
        //this part should be for the sign up

    }
    
    // GUI for the Login people please dont forget
    public void SetLoginGui(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        centerPnl.setLayout(new GridLayout(2,2));
        southPnl.setLayout(new GridLayout(1,2));
        
        northPnl.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); 
        northPnl.add(toplbl);
        centerPnl.add(lblUsername);
        centerPnl.add(txtUsername);
        centerPnl.add(lblPassword);
        centerPnl.add(txtPassword);
        
        southPnl.add(loginBtn);
        southPnl.add( SignUpBtn);
        
        this.add(northPnl, BorderLayout.NORTH);
        this.add(centerPnl, BorderLayout.CENTER);
        this.add(southPnl, BorderLayout.SOUTH);
        
        this.pack();
        
        
        
    
    }
}
