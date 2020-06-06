/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import Entidades.TablaBusqVenta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class frm_agregarmascarilla extends javax.swing.JFrame {
    
    public static DefaultTableModel modelo;
    Controladores.TablaBusqVentaJpaController aggmasca = new Controladores.TablaBusqVentaJpaController();

    /**
     * Creates new form frm_agregarmascarilla
     */
    public frm_agregarmascarilla() {
        initComponents();
        createmodelo();
        cargar_informacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_busq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbx_iten = new javax.swing.JComboBox();
        btn_busq = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txt_cara = new javax.swing.JTextField();
        txt_cant = new javax.swing.JTextField();
        txt_colo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_prec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_mode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_regresar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda mascarilla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txt_busq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busqActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo :");

        cbx_iten.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "ID", "Modelos" }));

        btn_busq.setText("Buscar");
        btn_busq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(cbx_iten, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_busq)
                    .addGap(17, 17, 17)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbx_iten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_busq))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caracteristicas de Mascarilla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel3.setText("Modelo :");

        jLabel4.setText("Tamaño :");

        jLabel5.setText("Caracteristicas :");

        jLabel7.setText("Color :");

        jLabel8.setText("Precio :");

        jLabel2.setText("ID:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cara)
                    .addComponent(txt_mode)
                    .addComponent(txt_colo))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_prec)
                    .addComponent(txt_cant)
                    .addComponent(txt_id))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_cara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_colo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_prec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regresar)
                    .addComponent(btn_editar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_guardar))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busqActionPerformed
 private void Clear() {
        txt_mode.setText("");
        txt_cara.setText("");
        txt_colo.setText("");
        txt_cant.setText("");
        txt_prec.setText("");
        txt_id.setText("");
 
    }
 
    private static boolean ban = false;
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
       
        try {
            if (txt_mode.getText().length() > 0) {
                if (txt_cara.getText().length() > 0) {
                    
                    if (ban == false) {
                        TablaBusqVenta obj = new TablaBusqVenta();
                        
                        obj.setIdBusq(Integer.parseInt(txt_id.getText()));
                        obj.setModeBusq(txt_mode.getText());
                        obj.setCaraBusq(txt_cara.getText());
                        obj.setColoBusq(txt_colo.getText());
                        obj.setCantBusq(txt_cant.getText());
                        obj.setPrecBusq(txt_prec.getText());
                        
                        
                        createmodelo();
                         aggmasca.create(obj);
                        cargar_informacion();
                        Clear();
                    }
                    if (ban == true) {
                        TablaBusqVenta obj = new TablaBusqVenta();
                        
                        obj.setIdBusq(Integer.parseInt(txt_id.getText()));
                        obj.setModeBusq(txt_mode.getText());
                        obj.setCaraBusq(txt_cara.getText());
                        obj.setColoBusq(txt_colo.getText());
                        obj.setCantBusq(txt_cant.getText());
                        obj.setPrecBusq(txt_prec.getText());
                        aggmasca.edit(obj);
                        
                        createmodelo();
                        cargar_informacion();
 
                        ban = false;
                        Clear();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresela nombre");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresela cedula");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed


    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        try {
            
            if (tabla.getSelectedRow() >= 0) {
                txt_id.setText(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                txt_mode.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
                txt_cara.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
                txt_colo.setText(tabla.getValueAt(tabla.getSelectedRow(), 3).toString());
                txt_cant.setText(tabla.getValueAt(tabla.getSelectedRow(), 4).toString());
                txt_prec.setText(tabla.getValueAt(tabla.getSelectedRow(), 5).toString());

                ban = true;
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            if (tabla.getSelectedRow() >= 0) {
                
                aggmasca.destroy(Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString()));
                createmodelo();
                cargar_informacion();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_busqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busqActionPerformed
cls_consultas obj = new cls_consultas(); 
        if (cbx_iten.getSelectedItem().equals("Todos")) {
            obj.Consulta("Tabla", tabla, "SELECT id_busq as ID, mode_busq as Modelo, cara_busq as Caracteristica, colo_busq as Color, cant_busq as Tamaño, prec_busq as Precio  from tabla_busq_venta;");
        }
        if (cbx_iten.getSelectedItem().equals("ID")) {
            obj.Consulta("ID", tabla, "SELECT  id_busq as ID, mode_busq as Modelo, cara_busq as Caracteristica, colo_busq as Color, cant_busq as Tamaño, prec_busq as Precio from tabla_busq_venta Where id_busq like '%" + txt_busq.getText() + "%'");
        }
        if (cbx_iten.getSelectedItem().equals("Modelos")) {
            obj.Consulta("Modelos", tabla, "SELECT  id_busq as ID, mode_busq as Modelo, cara_busq as Caracteristica, colo_busq as Color, cant_busq as Tamaño, prec_busq as Precio from tabla_busq_venta Where mode_busq like '%" + txt_busq.getText() + "%'");
        }      
        
        
    }//GEN-LAST:event_btn_busqActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
       login_usuario.frm_menu_administrar ventana = new login_usuario.frm_menu_administrar();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed
    private void createmodelo() {
        try {
            modelo = (new DefaultTableModel(null, new String[]{"ID", "Modelo", "Caracteristica", "Color", "Cantidad", "Precio"}) {
                Class[] types = new Class[]{
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{false, false, false, false, false, false};
                
                @Override
                public Class getColumnClass(int columnindex) {
                    return types[columnindex];
                }
                
                @Override
                public boolean isCellEditable(int rowindex, int colindex) {
                    return canEdit[colindex];
                }
            });
            tabla.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "error2");
        }
    }
    
    private void cargar_informacion() {
        try {
            Object[] o = null;
            List<TablaBusqVenta> lista = aggmasca.findTablaBusqVentaEntities();
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(o);
                modelo.setValueAt(lista.get(i).getIdBusq(), i, 0);
                modelo.setValueAt(lista.get(i).getModeBusq(), i, 1);
                modelo.setValueAt(lista.get(i).getCaraBusq(), i, 2);
                modelo.setValueAt(lista.get(i).getColoBusq(), i, 3);
                modelo.setValueAt(lista.get(i).getCantBusq(), i, 4);
                modelo.setValueAt(lista.get(i).getPrecBusq(), i, 5);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(frm_agregarmascarilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_agregarmascarilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_agregarmascarilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_agregarmascarilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_agregarmascarilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busq;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_iten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_busq;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_cara;
    private javax.swing.JTextField txt_colo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_mode;
    private javax.swing.JTextField txt_prec;
    // End of variables declaration//GEN-END:variables
}
