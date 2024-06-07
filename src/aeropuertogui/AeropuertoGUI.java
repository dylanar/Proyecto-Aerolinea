
package aeropuertogui;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class AeropuertoGUI extends javax.swing.JFrame {

    public AeropuertoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAeropuerto = new javax.swing.JMenu();
        MIAgregarAeropuerto = new javax.swing.JMenuItem();
        MIActualizarAeropuerto = new javax.swing.JMenuItem();
        MIEliminarAeropuerto = new javax.swing.JMenuItem();
        MIListarAeropuertos = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        MIReservaClientes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuVuelos = new javax.swing.JMenu();
        MIVueloSalida = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MIVueloSeguimiento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        labelPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        labelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrincipal.setText("MANAGER AEROPUERTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(labelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        menuAeropuerto.setText("Aeropuerto");

        MIAgregarAeropuerto.setText("Agregar Aeropuerto");
        MIAgregarAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAgregarAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuerto.add(MIAgregarAeropuerto);

        MIActualizarAeropuerto.setText("Actualizar Aeropuerto");
        MIActualizarAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIActualizarAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuerto.add(MIActualizarAeropuerto);

        MIEliminarAeropuerto.setText("Eliminar Aeoropuerto");
        MIEliminarAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIEliminarAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuerto.add(MIEliminarAeropuerto);

        MIListarAeropuertos.setText("Listar Aeropuertos");
        MIListarAeropuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIListarAeropuertosActionPerformed(evt);
            }
        });
        menuAeropuerto.add(MIListarAeropuertos);

        jMenuBar1.add(menuAeropuerto);

        menuClientes.setText("Clientes");

        MIReservaClientes.setText("Reservar Vuelo");
        MIReservaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIReservaClientesActionPerformed(evt);
            }
        });
        menuClientes.add(MIReservaClientes);

        jMenuItem1.setText("Seguimiento de Reservas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuClientes.add(jMenuItem1);

        jMenuBar1.add(menuClientes);

        menuVuelos.setText("Vuelos");

        MIVueloSalida.setText("Registrar Vuelo ");
        MIVueloSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIVueloSalidaActionPerformed(evt);
            }
        });
        menuVuelos.add(MIVueloSalida);
        menuVuelos.add(jSeparator1);

        MIVueloSeguimiento.setText("Seguimiento de Vuelos");
        MIVueloSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIVueloSeguimientoActionPerformed(evt);
            }
        });
        menuVuelos.add(MIVueloSeguimiento);

        jMenuBar1.add(menuVuelos);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarAeropuertos(){
        try(var manager= new DBManager()) {
            String mensaje=manager.mostrarAeropuertos();
           
            JOptionPane.showMessageDialog(this, mensaje, "Aeropuertos", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(this,"Error al obtener registro de aeropuertos","Error",JOptionPane.ERROR_MESSAGE);  
 
        }
    }
    
    public void mostrarVuelos(){
        try(var manager= new DBManager()) {
            String mensaje=manager.mostrarVuelos();
           
            JOptionPane.showMessageDialog(this, mensaje, "Vuelos", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(this,"Error al obtener registro de Vuelos","Error",JOptionPane.ERROR_MESSAGE);  
 
        }
    }
     public void mostrarReserva(){
        try(var manager= new DBManager()) {
            String mensaje=manager.mostrarReserva();
           
            JOptionPane.showMessageDialog(this, mensaje, "Reserva", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(this,"Error al obtener registro de reserva","Error",JOptionPane.ERROR_MESSAGE);  
 
        }
    }
    
    private void MIEliminarAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIEliminarAeropuertoActionPerformed
        new EliminarAeropuerto().setVisible(true);
        
    }//GEN-LAST:event_MIEliminarAeropuertoActionPerformed

    private void MIAgregarAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAgregarAeropuertoActionPerformed
        new AgregarAeropuerto().setVisible(true);

    }//GEN-LAST:event_MIAgregarAeropuertoActionPerformed

    private void MIListarAeropuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIListarAeropuertosActionPerformed
        mostrarAeropuertos();
    }//GEN-LAST:event_MIListarAeropuertosActionPerformed

    private void MIActualizarAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIActualizarAeropuertoActionPerformed
        new ActualizarAeropuerto().setVisible(true);
    }//GEN-LAST:event_MIActualizarAeropuertoActionPerformed

    private void MIVueloSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIVueloSalidaActionPerformed
        new RegistrarVuelo().setVisible(true);
    }//GEN-LAST:event_MIVueloSalidaActionPerformed

    private void MIVueloSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIVueloSeguimientoActionPerformed
        mostrarVuelos();
    }//GEN-LAST:event_MIVueloSeguimientoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mostrarReserva();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MIReservaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIReservaClientesActionPerformed
        new ReservarVuelo().setVisible(true);
    }//GEN-LAST:event_MIReservaClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIActualizarAeropuerto;
    private javax.swing.JMenuItem MIAgregarAeropuerto;
    private javax.swing.JMenuItem MIEliminarAeropuerto;
    private javax.swing.JMenuItem MIListarAeropuertos;
    private javax.swing.JMenuItem MIReservaClientes;
    private javax.swing.JMenuItem MIVueloSalida;
    private javax.swing.JMenuItem MIVueloSeguimiento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JMenu menuAeropuerto;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuVuelos;
    // End of variables declaration//GEN-END:variables
}
