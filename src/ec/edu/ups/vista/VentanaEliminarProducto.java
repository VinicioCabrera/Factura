/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorProducto;
import java.util.ResourceBundle;

/**
 *
 * @author 
 */
public class VentanaEliminarProducto extends javax.swing.JInternalFrame {
    private ResourceBundle mensajes;
    private ControladorProducto controladorProducto;
    /**
     * Creates new form DeleteCliente
     */
    public VentanaEliminarProducto(ControladorProducto controladorProducto,ResourceBundle mensajes) {
        initComponents();
        this.controladorProducto = controladorProducto;
        this.mensajes = mensajes;
    }
public void cambiarIdioma(ResourceBundle mensajes){
jlbTituloElimProd.setText(mensajes.getString("Ventana.Eliminar.Producto"));
jlbCodigoElimProd.setText(mensajes.getString("Ventanas.Codigo"));

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbCodigoElimProd = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jlbTituloElimProd = new javax.swing.JLabel();

        setClosable(true);

        jlbCodigoElimProd.setText("INGRESAR CODIGO :");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jlbTituloElimProd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTituloElimProd.setText("ELIMINAR PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jlbTituloElimProd)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbCodigoElimProd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbTituloElimProd, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCodigoElimProd))
                .addGap(36, 36, 36)
                .addComponent(btnEliminar)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtEliminar.getText());
        controladorProducto.delete(codigo);
        txtEliminar.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jlbCodigoElimProd;
    private javax.swing.JLabel jlbTituloElimProd;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
