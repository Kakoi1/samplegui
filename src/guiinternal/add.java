/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinternal;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author College-PC
 */
public class add extends javax.swing.JInternalFrame {

    /**
     * Creates new form add
     */
    public add() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
         bi.setNorthPane(null);
        
    }
    
    Color headcolor = new Color(153,204,255);
    Color bodycolor = new Color(255,204,204);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        discard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Save List");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout saveLayout = new javax.swing.GroupLayout(save);
        save.setLayout(saveLayout);
        saveLayout.setHorizontalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        saveLayout.setVerticalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 30));

        discard.setBackground(new java.awt.Color(153, 204, 255));
        discard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        discard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        discard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                discardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                discardMouseExited(evt);
            }
        });
        discard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Discard");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        discard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel2.add(discard, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 770, 60));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(bodycolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseExited

    private void discardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseEntered
        discard.setBackground(bodycolor);
    }//GEN-LAST:event_discardMouseEntered

    private void discardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseExited
        discard.setBackground(headcolor);
    }//GEN-LAST:event_discardMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel discard;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel save;
    // End of variables declaration//GEN-END:variables
}
