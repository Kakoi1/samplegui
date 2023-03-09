/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinternal;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import login.addfish;
/**
 *
 * @author College-PC
 */
public class add extends javax.swing.JInternalFrame {

  
    public add() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
         bi.setNorthPane(null);
         
        
        search.setOpaque(false);
        search.setBackground(new Color(0,0,0,0));
        
    }
    
    Color bodycolor = new Color(153,204,255);
    Color headcolor = new Color(255,153,153);
    Color hover = new Color(0,153,204);
    
    

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
        ads = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        discard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ads.setBackground(new java.awt.Color(255, 153, 153));
        ads.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ads.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ads.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adsMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add");

        javax.swing.GroupLayout adsLayout = new javax.swing.GroupLayout(ads);
        ads.setLayout(adsLayout);
        adsLayout.setHorizontalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adsLayout.setVerticalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adsLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(ads, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 30));

        update.setBackground(new java.awt.Color(255, 153, 153));
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Update");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 30));

        delete.setBackground(new java.awt.Color(255, 153, 153));
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Delete");
        delete.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, 30));

        discard.setBackground(new java.awt.Color(255, 153, 153));
        discard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        discard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        discard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discardMouseClicked(evt);
            }
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
        jLabel4.setText("Search");
        discard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(discard, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 70, 30));

        search.setBackground(new java.awt.Color(0, 153, 204));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 160, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4);
        jPanel4.setBounds(660, 0, 120, 60);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Fish Details");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 10, 290, 30);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 800, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

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

    private void discardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseExited
        discard.setBackground(headcolor);
    }//GEN-LAST:event_discardMouseExited

    private void discardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseEntered
        discard.setBackground(bodycolor);
    }//GEN-LAST:event_discardMouseEntered

    private void discardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseClicked
       
    }//GEN-LAST:event_discardMouseClicked

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(bodycolor);
    }//GEN-LAST:event_updateMouseEntered

    private void adsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseExited
        ads.setBackground(headcolor);
    }//GEN-LAST:event_adsMouseExited

    private void adsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseEntered
        ads.setBackground(bodycolor);
    }//GEN-LAST:event_adsMouseEntered

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
      
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
     
    }//GEN-LAST:event_searchMouseExited

    private void adsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseClicked
    addfish af = new addfish();
    
    af.setVisible(true);
    
    }//GEN-LAST:event_adsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ads;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel discard;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField search;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
