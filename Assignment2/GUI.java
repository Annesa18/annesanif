/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

// Java program to implement 
// a Simple Registration Form 
// using Java Swing 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class GUI extends JFrame implements ActionListener {
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel icLabel;
    private static JTextField icText;
    private static JLabel mLabel;
    private static JTextField mText;
    private static JLabel addLabel;
    private static JTextArea addText;
    private static JLabel choiceLabel;
    private static JRadioButton nLabel;
    private static JRadioButton rLabel;
    private static JRadioButton bLabel;
    private static ButtonGroup gengp; 
    private static JCheckBox term;
    private static JButton sub; 
    private static JButton reset;
    private static JTextArea tout;
    private static JLabel res;
    private static JTextArea resadd;
      
    
    public GUI () {
        //public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("JEWELLERY");
        frame.setBounds(300, 200, 900, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel title = new JLabel("JEWELLERY GOLD"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(250, 30); 
        panel.add(title); 
        
        userLabel = new JLabel("Name");
        userLabel.setBounds(50, 120, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField(10);
        userText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        userText.setSize(190, 20);
        userText.setBounds(130, 120, 165, 25);
        panel.add(userText); 
        
        icLabel = new JLabel("IC Number");
        icLabel.setBounds(50, 170, 80, 25);
        panel.add(icLabel);
        
        icText = new JTextField();
        icText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        icText.setSize(150, 20);
        icText.setBounds(130, 170, 165, 25);
        panel.add(icText);
        
        mLabel = new JLabel("Phone no.");
        mLabel.setBounds(50, 220, 80, 25);
        panel.add(mLabel);
        
        mText = new JTextField();
        mText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        mText.setSize(150, 20); 
        mText.setBounds(130, 220, 165, 25);
        panel.add(mText);
        
        addLabel = new JLabel("Address");
        addLabel.setBounds(50, 270, 80, 25);
        panel.add(addLabel);
        
        addText = new JTextArea();
        addText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        addText.setSize(200, 75);
        addText.setBounds(130, 270, 165, 25);
        addText.setLineWrap(true); 
        panel.add(addText);
        
        choiceLabel = new JLabel("choose based on the choices given:");
        choiceLabel.setBounds(50, 340, 210, 25);
        panel.add(choiceLabel);
        
        nLabel = new JRadioButton("Necklace"); 
        nLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        nLabel.setSelected(true); 
        nLabel.setSize(60, 20); 
        nLabel.setBounds(50, 370, 165, 25);
        panel.add(nLabel); 
        
        rLabel = new JRadioButton("Ring"); 
        rLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        rLabel.setSelected(false); 
        rLabel.setSize(60, 20); 
        rLabel.setBounds(50, 400, 165, 25);
        panel.add(rLabel);
        
        bLabel = new JRadioButton("Bracelet"); 
        bLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        bLabel.setSelected(false); 
        bLabel.setSize(60, 20); 
        bLabel.setBounds(50, 430, 165, 25);
        panel.add(bLabel);
        
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(200, 500); 
        panel.add(term); 
        
        gengp = new ButtonGroup(); 
        gengp.add(nLabel); 
        gengp.add(rLabel);
        gengp.add(bLabel);
        
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(200, 550); 
        sub.addActionListener(this); 
        panel.add(sub); 

        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(350, 550); 
        reset.addActionListener(this); 
        panel.add(reset); 

        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        panel.add(tout); 

        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 15)); 
        res.setSize(500, 25); 
        res.setLocation(250, 600); 
        panel.add(res); 

        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        panel.add(resadd); 
               
        frame.setVisible(true);
    }
        
    
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) { 
        
         if (e.getSource() == sub) { 
         if (term.isSelected()) { 
            String data2; 
            String data 
               = "Name : "
               + userText.getText()
               + "\n\nIC Number:"
               + icText.getText() 
               + "\n\nPhone no : "
               + mText.getText() ; 
            if  (nLabel.isSelected()){ 
               data2 = "\n\nNecklace:" 
                       + "\nGold color"
                       + "\nshining"
                       + "\nmatel"
                       + "\nPrices:" 
                       + "\n1. Expensive"
                       + "\n2.more expensive"
                       + "\n3.most expensive" ;
            }
            else if (rLabel.isSelected()){
                    data2 = "\n\nRing:"
                          + "\nGold color"
                          + "\nshining"
                          + "\nmatel"
                          + "\nTypes:" 
                          + "\n1. Engaged"
                          + "\n2.wedding"
                          + "\n3.couple";
            }
            else {
                data2 = "\n\nBracelet:"
                      + "\nGold color"
                      + "\nshining"
                      + "\nmatel"
                      + "\nShapes:" 
                      + "\ndiamond,loves and others";
            }
            
            String data1 = "\n\nAddress : " + addText.getText(); 
            tout.setText(data + data1 + data2); 
            tout.setEditable(false); 
            res.setText("Successful "
                    + "\nThank You."); 
         } 
         else { 
            tout.setText(""); 
            resadd.setText(""); 
            res.setText("Please accept the"
                     + " terms & conditions.."); 
         } 
      } 

      else if (e.getSource() == reset) { 
         String def = ""; 
         userText.setText(def);
         icText.setText(def);
         mText.setText(def);
         addText.setText(def);
         nLabel.setText(def);
         rLabel.setText(def);
         bLabel.setText(def);
         res.setText(def); 
         tout.setText(def); 
         term.setSelected(false); 
         resadd.setText(def); 
      } 
   } 
    }

    // Driver Code 
class JewelleryGold { 

   public static void main(String[] args) {
       
      GUI gui = new GUI(); 
   } 
}
