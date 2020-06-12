/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import Entidades.TablaBusqVenta;
import Entidades.TablaVentas;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static proyectointegrador.frm_agregarmascarilla.modelo;
import static proyectointegrador.frm_ventas.modelo;

/**
 *
 * @author clina
 */
public class frm_admin_ventas extends javax.swing.JFrame {
  public static DefaultTableModel modelo;
    Controladores.TablaVentasJpaController ventas = new Controladores.TablaVentasJpaController();
    /**
     * Creates new form frm_admin_ventas
     */
    public frm_admin_ventas() {
        initComponents();
        try {
            Proyectointegrador fondo = new Proyectointegrador(ImageIO.read(new File("imagenes/admin.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error no se econtro la imagen", JOptionPane.ERROR_MESSAGE);
        }
        setLocationRelativeTo(null);
        createmodelo();
        cargar_informacion();
        try {
            Proyectointegrador fondo = new Proyectointegrador(ImageIO.read(new File("imagenes/admin.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error no se econtro la imagen", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        txt_busq = new javax.swing.JTextField();
        cbx_iten = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

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

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_regresar)
                    .addComponent(btn_eliminar))
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        cbx_iten.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "DNI", "Pais", "Ciudad", "Codigo postal", "Direccion", "Tarjeta credito" }));

        jLabel1.setText("Seleccione:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbx_iten, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_iten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_buscar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
     login_usuario.frm_menu_administrar ventana = new login_usuario.frm_menu_administrar();
       ventana.setVisible(true);
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
             try {
            if (tabla.getSelectedRow() >= 0) {

                ventas.destroy(Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString()));
                createmodelo();
                cargar_informacion();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
         try{
        cls_consultas obj = new cls_consultas();
        if (cbx_iten.getSelectedItem().equals("Todos")) {
            obj.Consulta("Tabla", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_postal, dire_ven as Direccion, num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas ;");
        }
        if (cbx_iten.getSelectedItem().equals("DNI")) {
            obj.Consulta("DNI", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_postal, dire_ven as Direccion,num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas Where dni_ven like '%" + txt_busq.getText() + "%'");
        }
        if (cbx_iten.getSelectedItem().equals("Pais")) {
            obj.Consulta("Pais", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_postal, dire_ven as Direccion,num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas  Where pais_ven like '%" + txt_busq.getText() + "%'");
        }
        if (cbx_iten.getSelectedItem().equals("Ciudad")) {
            obj.Consulta("Ciudad", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_postal, dire_ven as Direccion, num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas  Where ciud_ven like '%" + txt_busq.getText() + "%'");
        }
        if (cbx_iten.getSelectedItem().equals("Codigo postal")) {
            obj.Consulta("Postal", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_postal, dire_ven as Direccion, num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas  Where post_ven like '%" + txt_busq.getText() + "%'");
        }
        if (cbx_iten.getSelectedItem().equals("Direccion")) {
            obj.Consulta("Direccion", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_psotal, dire_ven as Direccion, num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas Where dire_ven like '%" + txt_busq.getText() + "%'");
        }
        if (cbx_iten.getSelectedItem().equals("Tarjeta credito")) {
            obj.Consulta("Numero_de_tarjeta", tabla, "SELECT dni_ven as DNI, pais_ven as Pais, ciud_ven as Ciudad, post_ven as Codigo_psotal, dire_ven as Direccion,num_tar as Numero_tarjeta, fech_tar as Fecha_valida, codi_tar as CVV from tabla_ventas Where num_tar like '%" + txt_busq.getText()+ "%'");
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
private void createmodelo() {
        try {
            modelo = (new DefaultTableModel(null, new String[]{"DNI", "Pais", "Ciudad", "Codigo postal", "Direccion", "Numero tarjeta", "Fecha valida", "CVV", "ID"}) {
                Class[] types = new Class[]{
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class};
                boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false, false, false};

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
            List<TablaVentas> lista = ventas.findTablaVentasEntities();
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(o);
                modelo.setValueAt(lista.get(i).getDniVen(), i, 0);
                modelo.setValueAt(lista.get(i).getPaisVen(), i, 1);
                modelo.setValueAt(lista.get(i).getCiudVen(), i, 2);
                modelo.setValueAt(lista.get(i).getPostVen(), i, 3);
                modelo.setValueAt(lista.get(i).getDireVen(), i, 4);
                modelo.setValueAt(lista.get(i).getNumTar(), i, 5);
                modelo.setValueAt(lista.get(i).getFechTar(), i, 6);
                modelo.setValueAt(lista.get(i).getCodiTar(), i, 7);
                modelo.setValueAt(lista.get(i).getIdBusq(), i, 8);
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
            java.util.logging.Logger.getLogger(frm_admin_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_admin_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_admin_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_admin_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_admin_ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_iten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_busq;
    // End of variables declaration//GEN-END:variables
}
