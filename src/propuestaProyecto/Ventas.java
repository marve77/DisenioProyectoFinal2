/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propuestaProyecto;

import COMBOs.COMBOEmpleado;
import POJOs.Empleado;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keyme
 */
public class Ventas extends javax.swing.JPanel {
    public static DefaultTableModel m;
    private Integer cantidad;
    private String producto;
    private Integer idFactura;
    private Integer idProducto;
    private Integer idEmpelado;
    private BigDecimal precio;
    private BigDecimal total;
    private Integer idCliente;

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
    }

    public void cargarComboEmpleado() {
        Integer id;
        String empleado;
        ArrayList<POJOs.Empleado> list;
        list = (ArrayList<Empleado>) CRUDs.CRUDEmpleado.universo();
        comboEmpleado.removeAllItems();
        comboEmpleado.addItem(new COMBOEmpleado(0, "seleccione su Nombre"));
        for (int i = 0; i < list.size(); i++) {
            id = list.get(i).getIdEmpleado();
            empleado = list.get(i).getNombreEmpleado();
            comboEmpleado.addItem(new COMBOEmpleado(id, empleado));
        }

    }
        public void mostrarDetalle() {
        Integer comparador;
        boolean estado=false;
        comparador=CRUDs.CRUDDetalle.select(estado,getIdFactura()).getVenta().getIdFactura();
            
        if(getIdFactura().equals(comparador)){
            try {
            List<POJOs.Detalle> detalle = CRUDs.CRUDDetalle.universo();
            String titulos[] = {"Código Producto","Estado","Código Factura", "Nombre Producto", "Cantidad","Precio", "Total"};
            m = new DefaultTableModel(null, titulos);
            idProducto=getIdProducto();
            idFactura=getIdFactura();
            producto=txt_nombreProducto.getText();
            String columna[] = new String[7];
            for (POJOs.Detalle r : detalle) {
                    columna[0] = idProducto+"";
                    columna[1] = r.getEstado()+"";
                    columna[2] = r.getVenta().getIdFactura()+"";
                    columna[3] = r.getProducto().getNombreProducto();
                    columna[4] = r.getCantidad()+"";
                    columna[5] = r.getPrecioProducto()+"";
                    columna[6] = r.getTotal()+"";
                
                m.addRow(columna);
                tablaDetalle.setModel(m);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);
        }
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

        jLabel1 = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        comboEmpleado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        po_cerrarEncabezado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        op_agregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NIT:");

        txt_nit.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_nit.setBorder(null);
        txt_nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nitKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        txt_cliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_cliente.setBorder(null);
        txt_cliente.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TEL:");

        txt_telefono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_telefono.setBorder(null);
        txt_telefono.setEnabled(false);

        comboEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        comboEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        comboEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboEmpleadoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Producto");

        txt_nombreProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombreProducto.setBorder(null);
        txt_nombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreProductoKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");

        txt_cantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        txt_cantidad.setBorder(null);
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio");

        txt_precio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio.setBorder(null);
        txt_precio.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Stok");

        txt_stock.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_stock.setForeground(new java.awt.Color(0, 0, 0));
        txt_stock.setBorder(null);
        txt_stock.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total");

        txt_total.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_total.setForeground(new java.awt.Color(0, 0, 0));
        txt_total.setBorder(null);
        txt_total.setEnabled(false);

        po_cerrarEncabezado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        po_cerrarEncabezado.setText("Cerrar encabezado");
        po_cerrarEncabezado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                po_cerrarEncabezadoActionPerformed(evt);
            }
        });

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDetalle);

        op_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Añadir al carrito1.png"))); // NOI18N
        op_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(po_cerrarEncabezado)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addComponent(txt_nit))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addComponent(txt_cliente))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(txt_telefono))
                            .addGap(33, 33, 33)
                            .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombreProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(op_agregar))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator5)
                                            .addComponent(txt_cantidad)
                                            .addComponent(txt_precio)
                                            .addComponent(jSeparator6)
                                            .addComponent(txt_stock)
                                            .addComponent(jSeparator7)
                                            .addComponent(txt_total)
                                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(po_cerrarEncabezado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        cargarComboEmpleado();
    }//GEN-LAST:event_formPropertyChange

    private void txt_nitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean bandera = false;
            String nit, nombreCleinte, telefono;
            Integer usuario;

            nit = txt_nit.getText();
            nombreCleinte = CRUDs.CRUDCliente.select(nit).getNombreCliente() + " " + CRUDs.CRUDCliente.select(nit).getApellidoCliente();
            telefono = CRUDs.CRUDCliente.select(nit).getTelefono();
            setIdCliente(CRUDs.CRUDCliente.select(nit).getIdCliente());

            txt_cliente.setText(nombreCleinte);
            txt_telefono.setText(telefono);

            comboEmpleado.requestFocus();

        }
    }//GEN-LAST:event_txt_nitKeyPressed

    private void comboEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboEmpleadoKeyPressed

    }//GEN-LAST:event_comboEmpleadoKeyPressed

    private void txt_nombreProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProductoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Integer existencia;

            producto = txt_nombreProducto.getText();

            setIdProducto(CRUDs.CRUDProducto.select(producto).getIdProducto());
            precio = CRUDs.CRUDProducto.select(producto).getPrecioProducto();
            existencia = CRUDs.CRUDProducto.select(producto).getExistecnia();

            txt_precio.setText(precio + "");
            txt_stock.setText(existencia + "");

            txt_cantidad.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreProductoKeyPressed

    private void txt_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BigDecimal cant;
            Integer stok;
            String cantidadT, stokT;

            stokT = txt_stock.getText();
            stok = Integer.parseInt(stokT);
            cantidadT = txt_cantidad.getText();
            cantidad = Integer.parseInt(cantidadT);

            if (stok < cantidad) {
                JOptionPane.showMessageDialog(null, "No se puede surtir la venta en su totalidad");
                if (stok == 0) {
                    JOptionPane.showMessageDialog(null, "Producto Agotado");
                }
            } else {
                cant = new BigDecimal(cantidad);
                total = cant.multiply(precio);
                txt_total.setText(total + "");
            }
        }


    }//GEN-LAST:event_txt_cantidadKeyPressed

    private void po_cerrarEncabezadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_po_cerrarEncabezadoActionPerformed
        Date fecha=new Date();
        boolean bandera=false;
        Integer usuario;
        COMBOEmpleado empleado =(COMBOEmpleado)comboEmpleado.getSelectedItem();
         
        usuario=empleado.getIdEmpleado();
        bandera=CRUDs.CRUDVenta.insert(getIdCliente(), usuario);
        System.out.println(getIdCliente());
        if(bandera){
            JOptionPane.showMessageDialog(null, "Encabezado registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Encabezado no valido");
        }
    }//GEN-LAST:event_po_cerrarEncabezadoActionPerformed

    private void op_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_agregarActionPerformed
        boolean bandera = false;
        boolean estado = false;
        setIdFactura(CRUDs.CRUDVenta.select(estado).getIdFactura());
        System.out.println("factura" + getIdFactura());
        System.out.println("producto" + getIdProducto());
        bandera = CRUDs.CRUDDetalle.insert(estado, getIdProducto(), getIdFactura(), cantidad, precio, total);
        if (bandera) {
            estado = true;
            CRUDs.CRUDDetalle.updateEstado(estado);
            JOptionPane.showMessageDialog(null, "Producto Ingresado");
            mostrarDetalle();
            if (bandera == false) {
                Integer cantidadN, cantidadExtraida;
                BigDecimal totalN, totalExtraido;
                cantidadExtraida = CRUDs.CRUDDetalle.select(estado,0).getCantidad();
                totalExtraido = CRUDs.CRUDDetalle.select(estado,0).getTotal();

                cantidadN = getCantidad() + cantidadExtraida;
                totalN = getTotal().add(totalExtraido);

                CRUDs.CRUDDetalle.update(cantidadN, totalN);
                JOptionPane.showMessageDialog(null, "Se selecionó un producto existente se añadio ahí el producto seleccionado");
                mostrarDetalle();
            } else {
                JOptionPane.showMessageDialog(null, "Registro fallido");
            }
        }

    }//GEN-LAST:event_op_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> comboEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton op_agregar;
    private javax.swing.JButton po_cerrarEncabezado;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the idEmpelado
     */
    public Integer getIdEmpelado() {
        return idEmpelado;
    }

    /**
     * @param idEmpelado the idEmpelado to set
     */
    public void setIdEmpelado(Integer idEmpelado) {
        this.idEmpelado = idEmpelado;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idFactura
     */
    public Integer getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the idProducto
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
