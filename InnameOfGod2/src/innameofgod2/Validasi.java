/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innameofgod2;

import java.io.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Septyadi
 */
public class Validasi extends javax.swing.JFrame {
    
    public Validasi() {
        initComponents();
    }
    public String periksaString(String token){
        String string = "";
        switch (token) {
            case "1":
                string = "p,q,r,s";
                break;
            case "2":
                string = "not";
                break;
            case "3":
                string = "and";
                break;
            case "4":
                string = "or";
                break;
            case "5":
                string = "xor";
                break;
            case "6":
                string = "if";
                break;        
            case "7":
                string = "then";
                break;
            case "8":
                string = "iff";
                break;
            case "9":
                string = "(";
                break;
            case "10":
                string = ")";
                break;    
        }
        return string;
    }
    
    public void inisialisasiTab(JTable x, String[] column){
        DefaultTableModel tm = new DefaultTableModel(column, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        x.setModel(tm);
    }
    
    String[] string = {"String", "Token"};
    
    public void kelolaTabel(ArrayList<Integer> token, JTable jt){
        inisialisasiTab(jt, string);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel();
        int t = 0;
        while (t < token.size()){
            String[] row = {
                periksaString(token.get(t).toString()),token.get(t).toString()
            };
            tm.addRow(row);
            t++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tInput = new javax.swing.JTextField();
        parserbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableoutput = new javax.swing.JTable();
        tStatus = new javax.swing.JTextField();
        ulangbtn = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("HASIL VALIDASI");

        jLabel2.setText("Input");

        tInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tInputActionPerformed(evt);
            }
        });

        parserbtn.setText("Parser");
        parserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parserbtnActionPerformed(evt);
            }
        });

        tableoutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "String", "Token"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableoutput);

        tStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tStatusActionPerformed(evt);
            }
        });

        ulangbtn.setText("Ulang");
        ulangbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulangbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(tInput, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(tStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(parserbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(ulangbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(parserbtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(tStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ulangbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tStatusActionPerformed

    private void tInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tInputActionPerformed
    String valid = "TIDAK VALID";
    private void parserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parserbtnActionPerformed
        String temp = tInput.getText();
        char[] cha = temp.toCharArray();
        ArrayList<String> tumpuk = new ArrayList<>();
        ArrayList<Integer> token = new ArrayList<>();
        int i = 0;
        while (i < temp.length()){
            if (i != temp.length() && (cha[i] == 'p' || cha[i] == 'q' || cha[i] == 'r' || cha[i] == 's')){
                i++;
                if (i != temp.length()){
                    if(cha[i] == ' '){
                        token.add(1);
                        i++;
                    }else {
                        System.out.println("Error");
                        break;
                    }
                }else {
                    token.add(1);
                }
            }else if (i != temp.length() && cha[i] == 'n'){
                i++;
                if (i != temp.length() && cha[i] == 'o'){
                    i++;
                    if(i != temp.length() && cha[i] == 't'){
                        i++;
                        if(i != temp.length()){
                            if (cha[i] == ' '){
                                token.add(2);
                                i++;
                            }else {
                                System.out.println("Error");
                                break;
                            }
                        }else {
                            token.add(2);
                            i++;
                        }
                    }else{
                        System.out.println("Error");
                        break;
                    }
                }else {
                    System.out.println("Error");
                    break;
                }
            }else if (i != temp.length() && cha[i] == 'a'){
                i++;
                if (i != temp.length() && cha[i] == 'n'){
                    i++;
                    if (i != temp.length() && cha[i] == 'd'){
                        i++;
                        if (i != temp.length()){
                            if (cha[i] == ' '){
                                token.add(3);
                                i++;
                            }else {
                                System.out.println("Error");
                                break;
                            }
                        }else {
                            token.add(3);
                            i++;
                        }
                    }else {
                        System.out.println("Error");
                        break;
                    }
                }else {
                    System.out.println("Error");
                    break;
                }
            }else if (i != temp.length() && cha[i] == 'x'){
                i++;
                if (i != temp.length() && cha[i] == 'o'){
                    i++;
                    if (i != temp.length() && cha[i] == 'r'){
                        i++;
                        if (i != temp.length()){
                            if (cha[i] == ' '){
                                token.add(5);
                                i++;
                            }else {
                                System.out.println("Error");
                                break;
                            }
                        }else {
                            token.add(3);
                            i++;
                        }
                    }else {
                        System.out.println("Error");
                    }
                }else {
                    System.out.println("Error");
                    break;
                }
            }else if (i != temp.length() && cha[i] == 'o'){
                i++;
                if (i != temp.length() && cha[i] == 'r'){
                    i++;
                    if (i != temp.length()){
                        if (cha[i] == ' '){
                            token.add(4);
                            i++;
                        }else {
                            System.out.println("Error");
                            break;
                        }
                    }else {
                        token.add(4);
                        i++;
                    }
                }else {
                    System.out.println("Error");
                    break;
                }
            }else if (i != temp.length() && cha[i] == 'i'){
                i++;
                if (i != temp.length() && cha[i] == 'f'){
                    i++;
                    if (i != temp.length()){
                        if (cha[i] == 'f'){
                            i++;
                            if (i != temp.length()){
                                if (cha[i] == ' '){
                                    token.add(8);
                                    i++;
                                }else {
                                    System.out.println("Error");
                                    break;
                                }
                            }else {
                                token.add(8);
                                i++;
                            }
                        }else if (i != temp.length()){
                            if (cha[i] == ' '){
                                token.add(6);
                                i++;
                            }else {
                                System.out.println("Error");
                                break;
                            }
                        }else {
                            token.add(6);
                            i++;
                        }
                    }else {
                        System.out.println("Error");
                        break;
                    }
                }else {
                    System.out.println("Error");
                    break;
                }
            }else if (i != temp.length() && cha[i] == 't'){
                i++;
                if (i != temp.length() && cha[i] == 'h'){
                    i++;
                    if (i != temp.length() && cha[i] == 'e'){
                        i++;
                        if (i != temp.length() && cha[i] == 'n'){
                            i++;
                            if (i != temp.length()){
                                if (cha[i] == ' '){
                                    token.add(7);
                                    i++;
                                }else {
                                    System.out.println("Error");
                                    break;
                                }
                            }else {
                                token.add(7);
                                i++;
                            }
                        }else {
                            System.out.println("Error");
                            break;
                        }
                    }else {
                        System.out.println("Error");
                        break;
                    }
                }else {
                    System.out.println("Error");
                    break;
                }
            }else if (i != temp.length() && cha[i] == '('){
                i++;
                if (i != temp.length()){
                    if (cha[i] == ' '){
                        token.add(9);
                        i++;
                    }else {
                        System.out.println("Error");
                        break;
                    }
                }else {
                    token.add(9);
                    i++;
                }
            }else if (i != temp.length() && cha[i] == ')'){
                i++;
                if (i != temp.length()){
                    if (cha[i] == ' '){
                        token.add(10);
                        i++;
                    }else {
                        System.out.println("Error");
                        break;
                    }
                }else {
                    token.add(10);
                    i++;
                }
            }else {
                System.out.println("Error");
                break;
            }
        }
        //Stack(tumpuk)
        int s = 0;
        tumpuk.add("-");
        while (s < token.size()){
            switch (token.get(s).toString()){
                case "1":
                    s++;
                    if (s != token.size()){
                        if (token.get(s).toString().equals("4") || token.get(s).toString().equals("5") 
                                || token.get(s).toString().equals("3") || token.get(s).toString().equals("8")){
                            s++;
                        }
                    }else if (tumpuk.size() == 1 && tumpuk.get(0).equals("-")){
                        tumpuk.clear();
                    }
                    break;
                case "2":
                    s++;
                    if (s != token.size()){
                        if (token.get(s).toString().equals("1")){
                            s++;
                        }else if (token.get(s).toString().equals("9")){
                            tumpuk.add("(");
                            s++;
                        }
                    }else {
                        valid = "TIDAK VALID";
                    }
                    break;
                case "3":
                    s++;
                    if (token.get(s).toString().equals("2")){
                        s++;
                    }else if (token.get(s).toString().equals("1")){
                        s++;
                    }else if (token.get(s).toString().equals("9")){
                        tumpuk.add("(");
                        s++;
                    }
                    break;
                case "4":
                    s++;
                    if (token.get(s).toString().equals("2")){
                        s++;
                    }else if (token.get(s).toString().equals("1")){
                        s++;
                    }else if (token.get(s).toString().equals("9")){
                        tumpuk.add("(");
                        s++;
                    }
                    break;
                case "5":
                    s++;
                    System.out.println("5" + token.get(s).toString());
                    if (token.get(s).toString().equals("2")){
                        s++;
                    }else if (token.get(s).toString().equals("1")){
                        s++;
                    }else if (token.get(s).toString().equals("9")){
                        tumpuk.add("(");
                        s++;
                    }
                    break;
                case "6":
                    tumpuk.add("if");
                    s++;
                    break;
                case "7":
                    int cek = tumpuk.size();
                    for (int c = 0; c < cek; c++){
                        if ((c == (cek - 1)) && tumpuk.get(c).equals("if")){
                            tumpuk.remove(c);
                        }else if ((c == (cek - 1)) && tumpuk.get(c).equals("#")){
                            tumpuk.clear();
                        }
                    }
                    s++;
                    break;
                case "8":
                    s++;
                    if (token.get(s).toString().equals("2")){
                        s++;
                    }else if (token.get(s).toString().equals("1")){
                        s++;
                    }else if (token.get(s).toString().equals("9")){
                        tumpuk.add("(");
                        s++;
                    }
                    break;
                case "9":
                    tumpuk.add("(");
                    s++;
                    System.out.println("9" + token.get(s).toString());
                    break;
                case "10":
                    int crack = tumpuk.size();
                    for (int ck = 0; ck < crack; ck++){
                        if ((ck == (crack - 1)) && tumpuk.get(ck).equals("(")){
                            tumpuk.remove(ck);
                        }else if ((ck == (crack - 1)) && tumpuk.get(ck).equals("-")){
                            tumpuk.clear();
                        }
                    }
                    s++;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        if (tumpuk.isEmpty()){
            valid = "VALID";
        }
        kelolaTabel(token, tableoutput);
        tStatus.setText(valid);
        for (int v = 0; v < tumpuk.size(); v++){
            System.out.println(tumpuk.get(v));
        }
    }//GEN-LAST:event_parserbtnActionPerformed

    private void ulangbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulangbtnActionPerformed
        tInput.setText("");
        tStatus.setText("");
        valid = "TIDAK VALID";
        DefaultTableModel tm = (DefaultTableModel) tableoutput.getModel();
        tm.setRowCount(0);
    }//GEN-LAST:event_ulangbtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(Validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            Validasi val = new Validasi();
            public void run() {
                val.setVisible(true);
                val.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton parserbtn;
    private javax.swing.JTextField tInput;
    private javax.swing.JTextField tStatus;
    private javax.swing.JTable tableoutput;
    private javax.swing.JButton ulangbtn;
    // End of variables declaration//GEN-END:variables
}
