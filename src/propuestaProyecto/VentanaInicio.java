/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propuestaProyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bg_opAlmacen = new javax.swing.JPanel();
        opAlmacen = new javax.swing.JLabel();
        bg_opVentas = new javax.swing.JPanel();
        opVentas = new javax.swing.JLabel();
        bg_opEmpleado = new javax.swing.JPanel();
        opEmpleado = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgMenu.setBackground(new java.awt.Color(0, 0, 128));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa menu.png"))); // NOI18N

        bg_opAlmacen.setBackground(new java.awt.Color(0, 121, 235));

        opAlmacen.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        opAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        opAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        opAlmacen.setText("INVENTARIO");
        opAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opAlmacen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        opAlmacen.setIconTextGap(8);
        opAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opAlmacenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opAlmacenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opAlmacenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_opAlmacenLayout = new javax.swing.GroupLayout(bg_opAlmacen);
        bg_opAlmacen.setLayout(bg_opAlmacenLayout);
        bg_opAlmacenLayout.setHorizontalGroup(
            bg_opAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg_opAlmacenLayout.setVerticalGroup(
            bg_opAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opAlmacen)
        );

        bg_opVentas.setBackground(new java.awt.Color(0, 121, 235));

        opVentas.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        opVentas.setForeground(new java.awt.Color(255, 255, 255));
        opVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        opVentas.setText("GENERAR VENTA");
        opVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        opVentas.setIconTextGap(8);
        opVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opVentasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_opVentasLayout = new javax.swing.GroupLayout(bg_opVentas);
        bg_opVentas.setLayout(bg_opVentasLayout);
        bg_opVentasLayout.setHorizontalGroup(
            bg_opVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg_opVentasLayout.setVerticalGroup(
            bg_opVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opVentas)
        );

        bg_opEmpleado.setBackground(new java.awt.Color(0, 121, 235));

        opEmpleado.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        opEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        opEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo usuario.png"))); // NOI18N
        opEmpleado.setText("GENERAR USUARIO");
        opEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        opEmpleado.setIconTextGap(8);
        opEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opEmpleadoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_opEmpleadoLayout = new javax.swing.GroupLayout(bg_opEmpleado);
        bg_opEmpleado.setLayout(bg_opEmpleadoLayout);
        bg_opEmpleadoLayout.setHorizontalGroup(
            bg_opEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg_opEmpleadoLayout.setVerticalGroup(
            bg_opEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opEmpleado)
        );

        javax.swing.GroupLayout bgMenuLayout = new javax.swing.GroupLayout(bgMenu);
        bgMenu.setLayout(bgMenuLayout);
        bgMenuLayout.setHorizontalGroup(
            bgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bg_opAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bg_opVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bg_opEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgMenuLayout.setVerticalGroup(
            bgMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(bg_opAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bg_opVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bg_opEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        bg.add(bgMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 780));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        bg.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 880, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Funcion para resaltar el boton para feedback a usuario
    private void resaltar(JPanel p){
        p.setBackground(new Color(0,180,235));
    }
    //Funcion para volver a la normalidad el color del boton
    private void normal(JPanel p){
        p.setBackground(new Color(0,121,235));
    }
    // metodo para llamar a los paneles 
    private void cambioPanel(JPanel p){
        p.setSize(880, 780);
        p.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        
    }
    private void opAlmacenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opAlmacenMouseEntered
        resaltar(bg_opAlmacen);
    }//GEN-LAST:event_opAlmacenMouseEntered

    private void opAlmacenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opAlmacenMouseExited
        normal(bg_opAlmacen);
    }//GEN-LAST:event_opAlmacenMouseExited

    private void opVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opVentasMouseEntered
        resaltar(bg_opVentas);
    }//GEN-LAST:event_opVentasMouseEntered

    private void opVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opVentasMouseExited
        normal(bg_opVentas);
    }//GEN-LAST:event_opVentasMouseExited

    private void opEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opEmpleadoMouseEntered
        resaltar(bg_opEmpleado);
    }//GEN-LAST:event_opEmpleadoMouseEntered

    private void opEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opEmpleadoMouseExited
        normal(bg_opEmpleado);
    }//GEN-LAST:event_opEmpleadoMouseExited

    private void opAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opAlmacenMouseClicked
        Inventario p1= new Inventario();
        cambioPanel(p1);
    }//GEN-LAST:event_opAlmacenMouseClicked

    private void opEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opEmpleadoMouseClicked

    }//GEN-LAST:event_opEmpleadoMouseClicked

    private void opVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opVentasMouseClicked
        Ventas p2= new Ventas();
        cambioPanel(p2);
    }//GEN-LAST:event_opVentasMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgMenu;
    private javax.swing.JPanel bg_opAlmacen;
    private javax.swing.JPanel bg_opEmpleado;
    private javax.swing.JPanel bg_opVentas;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel opAlmacen;
    private javax.swing.JLabel opEmpleado;
    private javax.swing.JLabel opVentas;
    // End of variables declaration//GEN-END:variables
}