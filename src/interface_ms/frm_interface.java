/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_ms;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import java.util.Random;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectointegrador.Proyectointegrador;
//sas

/**
 *
 * @author Bryan
 */
public class frm_interface extends javax.swing.JFrame {

    /**
     * Creates new form frm_interface
     */
    public frm_interface() {
        initComponents();

        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconss.png")).getImage());

        try {
            Proyectointegrador fondo = new Proyectointegrador(ImageIO.read(new File("imagenes/user.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error no se econtro la imagen", JOptionPane.ERROR_MESSAGE);
        }
        //setLocationRelativeTo(null);
        //Random aleatorio = new Random();
        //int num = aleatorio.nextInt(5);
//System.out.print(num);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrar_cesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_bateria = new javax.swing.JButton();
        img_bt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_filtro = new javax.swing.JButton();
        imgn_filtro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_temperatura = new javax.swing.JButton();
        imgn_tem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_oxigeno = new javax.swing.JButton();
        imgn_oxign = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        masinformacion1 = new javax.swing.JButton();
        masinformacion2 = new javax.swing.JButton();

        lbl_user = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cerrar_cesion.setText("cerrar cesion");
        cerrar_cesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_cesionActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del ususario :");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel2.setText("Mascarilla INT");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de mascarilla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N
        jPanel5.setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bateria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N
        jPanel1.setOpaque(false);

        btn_bateria.setText("Estado de bateria");
        btn_bateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bateriaActionPerformed(evt);
            }
        });

        img_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargador.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(img_bt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_bateria)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_bateria)
                .addGap(18, 18, 18)
                .addComponent(img_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N
        jPanel2.setOpaque(false);

        btn_filtro.setText("Estado del filtro");
        btn_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtroActionPerformed(evt);
            }
        });

        imgn_filtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filtro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(imgn_filtro)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_filtro)
                .addGap(12, 12, 12)
                .addComponent(imgn_filtro, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temperatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N
        jPanel3.setOpaque(false);

        btn_temperatura.setText("Nivel de temperatura");
        btn_temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temperaturaActionPerformed(evt);
            }
        });

        imgn_tem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/temperatura.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_temperatura)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(imgn_tem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_temperatura)
                .addGap(18, 18, 18)
                .addComponent(imgn_tem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nvl Oxigeno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N
        jPanel4.setOpaque(false);

        btn_oxigeno.setText("Nivel de oxigeno");
        btn_oxigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oxigenoActionPerformed(evt);
            }
        });

        imgn_oxign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oxigeno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgn_oxign, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_oxigeno)))
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_oxigeno)
                .addGap(20, 20, 20)
                .addComponent(imgn_oxign, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Según la Organización Mundial de la Salud,el uso mascarilla médica\nes una de las medidas profilácticas que limita la propagaciónde determinadas \nenfermedades respiratorias como el coronavirus. Sin embargo, la utilización \nde una mascarilla no basta para proporcionar un nivel suficiente de protección,\npor lo que se deben adoptar también otras medidas de higiene.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel6.setOpaque(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mascarilla-respirador (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coronavirus (1).png"))); // NOI18N

        masinformacion1.setText("mas informacion");
        masinformacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masinformacion1ActionPerformed(evt);
            }
        });

        masinformacion2.setText("mas informacion");
        masinformacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masinformacion2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(" La forma correcta de colocarse la mascarilla.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Informacion de como cambiar un filtro.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addGap(51, 51, 51)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(masinformacion1)
                    .addComponent(masinformacion2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(masinformacion1)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel5))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(masinformacion2)))))
        );

        lbl_user.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(60, 63, 65));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar_cesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cerrar_cesion)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //mensaje aleatorios para cada 1 min
    public class BeepClock implements Runnable {

        public void run() {
            System.out.println("Revisar los filtros");
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public void ejecutable() {
        ScheduledExecutorService scheduler
                = Executors.newSingleThreadScheduledExecutor();

        Runnable task = new BeepClock();
        int initialDelay = 1;
        int periodicDelay = 1;
        scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay,
                TimeUnit.MINUTES
        );
    }

    class BeeperControl {

        private final ScheduledExecutorService scheduler
                = Executors.newScheduledThreadPool(1);

        public void beepForAnHour() {
            final Runnable beeper = new Runnable() {
                public void run() {
                    System.out.println("Revisar los filtros");
                }
            };
            final ScheduledFuture<?> beeperHandle
                    = scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
            scheduler.schedule(new Runnable() {
                public void run() {
                    beeperHandle.cancel(true);
                }
            }, 60 * 60, SECONDS);
        }

    }


    private void masinformacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masinformacion1ActionPerformed

        frm_informacion1 karde = new frm_informacion1();

        karde.setVisible(true);


    }//GEN-LAST:event_masinformacion1ActionPerformed

    private void masinformacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masinformacion2ActionPerformed

        frm_informacion2 karde = new frm_informacion2();

        karde.setVisible(true);


    }//GEN-LAST:event_masinformacion2ActionPerformed

    private void cerrar_cesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_cesionActionPerformed

        proyectointegrador.frm_estructura karde = new proyectointegrador.frm_estructura();

        karde.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_cerrar_cesionActionPerformed
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return (img);

    }


    private void btn_bateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bateriaActionPerformed

        //} else if (busquea_usuario.equals("Usuario encontrado")) {
        Random number = new Random();
        for (int i = 0; i < 6; i++) {
            int n = number.nextInt(6);
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "", "        Nivel de bateria \n " + "100%", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/bateralta.png", 200, 200));
                break;
            } else if (n == 2) {
                JOptionPane.showMessageDialog(null, "", "        Nivel de bateria \n " + "84%", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/bater84.png", 200, 200));
                break;
            } else if (n == 3) {
                JOptionPane.showMessageDialog(null, "", "        Nivel de bateria \n " + "50%", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/bater50.png", 200, 200));
                break;
            } else if (n == 4) {
                JOptionPane.showMessageDialog(null, "", "        Nivel de bateria \n " + "26%", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/bater26.png", 200, 200));
                break;
            } else if (n == 5) {
                JOptionPane.showMessageDialog(null, "Bateria baja \n" + "Cargar bateria", "        Nivel de bateria \n " + "11%", JOptionPane.INFORMATION_MESSAGE, icono("/imagenes/bater11.png", 200, 200));
                break;
            }
        }

        //JOptionPane.showMessageDialog(COMPONENTE, MENSAJE, TITULO, TIPO DE MENSAJE, ICONO);
        //JOptionPane.showMessageDialog(null,"Nivel_de_bateria","Bateria",JOptionPane.PLAIN_MESSAGE,new ImageIcon("imgenes/icon.png"));
        //JOptionPane.showMessageDialog(null, "Nivel_de_bateria", "Bateria", JOptionPane.WARNING_MESSAGE,bateria);
    }//GEN-LAST:event_btn_bateriaActionPerformed

    private void btn_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtroActionPerformed
        Random number = new Random();
        for (int i = 0; i < 6; i++) {
            int n = number.nextInt(6);
            if (n == 1) {

                JOptionPane.showMessageDialog(null, "", "  Estado de uso del filtro \n " + "100%", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 2) {
                JOptionPane.showMessageDialog(null, "", "   Estado de uso del filtro \n " + "84%", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 3) {
                JOptionPane.showMessageDialog(null, "", "   Estado de uso del filtro \n " + "50%", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 4) {
                JOptionPane.showMessageDialog(null, "", "   Estado de uso del filtro \n " + "26%", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 5) {
                JOptionPane.showMessageDialog(null, "Filtro desgastado \n" + "Cambiar filtro", "   Estado de uso del filtro \n " + "11%", JOptionPane.INFORMATION_MESSAGE, icono("", 200, 200));
                break;
            }
        }
    }//GEN-LAST:event_btn_filtroActionPerformed

    private void btn_temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temperaturaActionPerformed
        // TODO add your handling code here:
        Random number = new Random();
        for (int i = 0; i < 5; i++) {
            int n = number.nextInt(5);
            if (n == 1) {

                JOptionPane.showMessageDialog(null, "Temperatura Corporal \n" + " Normal", "     Grado de temperatura \n " + "37°C", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 2) {
                JOptionPane.showMessageDialog(null, "Temperatura Corporal \n" + " Normal", "     Grado de temperatura \n " + "36°C", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 3) {
                JOptionPane.showMessageDialog(null, "Temperatura Corporal \n" + " Alta", "     Grado de temperatura \n " + "38°C", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            } else if (n == 4) {
                JOptionPane.showMessageDialog(null, "Temperatura Corporal \n" + " Baja", "     Grado de temperatura \n " + "35°C", JOptionPane.PLAIN_MESSAGE, icono("", 200, 200));
                break;
            }
        }

    }//GEN-LAST:event_btn_temperaturaActionPerformed

    private void btn_oxigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oxigenoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_oxigenoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bateria;
    private javax.swing.JButton btn_filtro;
    private javax.swing.JButton btn_oxigeno;
    private javax.swing.JButton btn_temperatura;
    private javax.swing.JButton cerrar_cesion;
    private javax.swing.JLabel img_bt;
    private javax.swing.JLabel imgn_filtro;
    private javax.swing.JLabel imgn_oxign;
    private javax.swing.JLabel imgn_tem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;

    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JLabel lbl_user;

    private javax.swing.JButton masinformacion1;
    private javax.swing.JButton masinformacion2;
    // End of variables declaration//GEN-END:variables
}
