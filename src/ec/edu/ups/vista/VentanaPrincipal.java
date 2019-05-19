/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorFacturaDetalle;
import ec.edu.ups.controlador.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author 
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VistaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();
        controladorFactura = new ControladorFactura();
        controladorFacturaDetalle=new ControladorFacturaDetalle();
        //System.out.println("Localizacion por defecto :"+Locale.getDefault().getLanguage());
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        //System.out.println("Localizacion forzada :"+Locale.getDefault().getLanguage());
        //mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());//tengo que poner el nombre del paquete mas el nombre del archivo
        //System.out.println("Mensajes");
        //System.out.println(mensajes.getString("menu.item.crear"));
        cambiarIdioma();
    }

    public void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        
        clienteMenu.setText(mensajes.getString("menu.cliente"));
        productoMenu.setText(mensajes.getString("menu.producto"));
        facturaMenu.setText(mensajes.getString("menu.factura"));
        idiomaMenu.setText(mensajes.getString("menu.idiomas"));

        itmCreateCliente.setText(mensajes.getString("menu.item.crear"));
        itmCreateProducto.setText(mensajes.getString("menu.item.crear"));
        itmCreateFactura.setText(mensajes.getString("menu.item.crear"));

        itmReadCliente.setText(mensajes.getString("menu.item.buscar"));
        itmReadProducto.setText(mensajes.getString("menu.item.buscar"));
        itmReadFactura.setText(mensajes.getString("menu.item.buscar"));

        itmUpdateCliente.setText(mensajes.getString("menu.item.actualizar"));
        itmUpdateProducto.setText(mensajes.getString("menu.item.actualizar"));
        itmUpdateFactura.setText(mensajes.getString("menu.item.actualizar"));

        itmDeleateCliente.setText(mensajes.getString("menu.item.eliminar"));
        itmDeleateProducto.setText(mensajes.getString("menu.item.eliminar"));
        itmDeleateFactura.setText(mensajes.getString("menu.item.eliminar"));

        itmListarCliente.setText(mensajes.getString("menu.item.listar"));
        itmListarProducto.setText(mensajes.getString("menu.item.listar"));
        itmListarFactura.setText(mensajes.getString("menu.item.listar"));
        
        
       // itmCreateFactura.setText(mensajes.getString("menu.item.crear"));        itm
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        itmCreateCliente = new javax.swing.JMenuItem();
        itmReadCliente = new javax.swing.JMenuItem();
        itmUpdateCliente = new javax.swing.JMenuItem();
        itmDeleateCliente = new javax.swing.JMenuItem();
        itmListarCliente = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenu();
        itmCreateProducto = new javax.swing.JMenuItem();
        itmReadProducto = new javax.swing.JMenuItem();
        itmUpdateProducto = new javax.swing.JMenuItem();
        itmDeleateProducto = new javax.swing.JMenuItem();
        itmListarProducto = new javax.swing.JMenuItem();
        facturaMenu = new javax.swing.JMenu();
        itmCreateFactura = new javax.swing.JMenuItem();
        itmReadFactura = new javax.swing.JMenuItem();
        itmUpdateFactura = new javax.swing.JMenuItem();
        itmDeleateFactura = new javax.swing.JMenuItem();
        itmListarFactura = new javax.swing.JMenuItem();
        idiomaMenu = new javax.swing.JMenu();
        itmEspanolFactura1 = new javax.swing.JMenuItem();
        itmInglesFactura1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        itmCreateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateCliente.setMnemonic('o');
        itmCreateCliente.setText("Create");
        itmCreateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmCreateCliente);

        itmReadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadCliente.setMnemonic('s');
        itmReadCliente.setText("Read");
        itmReadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmReadCliente);

        itmUpdateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateCliente.setMnemonic('a');
        itmUpdateCliente.setText("Update");
        itmUpdateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmUpdateCliente);

        itmDeleateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateCliente.setMnemonic('x');
        itmDeleateCliente.setText("Delete");
        itmDeleateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmDeleateCliente);

        itmListarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarCliente.setText("Listar");
        itmListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmListarCliente);

        menuBar.add(clienteMenu);

        productoMenu.setText("Producto");

        itmCreateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateProducto.setMnemonic('o');
        itmCreateProducto.setText("Create");
        itmCreateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmCreateProducto);

        itmReadProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadProducto.setMnemonic('s');
        itmReadProducto.setText("Read");
        itmReadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmReadProducto);

        itmUpdateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateProducto.setMnemonic('a');
        itmUpdateProducto.setText("Update");
        itmUpdateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmUpdateProducto);

        itmDeleateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateProducto.setMnemonic('x');
        itmDeleateProducto.setText("Delete");
        itmDeleateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmDeleateProducto);

        itmListarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarProducto.setText("Listar");
        itmListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmListarProducto);

        menuBar.add(productoMenu);

        facturaMenu.setText("Factura");

        itmCreateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCreateFactura.setMnemonic('o');
        itmCreateFactura.setText("Create");
        itmCreateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmCreateFactura);

        itmReadFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadFactura.setMnemonic('s');
        itmReadFactura.setText("Read");
        itmReadFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmReadFactura);

        itmUpdateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        itmUpdateFactura.setMnemonic('a');
        itmUpdateFactura.setText("Update");
        itmUpdateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmUpdateFactura);

        itmDeleateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmDeleateFactura.setMnemonic('x');
        itmDeleateFactura.setText("Delete");
        itmDeleateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmDeleateFactura);

        itmListarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmListarFactura.setText("Listar");
        itmListarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmListarFactura);

        menuBar.add(facturaMenu);

        idiomaMenu.setText("Idiomas");

        itmEspanolFactura1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmEspanolFactura1.setMnemonic('o');
        itmEspanolFactura1.setText("Español");
        itmEspanolFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEspanolFactura1ActionPerformed(evt);
            }
        });
        idiomaMenu.add(itmEspanolFactura1);

        itmInglesFactura1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmInglesFactura1.setMnemonic('s');
        itmInglesFactura1.setText("Ingles");
        itmInglesFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInglesFactura1ActionPerformed(evt);
            }
        });
        idiomaMenu.add(itmInglesFactura1);

        menuBar.add(idiomaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmDeleateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateClienteActionPerformed
        VentanaEliminarCliente deleteCliente = new VentanaEliminarCliente(controladorCliente,mensajes);
        deleteCliente.setVisible(true);
        desktopPane.add(deleteCliente);
    }//GEN-LAST:event_itmDeleateClienteActionPerformed

    private void itmListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarClienteActionPerformed
        VentanaListarCliente listarCliente=new VentanaListarCliente(controladorCliente,mensajes);
        listarCliente.setVisible(true);
        desktopPane.add(listarCliente);      
        
        
    }//GEN-LAST:event_itmListarClienteActionPerformed

    private void itmCreateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateClienteActionPerformed
        // TODO add your handling code here:
        VentanaCrearCliente crearCliente = new VentanaCrearCliente(controladorCliente,mensajes);
        crearCliente.setVisible(true);
        desktopPane.add(crearCliente);

    }//GEN-LAST:event_itmCreateClienteActionPerformed

    private void itmReadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadClienteActionPerformed
        // TODO add your handling code here:
        VentanaLeerCliente readCliente = new VentanaLeerCliente(controladorCliente,mensajes);
        readCliente.setVisible(true);
        desktopPane.add(readCliente);
    }//GEN-LAST:event_itmReadClienteActionPerformed

    private void itmUpdateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateClienteActionPerformed
        // TODO add your handling code here:
        VentanaActualizarCliente updateCliente = new VentanaActualizarCliente(controladorCliente,mensajes);
        updateCliente.setVisible(true);
        desktopPane.add(updateCliente);
    }//GEN-LAST:event_itmUpdateClienteActionPerformed

    private void itmCreateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateProductoActionPerformed
        // TODO add your handling code here:
        VentanaCrearProducto crearProducto = new VentanaCrearProducto(controladorProducto,controladorFacturaDetalle,mensajes);
        crearProducto.setVisible(true);
        desktopPane.add(crearProducto);
    }//GEN-LAST:event_itmCreateProductoActionPerformed

    private void itmReadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadProductoActionPerformed
        // TODO add your handling code here:
        VentanaLeerProducto readProducto = new VentanaLeerProducto(controladorProducto,mensajes);
        readProducto.setVisible(true);
        desktopPane.add(readProducto);
    }//GEN-LAST:event_itmReadProductoActionPerformed

    private void itmUpdateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateProductoActionPerformed
        // TODO add your handling code here:
        VentanaActualizarProductos updateProducto = new VentanaActualizarProductos(controladorProducto,mensajes);
        updateProducto.setVisible(true);
        desktopPane.add(updateProducto);
    }//GEN-LAST:event_itmUpdateProductoActionPerformed

    private void itmDeleateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateProductoActionPerformed
        // TODO add your handling code here:
        VentanaEliminarProducto deleteProducto = new VentanaEliminarProducto(controladorProducto,mensajes);
        deleteProducto.setVisible(true);
        desktopPane.add(deleteProducto);
    }//GEN-LAST:event_itmDeleateProductoActionPerformed

    private void itmListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarProductoActionPerformed
        VentanaListarProductos listarProducto=new VentanaListarProductos(controladorProducto,mensajes);
        listarProducto.setVisible(true);
        desktopPane.add(listarProducto); 
       
    }//GEN-LAST:event_itmListarProductoActionPerformed

    private void itmCreateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateFacturaActionPerformed
        // TODO add your handling code here:
        VentanaCrearFactura crearFactura = new VentanaCrearFactura(controladorFactura, controladorCliente,controladorProducto,controladorFacturaDetalle);
        crearFactura.setVisible(true);
        desktopPane.add(crearFactura);
    }//GEN-LAST:event_itmCreateFacturaActionPerformed

    private void itmReadFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadFacturaActionPerformed
        VentanaLeerFactura buscarFactura=new VentanaLeerFactura(controladorProducto);
        buscarFactura.setVisible(true);
        desktopPane.add(buscarFactura);
    }//GEN-LAST:event_itmReadFacturaActionPerformed

    private void itmUpdateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateFacturaActionPerformed
        // TODO add your handling code here:
        VentanaActualizarFactura updateFactura = new VentanaActualizarFactura(controladorFactura, controladorCliente);
        updateFactura.setVisible(true);
        desktopPane.add(updateFactura);
    }//GEN-LAST:event_itmUpdateFacturaActionPerformed

    private void itmDeleateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleateFacturaActionPerformed
      VentanaEliminarFactura deleteFactura = new VentanaEliminarFactura(controladorProducto);
        deleteFactura.setVisible(true);
        desktopPane.add(deleteFactura);       
        
        
        
    }//GEN-LAST:event_itmDeleateFacturaActionPerformed

    private void itmListarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarFacturaActionPerformed
        VentanaListarFactura listarFacturas=new VentanaListarFactura(controladorFactura);
        listarFacturas.setVisible(true);
        desktopPane.add(listarFacturas);      

        
    }//GEN-LAST:event_itmListarFacturaActionPerformed

    private void itmEspanolFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEspanolFactura1ActionPerformed
       // TODO add your handling code here:
        localizacion=new Locale("es","EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();        
    }//GEN-LAST:event_itmEspanolFactura1ActionPerformed

    private void itmInglesFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInglesFactura1ActionPerformed
        // TODO add your handling code here:
        
        localizacion=new Locale("en","US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        
    }//GEN-LAST:event_itmInglesFactura1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu facturaMenu;
    private javax.swing.JMenu idiomaMenu;
    private javax.swing.JMenuItem itmCreateCliente;
    private javax.swing.JMenuItem itmCreateFactura;
    private javax.swing.JMenuItem itmCreateProducto;
    private javax.swing.JMenuItem itmDeleateCliente;
    private javax.swing.JMenuItem itmDeleateFactura;
    private javax.swing.JMenuItem itmDeleateProducto;
    private javax.swing.JMenuItem itmEspanolFactura1;
    private javax.swing.JMenuItem itmInglesFactura1;
    private javax.swing.JMenuItem itmListarCliente;
    private javax.swing.JMenuItem itmListarFactura;
    private javax.swing.JMenuItem itmListarProducto;
    private javax.swing.JMenuItem itmReadCliente;
    private javax.swing.JMenuItem itmReadFactura;
    private javax.swing.JMenuItem itmReadProducto;
    private javax.swing.JMenuItem itmUpdateCliente;
    private javax.swing.JMenuItem itmUpdateFactura;
    private javax.swing.JMenuItem itmUpdateProducto;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu productoMenu;
    // End of variables declaration//GEN-END:variables

}
