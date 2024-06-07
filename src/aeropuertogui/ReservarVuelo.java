
package aeropuertogui;

import aeropuertogui.DBManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ReservarVuelo extends javax.swing.JFrame {


    public ReservarVuelo() {
        initComponents();
        llenarCB();
        llenarCBPasajeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelReservarVuelo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbSeleccionarVuelo = new javax.swing.JComboBox<>();
        labelAerolinea = new javax.swing.JLabel();
        labelAeropuertoPartida = new javax.swing.JLabel();
        labelAeropuertoLlegada = new javax.swing.JLabel();
        labelDestino = new javax.swing.JLabel();
        labelCapacidad = new javax.swing.JLabel();
        labelHoraSalida = new javax.swing.JLabel();
        labelCambioAerolinea = new javax.swing.JLabel();
        labelCambioAeroPartida = new javax.swing.JLabel();
        labelCambioAeroLlegada = new javax.swing.JLabel();
        labelCambioDestino = new javax.swing.JLabel();
        labelCambioHora = new javax.swing.JLabel();
        labelCambioAsientos = new javax.swing.JLabel();
        labelPasaporte = new javax.swing.JLabel();
        labelPasajero = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        tfPasaporte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sCantidadEquipaje = new javax.swing.JSpinner();
        btReservar = new javax.swing.JButton();
        btnVerVuelos = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        btnCrearPasajero = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelSeleccionarPasajero = new javax.swing.JLabel();
        cbSeleccionarPasajero = new javax.swing.JComboBox<>();
        btnVerPasajeros = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnVerReservar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelReservarVuelo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelReservarVuelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReservarVuelo.setText("Reservar Vuelo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Seleccionar Vuelo");

        cbSeleccionarVuelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSeleccionarVuelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSeleccionarVueloItemStateChanged(evt);
            }
        });

        labelAerolinea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAerolinea.setText("Aerolinea:");

        labelAeropuertoPartida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAeropuertoPartida.setText("Aeropuerto Partida: ");

        labelAeropuertoLlegada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAeropuertoLlegada.setText("Aeropuerto Llegada:");

        labelDestino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDestino.setText("Destino: ");

        labelCapacidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCapacidad.setText("Asientos Disponibles:");

        labelHoraSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHoraSalida.setText("Hora Salida: ");

        labelCambioAerolinea.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCambioAerolinea.setText(" ");

        labelCambioAeroPartida.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCambioAeroPartida.setText(" ");

        labelCambioAeroLlegada.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCambioAeroLlegada.setText(" ");

        labelCambioDestino.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCambioDestino.setText(" ");

        labelCambioHora.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCambioHora.setText(" ");

        labelCambioAsientos.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCambioAsientos.setText(" ");

        labelPasaporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPasaporte.setText("Pasaporte: ");

        labelPasajero.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelPasajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajero.setText("Crear Pasajero");

        tfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNombre.setText("Nombre: ");

        tfPasaporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad Equipaje");

        sCantidadEquipaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sCantidadEquipaje.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        btReservar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btReservar.setText("Reservar");
        btReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarActionPerformed(evt);
            }
        });

        btnVerVuelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerVuelos.setText("Ver Vuelos");
        btnVerVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVuelosActionPerformed(evt);
            }
        });

        btnPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrecio.setText("Calcular Precio");
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });

        btnCrearPasajero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearPasajero.setText("Crear");
        btnCrearPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPasajeroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Pasajero Existente");

        labelSeleccionarPasajero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSeleccionarPasajero.setText("Seleccionar Pasajero:");

        cbSeleccionarPasajero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSeleccionarPasajero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSeleccionarPasajeroItemStateChanged(evt);
            }
        });

        btnVerPasajeros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerPasajeros.setText("Ver Pasajeros");
        btnVerPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPasajerosActionPerformed(evt);
            }
        });

        btnVaciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnVerReservar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerReservar.setText("Ver Reservas");
        btnVerReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelReservarVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelPasaporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbSeleccionarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(btnVerVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelAerolinea)
                                                .addGap(59, 59, 59)
                                                .addComponent(labelCambioAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelAeropuertoPartida)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelCambioAeroPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelAeropuertoLlegada)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelCambioAeroLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(115, 115, 115)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelDestino)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelCambioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelHoraSalida)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelCambioHora, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelCapacidad)
                                                .addGap(26, 26, 26)
                                                .addComponent(labelCambioAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelSeleccionarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSeleccionarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnVerPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(sCantidadEquipaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133)
                                        .addComponent(btnVerReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(btReservar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(btnCrearPasajero)
                .addGap(41, 41, 41)
                .addComponent(btnVaciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelReservarVuelo)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbSeleccionarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerVuelos))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAerolinea)
                    .addComponent(labelDestino)
                    .addComponent(labelCambioAerolinea)
                    .addComponent(labelCambioDestino))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAeropuertoPartida)
                    .addComponent(labelCapacidad)
                    .addComponent(labelCambioAeroPartida)
                    .addComponent(labelCambioAsientos))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAeropuertoLlegada)
                    .addComponent(labelHoraSalida)
                    .addComponent(labelCambioAeroLlegada)
                    .addComponent(labelCambioHora))
                .addGap(37, 37, 37)
                .addComponent(labelPasajero)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasaporte)
                    .addComponent(tfPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPasajero)
                    .addComponent(btnVaciar))
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSeleccionarPasajero)
                    .addComponent(cbSeleccionarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerPasajeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sCantidadEquipaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrecio)
                    .addComponent(btnVerReservar))
                .addGap(28, 28, 28)
                .addComponent(btReservar)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarActionPerformed
         if (tfPasaporte.getText().equals("")  && tfNombre.getText().equals("")){
            if (!cbSeleccionarVuelo.getSelectedItem().toString().equals("Seleccionar")){
                if (!cbSeleccionarPasajero.getSelectedItem().toString().equals("Seleccionar")){
                    if(verificarCapacidad()){
                    reservarVuelo();
                    tfPasaporte.setText("");
                    tfNombre.setText("");
                    } else{
                        JOptionPane.showMessageDialog(this,"No hay Asientos disponibles","Error",JOptionPane.ERROR_MESSAGE);  
                    }
                } else{
                    JOptionPane.showMessageDialog(this,"Debe Seleccionar un pasajero","Error",JOptionPane.ERROR_MESSAGE);  
                }
            } else{
              JOptionPane.showMessageDialog(this,"Debe seleccionar un vuelo","Error",JOptionPane.ERROR_MESSAGE);      
                }
        } else{
             JOptionPane.showMessageDialog(this,"Debe vaciar los campos Nombre y Pasaporte si ya existe el cliente","Error",JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btReservarActionPerformed
    
    private boolean verificarCapacidad(){
        int cantidad = (int) sCantidadEquipaje.getValue();
        List<String> vuelo = obtenerInfo(Integer.parseInt(cbSeleccionarVuelo.getSelectedItem().toString()));
        int capacidadActual = Integer.parseInt(vuelo.get(4));
        if(cantidad <= capacidadActual){
            return true;
        }
        return false;
        
    }
    
    private void agregarPasajero(){
        
        try(var manager = new DBManager()) {
            
            boolean resp = manager.agregarCliente(Integer.parseInt(tfPasaporte.getText()), tfNombre.getText());
            if (resp) {               
                    JOptionPane.showMessageDialog(this,"Pasajero creado Correctamente");
                    llenarCBPasajeros();

            } else {
                JOptionPane.showMessageDialog(this,"Error Registrando Pasajero","Error",JOptionPane.ERROR_MESSAGE);
                               
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            System.out.println("Estado SQL: " + ex.getSQLState());
            System.out.println("Código de error: " + ex.getErrorCode());
        }  
    }
    
    private void reservarVuelo(){
        
        try(var manager = new DBManager()) {
            
            boolean resp = manager.reservarVuelo(Integer.parseInt(cbSeleccionarVuelo.getSelectedItem().toString()),Integer.parseInt(cbSeleccionarPasajero.getSelectedItem().toString()), (int) sCantidadEquipaje.getValue(), calcularPrecio((int) sCantidadEquipaje.getValue()));
            if (resp) {

                    manager.actualizacionReserva(Integer.parseInt(cbSeleccionarVuelo.getSelectedItem().toString()));
                    JOptionPane.showMessageDialog(this,"Vuelo reservado Correctamente"); 
     
            } else {
                JOptionPane.showMessageDialog(this,"Error Registrando la Reserva","Error",JOptionPane.ERROR_MESSAGE);
                               
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            System.out.println("Estado SQL: " + ex.getSQLState());
            System.out.println("Código de error: " + ex.getErrorCode());
        }  
    }
    
    private int calcularPrecio(int cantidadEquipaje){
         return 100+(cantidadEquipaje * 10);
    }
    private void cbSeleccionarVueloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSeleccionarVueloItemStateChanged
        Object item = cbSeleccionarVuelo.getSelectedItem();
        if (item != null){
            String itemSeleccionado = item.toString();
        if (itemSeleccionado == "Seleccionar"){
            labelCambioAeroLlegada.setText("");
            labelCambioAeroPartida.setText("");
            labelCambioAerolinea.setText("");
            labelCambioAsientos.setText("");
            labelCambioDestino.setText("");
            labelCambioHora.setText("");

        } else {
            List<String> vuelo = obtenerInfo(Integer.parseInt(itemSeleccionado));
            labelCambioAeroLlegada.setText(vuelo.get(5));
            labelCambioAeroPartida.setText(vuelo.get(6));
            labelCambioAerolinea.setText(vuelo.get(1));
            labelCambioAsientos.setText(vuelo.get(4));
            labelCambioDestino.setText(vuelo.get(3));
            labelCambioHora.setText(vuelo.get(2));
        }
        }
    }//GEN-LAST:event_cbSeleccionarVueloItemStateChanged

    private void btnVerVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVuelosActionPerformed
        mostrarVuelos();
    }//GEN-LAST:event_btnVerVuelosActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        String mensaje = "El valor es: ";
        int precio = calcularPrecio((int) sCantidadEquipaje.getValue());
        mensaje += String.valueOf(precio);
        JOptionPane.showMessageDialog(this, mensaje, "Precio", JOptionPane.INFORMATION_MESSAGE);  
    }//GEN-LAST:event_btnPrecioActionPerformed

    private void cbSeleccionarPasajeroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSeleccionarPasajeroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionarPasajeroItemStateChanged

    private void btnVerPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPasajerosActionPerformed
        mostrarPasajeros();
    }//GEN-LAST:event_btnVerPasajerosActionPerformed

    private void btnCrearPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPasajeroActionPerformed
        agregarPasajero();
        tfPasaporte.setText("");
        tfNombre.setText("");
    }//GEN-LAST:event_btnCrearPasajeroActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        tfPasaporte.setText("");
        tfNombre.setText("");
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnVerReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservarActionPerformed
        mostrarReserva();
    }//GEN-LAST:event_btnVerReservarActionPerformed
    
    private List<String> obtenerInfo(int itemSeleccionado){
        List<String> vuelo = new ArrayList<>();
        try(var manager = new DBManager()){
            vuelo = manager.getInfoVuelos(itemSeleccionado);
        }catch(Exception x){
            System.out.println("Error");
        }
        return vuelo;
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
    
    public void mostrarPasajeros(){
        try(var manager= new DBManager()) {
            String mensaje=manager.mostrarPasajeros();
           
            JOptionPane.showMessageDialog(this, mensaje, "Pasajeros", JOptionPane.INFORMATION_MESSAGE);            
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
    
    private void llenarCB() {
        try(var manager = new DBManager()) {
            cbSeleccionarVuelo.removeAllItems();
            List<String> aeropuertos = manager.obtenerListaVuelos();
            cbSeleccionarVuelo.addItem("Seleccionar");
            for (String item : aeropuertos) {
            cbSeleccionarVuelo.addItem(item);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            System.out.println("Estado SQL: " + ex.getSQLState());
            System.out.println("Código de error: " + ex.getErrorCode());
        }
        
    }
    private void llenarCBPasajeros() {
        try(var manager = new DBManager()) {
            cbSeleccionarPasajero.removeAllItems();
            List<String> pasajeros = manager.obtenerListaPasajeros();
            cbSeleccionarPasajero.addItem("Seleccionar");
            
            for (String item : pasajeros) {
            cbSeleccionarPasajero.addItem(item);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Excepción SQL: " + ex.getMessage());
            System.out.println("Estado SQL: " + ex.getSQLState());
            System.out.println("Código de error: " + ex.getErrorCode());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReservar;
    private javax.swing.JButton btnCrearPasajero;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnVerPasajeros;
    private javax.swing.JButton btnVerReservar;
    private javax.swing.JButton btnVerVuelos;
    private javax.swing.JComboBox<String> cbSeleccionarPasajero;
    private javax.swing.JComboBox<String> cbSeleccionarVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAerolinea;
    private javax.swing.JLabel labelAeropuertoLlegada;
    private javax.swing.JLabel labelAeropuertoPartida;
    private javax.swing.JLabel labelCambioAeroLlegada;
    private javax.swing.JLabel labelCambioAeroPartida;
    private javax.swing.JLabel labelCambioAerolinea;
    private javax.swing.JLabel labelCambioAsientos;
    private javax.swing.JLabel labelCambioDestino;
    private javax.swing.JLabel labelCambioHora;
    private javax.swing.JLabel labelCapacidad;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelHoraSalida;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPasajero;
    private javax.swing.JLabel labelPasaporte;
    private javax.swing.JLabel labelReservarVuelo;
    private javax.swing.JLabel labelSeleccionarPasajero;
    private javax.swing.JSpinner sCantidadEquipaje;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPasaporte;
    // End of variables declaration//GEN-END:variables
}
