/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jewellerygold;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nurul annesa
 */
public class GUI {

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(100, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 200, 165, 25);
        panel.add(userText);
        
        JLabel passwordText = new JLabel("Password:");
        passwordText.setBounds(100, 5, 165, 25);
        panel.add(passwordText);
        
              
    }
}
