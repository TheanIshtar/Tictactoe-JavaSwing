package src;

import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author dangt
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    public boolean flag = true;
    public int count = 0;
    //Cell cell = new Cell();
    //List<Cell> list = new ArrayList<>();
//    int markRowX;
//    int markColO;
//    int markColX;
//    int markRowO;
    String winner = "";

    public void checkTurn() {
        if (count == 8) {
            jlbTitleTurn.setText("The end");
            jlbTurn.setText("");
        }
        winner();
    }

    public void turnX() {
        jlbTurn.setText("O");
        jlbTurn.setForeground(new Color(0, 153, 0));
    }

    public void turnO() {
        jlbTurn.setText("X");
        jlbTurn.setForeground(Color.red);
    }

    public void tic(){
        this.jlb0.setText("X");
    }

    public void winner() {
//        for (int i = 0; i < list.size() - 1; i++) {
//            int pointRowX = 0;
//            int pointColX = 0;
//            int pointRowO = 0;
//            int pointColO = 0;
//            markRowX = 0;
//            markColO = 0;
//            markColX = 0;
//            markRowO = 0;
//            if (list.get(i).type == 'X') {
//                int rowXTemp = list.get(i).row;
//                int colXTemp = list.get(i).col;
//                for (int j = 0; j < list.size(); j++) {
//                    if (list.get(j).type == 'X') {
//                        pointRowX = pointRowX + list.get(j).row;
//                        pointColX = pointColX + list.get(j).col;
//                        if (rowXTemp == list.get(j).row) {
//                            markRowX++;
//                        }
//                        if (colXTemp == list.get(j).col) {
//                            markColX++;
//                        }
//                    }
//                    //trường hợp đường chéo
//                }
//            }
//            if (list.get(i).type == 'O') {
//                int rowOTemp = list.get(i).row;
//                int colOTemp = list.get(i).col;
//                for (int j = 0; j < list.size(); j++) {
//                    if (list.get(j).type == 'O') {
//                        pointRowO = pointRowO + list.get(j).row;
//                        pointColO = pointColO + list.get(j).col;
//                        if (rowOTemp == list.get(j).row) {
//                            markRowO++;
//                        }
//                        if (colOTemp == list.get(j).col) {
//                            markColO++;
//                        }
//                    }
//
//                }
//            }
////            if (markColX == 3 || markRowX == 3 || (pointRowX == 3 && pointColX == 3)) {
////                winner = "Winner is X";
////                jlbTurn.setText("");
////                jlbTitleTurn.setText(this.winner);
////                jlbTitleTurn.setForeground(Color.red);
////                return;
////            }
////            if (markColO == 3 || markRowO == 3 || (pointRowO == 3 && pointColO == 3)) {
////                winner = "Winner is O";
////                jlbTurn.setText("");
////                jlbTitleTurn.setText(this.winner);
////                jlbTitleTurn.setForeground(new Color(0, 153, 0));
////                return;
////            }
//            
//        }
        if (playerOWin()) {
            winner = "Winner is O";
            jlbTurn.setText("");
            jlbTitleTurn.setText(this.winner);
            jlbTitleTurn.setForeground(new Color(0, 153, 0));
            return;
        }
        if (playerXWin()) {
            winner = "Winner is X";
            jlbTurn.setText("");
            jlbTitleTurn.setText(this.winner);
            jlbTitleTurn.setForeground(Color.red);
            return;
        }
    }

    public boolean playerXWin() {
        //duong ngang
        if (jlb0.getText().equals("X") && jlb1.getText().equals("X") && jlb2.getText().equals("X")) {
            return true;
        }
        if (jlb3.getText().equals("X") && jlb4.getText().equals("X") && jlb5.getText().equals("X")) {
            return true;
        }
        if (jlb6.getText().equals("X") && jlb7.getText().equals("X") && jlb8.getText().equals("X")) {
            return true;
        }
        //duong doc
        if (jlb0.getText().equals("X") && jlb3.getText().equals("X") && jlb6.getText().equals("X")) {
            return true;
        }
        if (jlb1.getText().equals("X") && jlb4.getText().equals("X") && jlb7.getText().equals("X")) {
            return true;
        }
        if (jlb8.getText().equals("X") && jlb5.getText().equals("X") && jlb2.getText().equals("X")) {
            return true;
        }
        //duong cheo
        if (jlb0.getText().equals("X") && jlb4.getText().equals("X") && jlb8.getText().equals("X")) {
            return true;
        }
        if (jlb6.getText().equals("X") && jlb4.getText().equals("X") && jlb2.getText().equals("X")) {
            return true;
        }
        return false;
    }

    public boolean playerOWin() {
        //duong ngang
        if (jlb0.getText().equals("O") && jlb1.getText().equals("O") && jlb2.getText().equals("O")) {
            return true;
        }
        if (jlb3.getText().equals("O") && jlb4.getText().equals("O") && jlb5.getText().equals("O")) {
            return true;
        }
        if (jlb6.getText().equals("O") && jlb7.getText().equals("O") && jlb8.getText().equals("O")) {
            return true;
        }
        //duong doc
        if (jlb0.getText().equals("O") && jlb3.getText().equals("O") && jlb6.getText().equals("O")) {
            return true;
        }
        if (jlb1.getText().equals("O") && jlb4.getText().equals("O") && jlb7.getText().equals("O")) {
            return true;
        }
        if (jlb8.getText().equals("O") && jlb5.getText().equals("O") && jlb2.getText().equals("O")) {
            return true;
        }
        //duong cheo
        if (jlb0.getText().equals("O") && jlb4.getText().equals("O") && jlb8.getText().equals("O")) {
            return true;
        }
        if (jlb6.getText().equals("O") && jlb4.getText().equals("O") && jlb2.getText().equals("O")) {
            return true;
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbTurn = new javax.swing.JLabel();
        jlbTitleTurn = new javax.swing.JLabel();
        jlb7 = new javax.swing.JLabel();
        jlb1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlb2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlb5 = new javax.swing.JLabel();
        jlb8 = new javax.swing.JLabel();
        jlb0 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jlb6 = new javax.swing.JLabel();
        jlb4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, 300));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 300, -1));

        jlbTurn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlbTurn.setForeground(new java.awt.Color(204, 0, 0));
        jlbTurn.setText("X");
        jPanel1.add(jlbTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 40, 40));

        jlbTitleTurn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlbTitleTurn.setForeground(new java.awt.Color(0, 153, 153));
        jlbTitleTurn.setText("Turn: ");
        jPanel1.add(jlbTitleTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 280, 40));

        jlb7.setBackground(new java.awt.Color(51, 51, 51));
        jlb7.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb7.setForeground(new java.awt.Color(255, 255, 255));
        jlb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb7.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb7MouseClicked(evt);
            }
        });
        jPanel1.add(jlb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 100, 100));

        jlb1.setBackground(new java.awt.Color(51, 51, 51));
        jlb1.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        jlb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb1.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb1MouseClicked(evt);
            }
        });
        jPanel1.add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 100, 100));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, 300));

        jlb2.setBackground(new java.awt.Color(51, 51, 51));
        jlb2.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb2.setForeground(new java.awt.Color(255, 255, 255));
        jlb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb2.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb2MouseClicked(evt);
            }
        });
        jPanel1.add(jlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, 100));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 300, -1));

        jlb5.setBackground(new java.awt.Color(51, 51, 51));
        jlb5.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb5.setForeground(new java.awt.Color(255, 255, 255));
        jlb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb5.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb5MouseClicked(evt);
            }
        });
        jPanel1.add(jlb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 100, 100));

        jlb8.setBackground(new java.awt.Color(51, 51, 51));
        jlb8.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb8.setForeground(new java.awt.Color(255, 255, 255));
        jlb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb8.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb8MouseClicked(evt);
            }
        });
        jPanel1.add(jlb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 100, 100));

        jlb0.setBackground(new java.awt.Color(204, 204, 255));
        jlb0.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb0.setForeground(new java.awt.Color(255, 255, 255));
        jlb0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb0.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlb0MouseEntered(evt);
            }
        });
        jPanel1.add(jlb0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 100));

        jlb3.setBackground(new java.awt.Color(51, 51, 51));
        jlb3.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb3.setForeground(new java.awt.Color(255, 255, 255));
        jlb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb3.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb3MouseClicked(evt);
            }
        });
        jPanel1.add(jlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 100));

        jlb6.setBackground(new java.awt.Color(51, 51, 51));
        jlb6.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb6.setForeground(new java.awt.Color(255, 255, 255));
        jlb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb6.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb6MouseClicked(evt);
            }
        });
        jPanel1.add(jlb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 100, 100));

        jlb4.setBackground(new java.awt.Color(51, 51, 51));
        jlb4.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jlb4.setForeground(new java.awt.Color(255, 255, 255));
        jlb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb4.setPreferredSize(new java.awt.Dimension(70, 70));
        jlb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb4MouseClicked(evt);
            }
        });
        jPanel1.add(jlb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb7MouseClicked

        if (jlb7.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 2, 1));
                jlb7.setText("X");
                jlb7.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 2, 1));
                jlb7.setText("O");
                jlb7.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb7MouseClicked

    private void jlb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb1MouseClicked
        if (jlb1.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 0, 1));
                //flag true turn X
                jlb1.setText("X");
                jlb1.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 0, 1));
                jlb1.setText("O");
                jlb1.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb1MouseClicked

    private void jlb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb2MouseClicked

        if (jlb2.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 0, 2));
                //flag true turn X
                jlb2.setText("X");
                jlb2.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 0, 2));
                jlb2.setText("O");
                jlb2.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb2MouseClicked

    private void jlb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb5MouseClicked

        if (jlb5.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 1, 2));
                //flag true turn X
                jlb5.setText("X");
                jlb5.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 1, 2));
                jlb5.setText("O");
                jlb5.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb5MouseClicked

    private void jlb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb8MouseClicked

        if (jlb8.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 2, 2));
                //flag true turn X
                jlb8.setText("X");
                jlb8.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 2, 2));
                jlb8.setText("O");
                jlb8.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb8MouseClicked

    private void jlb0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb0MouseClicked

        if (jlb0.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 0, 0));
                jlb0.setText("X");
                jlb0.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 0, 0));
                jlb0.setText("O");
                jlb0.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb0MouseClicked

    private void jlb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb3MouseClicked

        if (jlb3.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 1, 0));
                //flag true turn X
                jlb3.setText("X");
                jlb3.setForeground(Color.red);
                turnX();
                //
            } else {
                //ist.add(new Cell('O', 1, 0));
                jlb3.setText("O");
                jlb3.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb3MouseClicked

    private void jlb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb6MouseClicked

        if (jlb6.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 2, 0));
                //flag true turn X
                jlb6.setText("X");
                jlb6.setForeground(Color.red);
                turnX();
                //
            } else {
               //list.add(new Cell('O', 2, 0));
                jlb6.setText("O");
                jlb6.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb6MouseClicked

    private void jlb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb4MouseClicked

        if (jlb4.getText().equals("") && this.winner.equals("")) {
            if (flag) {
                //list.add(new Cell('X', 1, 1));
                //flag true turn X
                jlb4.setText("X");
                jlb4.setForeground(Color.red);
                turnX();
                //
            } else {
                //list.add(new Cell('O', 1, 1));
                jlb4.setText("O");
                jlb4.setForeground(new Color(0, 153, 0));
                turnO();
            }
            flag = !flag;
            checkTurn();
            count++;
        }

    }//GEN-LAST:event_jlb4MouseClicked

    
    
    private void jlb0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb0MouseEntered
//        if(jlb0.getText().equals("")) {
//            jlb0.setBackground(Color.red);
//        }
    }//GEN-LAST:event_jlb0MouseEntered

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlb0;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlb4;
    private javax.swing.JLabel jlb5;
    private javax.swing.JLabel jlb6;
    private javax.swing.JLabel jlb7;
    private javax.swing.JLabel jlb8;
    private javax.swing.JLabel jlbTitleTurn;
    private javax.swing.JLabel jlbTurn;
    // End of variables declaration//GEN-END:variables
}
