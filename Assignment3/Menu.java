package test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    ArrayList<Jewellery> jList;
    String header[] = new String[]{"Names", "IC", "No.PHONE", "ADDRESS", "TYPES"};
    DefaultTableModel model;
    int row, col;

    public Menu() {
        initComponents();
        jList = new ArrayList<>();
        model = new DefaultTableModel(header, 0);
        jTable1.setModel(model);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        icLabel = new javax.swing.JLabel();
        icTxt = new javax.swing.JTextField();
        pLabel = new javax.swing.JLabel();
        mTxt = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        addTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        InfoBtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JEWELLERY");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SYSTEM");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "No. I/C", "Mobile Phone", "Address", "Types Jewellery"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("NAME");

        icLabel.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        icLabel.setForeground(new java.awt.Color(255, 255, 255));
        icLabel.setText("NO. I/C");

        pLabel.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        pLabel.setForeground(new java.awt.Color(255, 255, 255));
        pLabel.setText("NO.PHONE");

        addLabel.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        addLabel.setForeground(new java.awt.Color(255, 255, 255));
        addLabel.setText("ADDRESS");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHOOSE TYPE:");

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonEdit.setText("UPDATE");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NECKLACE", "BRACELET", "RING" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        InfoBtn.setText("INFORMATION");
        InfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBtnActionPerformed(evt);
            }
        });

        savebtn.setText("SAVE TO FILE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(icLabel)
                                    .addComponent(pLabel)
                                    .addComponent(addLabel))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTxt)
                                    .addComponent(icTxt)
                                    .addComponent(mTxt)
                                    .addComponent(addTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEdit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButtonDelete)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savebtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(InfoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icLabel)
                            .addComponent(icTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pLabel)
                            .addComponent(mTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addLabel)
                            .addComponent(addTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonDelete)
                            .addComponent(savebtn))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSearch)
                            .addComponent(InfoBtn)
                            .addComponent(jButtonEdit)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExit)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearField() {
        nameTxt.setText(null);
        icTxt.setText(null);
        mTxt.setText(null);
        addTxt.setText(null);
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        String name = nameTxt.getText();
        String ic = icTxt.getText();
        String m = mTxt.getText();
        String add = addTxt.getText();
        String type = jComboBox1.getSelectedItem().toString(); //jCombBox
        jList.add(new Jewellery(name, ic, m, add, type));
        model.setRowCount(0); //reset data model
        for (int i = 0; i < jList.size(); i++) {
            Object[] obj = {jList.get(i).name, jList.get(i).ic, jList.get(i).mPhone, jList.get(i).address, jList.get(i).type};
            model.addRow(obj);
        }
        clearField(); //reset

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data.", "Delete", dialogButton);
        if (dialogResult == 0) {
            model.removeRow(row);
            jList.remove(row);
            model.setRowCount(0); //reset table and populate again with jList
            for (int i = 0; i < jList.size(); i++) {
                Object[] obj = {jList.get(i).name, jList.get(i).ic, jList.get(i).mPhone, jList.get(i).address, jList.get(i).type};
                model.addRow(obj);
            }
            clearField();
        } else {
            int dialogResult1 = JOptionPane.showConfirmDialog(this, "Delete this data.", "Your list are same.", dialogButton);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        String updatedname = nameTxt.getText();
        String updatedic = icTxt.getText();
        String updatedm = mTxt.getText();
        String updatedadd = addTxt.getText();
        String updatedtype = jComboBox1.getSelectedItem().toString();
        jList.get(row).name = updatedname;
        jList.get(row).ic = updatedic;
        jList.get(row).mPhone = updatedm;
        jList.get(row).address = updatedadd;
        jList.get(row).type = updatedtype;
        model.setRowCount(0); //reset table and repopulated
        for (int i = 0; i < jList.size(); i++) {
            Object[] obj = {jList.get(i).name, jList.get(i).ic, jList.get(i).mPhone, jList.get(i).address, jList.get(i).type};
            model.addRow(obj);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:

        String input = JOptionPane.showInputDialog(this, "Search Name:");
        for (int i = 0; i < jList.size(); i++) {
            if (jList.get(i).name.equalsIgnoreCase(input)) {
                JOptionPane.showMessageDialog(jButtonSearch, "Your list is Found!", "Search", 2);
                nameTxt.setText(jList.get(i).name);
                icTxt.setText(jList.get(i).ic);
                mTxt.setText(jList.get(i).mPhone);
                addTxt.setText(jList.get(i).address);
                String location = jList.get(i).type;
                for (int j = 0; j < (jComboBox1.getItemCount()); j++) {
                    if (jComboBox1.getItemAt(i).equalsIgnoreCase(location)) {
                        jComboBox1.setSelectedIndex(i);
                    }
                }
                return; // Quit after found

            }
        }
        JOptionPane.showMessageDialog(jButtonSearch, "Sorry your list is not found!", "Search", 2);

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "You want to EXIT.", "EXIT", dialogButton);
        if (dialogResult == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        col = jTable1.getColumnCount();
        System.out.println(row + "," + col);
        nameTxt.setText(model.getValueAt(row, 0).toString());
        icTxt.setText(model.getValueAt(row, 1).toString());
        mTxt.setText(model.getValueAt(row, 2).toString());
        addTxt.setText(model.getValueAt(row, 3).toString());
        String type = model.getValueAt(row, 2).toString();
        for (int i = 0; i < (jComboBox1.getItemCount()); i++) {
            if (jComboBox1.getItemAt(i).equalsIgnoreCase(type)) {
                jComboBox1.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // get selected value from comboBox
        String selectedValue = jComboBox1.getSelectedItem().toString();

        //now set this selected value into jtable
        //model.setRowCount(row); 

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void InfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBtnActionPerformed
        // TODO add your handling code here:
        //int dialogButton = JOptionPane.INFORMATION_MESSAGE;
        JOptionPane.showMessageDialog(InfoBtn, "\n\nNecklace:"
                + "\nIf price less than RM 3999,"
                + "\nso that price is EXPENSIVE."
                + "\nIf price more than RM 4000 & less than RM 8999,"
                + "\nIf price more than RM 4000 & less than RM 8999,"
                + "\nso that price is MORE EXPENSIVE."
                + "\nIf price more than RM 9000,"
                + "\nso that price is MOST EXPENSIVE."
                + "\nhaveGold color"
                + "\nis shining"
                + "\nmade from matel"
                + "\n\nBracelet:"
                + "\nhave Gold color"
                + "\nis shining"
                + "\nmade from matel"
                + "\nShapes:"
                + "\nare diamond,loves and others"
                + "\n\nRing:"
                + "\nhave Gold color"
                + "\nis shining"
                + "\nmade from matel"
                + "\nTypes:"
                + "\n1. Engaged"
                + "\n2.wedding"
                + "\n3.couple", "Information", 2);

        /*Frame2 f = new Frame2();
        new Frame2().setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_InfoBtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        //exception handling 
        String type = "Jewellery user Info:" + "" + nameTxt.getText() + "" + icTxt.getText() + "" + mTxt.getText() + "" + addTxt.getText() + "" + jComboBox1.getSelectedItem();
        byte[] info = type.getBytes();

        if (jComboBox1.getSelectedItem().equals("NECKLACE")) {
            try {
                RandomAccessFile file = new RandomAccessFile("Necklace.txt", "rw");
                file.write(info);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (jComboBox1.getSelectedItem().equals("BRACELET")) {
            try {
                RandomAccessFile file = new RandomAccessFile("Bracelet.txt", "rw");
                file.write(info);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                RandomAccessFile file = new RandomAccessFile("Ring.txt", "rw");
                file.write(info);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_savebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoBtn;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel icLabel;
    private javax.swing.JTextField icTxt;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel pLabel;
    private javax.swing.JButton savebtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
