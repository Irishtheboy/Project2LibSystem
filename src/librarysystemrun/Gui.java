/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystemrun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sabura11
 */
public class Gui extends JFrame implements ActionListener {

    //these properties are for the login make sure to categorize the rest please
    private JLabel lblUsername, lblPassword, toplbl, lblwest, lblsouth, blank1, blank2, blank3, blank4;
    private JTextField txtUsername, txtPassword;
    private JButton loginBtn, SignUpBtn;
    private JPanel northPnl, centerPnl, southPnl, eastPnl, westPnl;

    //this is for the sign up page
    private JLabel emaillbl, phonelbl;
    private JTextField emailtxt, phonetxt;
    private JButton spBtn, returnBtn;
    
    //top menu section
    private JButton bookBtn, audioBtn, exitBtn,logoutBtn;

    public Gui() {
        super();
        // make sure to split the properties so we dont have a ton of classes setting up a Gui instead use the one we have here for all the work
        //this is for the log in
        toplbl = new JLabel("Login");
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");
        lblwest = new JLabel("");
        lblsouth = new JLabel("");
        blank1 = new JLabel("");
        blank2 = new JLabel("");
//        blank3 = new JLabel("");
//        blank4 = new JLabel("");

        txtUsername = new JTextField(2); // Set columns for the text fields
        txtPassword = new JTextField(2);

        loginBtn = new JButton("login");
        SignUpBtn = new JButton("sign up page");

        northPnl = new JPanel();
        centerPnl = new JPanel();
        southPnl = new JPanel();
        eastPnl = new JPanel();
        westPnl = new JPanel();

        northPnl.setPreferredSize(new Dimension(500, 90));
        centerPnl.setPreferredSize(new Dimension(100, 1));
        eastPnl.setPreferredSize(new Dimension(100, 400));
        westPnl.setPreferredSize(new Dimension(100, 400));

        txtUsername.setMaximumSize(txtUsername.getPreferredSize());
        txtUsername.setMinimumSize(txtUsername.getPreferredSize());
        txtPassword.setMaximumSize(txtPassword.getPreferredSize());
        txtPassword.setMinimumSize(txtPassword.getPreferredSize());

        loginBtn.addActionListener(this);
        SignUpBtn.addActionListener(this);

        //this part should be for the sign up
        emaillbl = new JLabel();
        phonelbl = new JLabel();
        emailtxt = new JTextField();
        phonetxt = new JTextField();
        spBtn = new JButton("Sign-Up!");
        returnBtn = new JButton("Return to Login page");
        spBtn.addActionListener(this);
        returnBtn.addActionListener(this);

        //topmenu
        bookBtn = new JButton("Books");
        audioBtn = new JButton("Audio");
        exitBtn = new JButton("Exit");
        logoutBtn = new JButton("Logout");
        
        bookBtn.addActionListener(this);
        audioBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        logoutBtn.addActionListener(this);
        dTable = new DefaultTableModel();
        table = new JTable(dTable);
        
    }

    // GUI for the Login people please dont forget
    public void SetLoginGui() {
        this.setTitle("Login");
        this.setVisible(true);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        northPnl.removeAll();
        centerPnl.removeAll();
        southPnl.removeAll();
        eastPnl.removeAll();
        westPnl.removeAll();

        centerPnl.setLayout(new GridLayout(3, 2));
        southPnl.setLayout(new GridLayout(1, 2));
        eastPnl.setLayout(new GridLayout(2, 1));
        westPnl.setLayout(new GridLayout(2, 1));

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
        centerPnl.add(blank1);
        centerPnl.add(blank2);
//      centerPnl.add(blank3);
//      centerPnl.add(blank4);

        southPnl.add(loginBtn);
        southPnl.add(SignUpBtn);

        westPnl.add(lblwest);
        eastPnl.add(lblsouth);

        this.add(northPnl, BorderLayout.NORTH);
        this.add(centerPnl, BorderLayout.CENTER);
        this.add(southPnl, BorderLayout.SOUTH);
        this.add(westPnl, BorderLayout.WEST);
        this.add(eastPnl, BorderLayout.EAST);

        this.revalidate();
        this.repaint();

    }

    public void setSignUp() {
        this.setTitle("Sign up");
        this.setVisible(true);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        northPnl.removeAll();
        centerPnl.removeAll();
        southPnl.removeAll();
        eastPnl.removeAll();
        westPnl.removeAll();

        centerPnl.setLayout(new GridLayout(5, 2));
        southPnl.setLayout(new GridLayout(1, 2));
        eastPnl.setLayout(new GridLayout(2, 1));
        westPnl.setLayout(new GridLayout(2, 1));

        northPnl.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        toplbl.setText("Sign Up");
        northPnl.add(toplbl);

        //
        centerPnl.add(lblUsername);
        centerPnl.add(txtUsername);
        centerPnl.add(lblPassword);
        centerPnl.add(txtPassword);
        emaillbl.setText("Email");
        centerPnl.add(emaillbl);
        centerPnl.add(emailtxt);
        phonelbl.setText("Phone");
        centerPnl.add(phonelbl);
        centerPnl.add(phonetxt);
        centerPnl.add(blank1);
        centerPnl.add(blank2);

        southPnl.add(spBtn);
        southPnl.add(returnBtn);

        westPnl.add(lblwest);
        eastPnl.add(lblsouth);
        this.add(northPnl, BorderLayout.NORTH);
        this.add(centerPnl, BorderLayout.CENTER);
        this.add(southPnl, BorderLayout.SOUTH);
        this.add(westPnl, BorderLayout.WEST);
        this.add(eastPnl, BorderLayout.EAST);

        this.revalidate();
        this.repaint();
    }

    public void topMenu() {
        this.setTitle("Sign up");
        this.setVisible(true);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        northPnl.removeAll();
        centerPnl.removeAll();
        southPnl.removeAll();
        eastPnl.removeAll();
        westPnl.removeAll();

         
        centerPnl.setLayout(new GridLayout(2, 2));
        southPnl.setLayout(new GridLayout(1, 2));

        northPnl.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        toplbl.setText("Top Menu");
        northPnl.add(toplbl);

        centerPnl.add(bookBtn);
        centerPnl.add(audioBtn);
        centerPnl.add(blank1);
        centerPnl.add(blank2);
        southPnl.add(logoutBtn);
        southPnl.add(exitBtn);
        
        this.add(centerPnl, BorderLayout.CENTER);
        this.add(southPnl, BorderLayout.SOUTH);

        this.revalidate();
        this.repaint();

    }
    
    
    DefaultTableModel dTable;
    JTable table = new JTable(dTable);
    public void bookSection(){
        
        this.setTitle("Books");
        this.setVisible(true);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        northPnl.removeAll();
        centerPnl.removeAll();
        southPnl.removeAll();
        eastPnl.removeAll();
        westPnl.removeAll();

         
        centerPnl.setLayout(new GridLayout(2, 2));
        southPnl.setLayout(new GridLayout(1, 2));

        northPnl.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        toplbl.setText("Books");
        northPnl.add(toplbl);

        
        dTable.addColumn("number");
        dTable.addColumn("Book Name");
        dTable.addColumn("Genre");
        dTable.addColumn("IBN");
        dTable.addColumn("Selected");
        JScrollPane scrollPane = new JScrollPane(table);
        centerPnl.add(scrollPane);
        
        
        this.add(centerPnl, BorderLayout.CENTER);
        this.add(southPnl, BorderLayout.SOUTH);

        this.revalidate();
        this.repaint();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            JOptionPane.showMessageDialog(this, "Welcome user");
            this.topMenu();
        } else if (e.getSource() == SignUpBtn) {
            JOptionPane.showMessageDialog(this, "fill in all the details");
            this.setSignUp();
        } else if (e.getSource() == spBtn) {
            JOptionPane.showMessageDialog(this, "You have signed up");
        } else if (e.getSource() == returnBtn) {
            this.SetLoginGui();
        } else if (e.getSource() == exitBtn){
            System.exit(0);
        } else if(e.getSource() == bookBtn ){
            this.bookSection();
        }

    }
}
