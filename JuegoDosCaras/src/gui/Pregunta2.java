/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import auxiliar.LogicaJuego;
import auxiliar.NewMain;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author Dark
 */
public class Pregunta2 extends javax.swing.JFrame {

    private VFondo fondo;
    private int puntaje = 0;
    //sonido
    public String ruta = "/Sonido/";
    AudioClip sonidos;
    public void sonido(String sonido) {
        try {
            
            String auxRuta = ruta + "" + sonido + ".wav";
            sonidos = java.applet.Applet.newAudioClip(getClass().getResource(auxRuta));
            sonidos.play();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
    public Pregunta2() {
        initComponents();

        fondo = new VFondo(getWidth(), getHeight());
        add(fondo, BorderLayout.CENTER);
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Volver Menu
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }                                        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnC1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        lb_P1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        lb_P2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        lb_P3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        lb_P4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lb_P5 = new javax.swing.JLabel();
        JVolver = new javax.swing.JButton();
        JReinicio = new javax.swing.JButton();
        Lpuntaje = new javax.swing.JLabel();

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setFocusable(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BIENVENIDO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 120, 22);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jButton18.setBackground(new java.awt.Color(204, 255, 204));
        jButton18.setText("MIMO");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);
        jButton18.setBounds(320, 350, 130, 50);

        jButton19.setBackground(new java.awt.Color(204, 255, 204));
        jButton19.setText("LUPA");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(80, 350, 130, 50);

        jButton20.setBackground(new java.awt.Color(204, 255, 204));
        jButton20.setText("MAMÁ");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(80, 260, 130, 50);

        jButton21.setBackground(new java.awt.Color(204, 255, 204));
        jButton21.setText("PAPÁ");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(320, 260, 130, 50);

        lb_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/z6.png"))); // NOI18N
        jPanel2.add(lb_P1);
        lb_P1.setBounds(30, 30, 490, 220);

        jTabbedPane1.addTab("Pregunta 1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(null);

        jButton14.setBackground(new java.awt.Color(204, 255, 204));
        jButton14.setText("AMA");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(320, 350, 130, 50);

        jButton15.setBackground(new java.awt.Color(204, 255, 204));
        jButton15.setText("PIPA");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15);
        jButton15.setBounds(80, 350, 130, 50);

        jButton16.setBackground(new java.awt.Color(204, 255, 204));
        jButton16.setText("SAPO");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16);
        jButton16.setBounds(80, 260, 130, 50);

        jButton17.setBackground(new java.awt.Color(204, 255, 204));
        jButton17.setText("LUPA");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17);
        jButton17.setBounds(320, 260, 130, 50);

        lb_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/z7.png"))); // NOI18N
        jPanel3.add(lb_P2);
        lb_P2.setBounds(30, 30, 490, 220);

        jTabbedPane1.addTab("Pregunta 2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(null);

        jButton10.setBackground(new java.awt.Color(204, 255, 204));
        jButton10.setText("PISO");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10);
        jButton10.setBounds(320, 350, 130, 50);

        jButton11.setBackground(new java.awt.Color(204, 255, 204));
        jButton11.setText("PUMA");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11);
        jButton11.setBounds(80, 350, 130, 50);

        jButton12.setBackground(new java.awt.Color(204, 255, 204));
        jButton12.setText("PISO");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12);
        jButton12.setBounds(80, 260, 130, 50);

        jButton13.setBackground(new java.awt.Color(204, 255, 204));
        jButton13.setText("SUMA");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13);
        jButton13.setBounds(320, 260, 130, 50);

        lb_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/z8.png"))); // NOI18N
        jPanel4.add(lb_P3);
        lb_P3.setBounds(30, 30, 490, 220);

        jTabbedPane1.addTab("Pregunta 3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setLayout(null);

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setText("MISA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(320, 350, 130, 50);

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setText("MAPA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);
        jButton7.setBounds(80, 350, 130, 50);

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setText("PUMA");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8);
        jButton8.setBounds(80, 260, 130, 50);

        jButton9.setBackground(new java.awt.Color(204, 255, 204));
        jButton9.setText("SOPA");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9);
        jButton9.setBounds(320, 260, 130, 50);

        lb_P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/z9.png"))); // NOI18N
        jPanel5.add(lb_P4);
        lb_P4.setBounds(30, 30, 490, 220);

        jTabbedPane1.addTab("Pregunta 4", jPanel5);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("PALO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(320, 350, 130, 50);

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setText("MISA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(80, 260, 130, 50);

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setText("MAPA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(320, 260, 130, 50);

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setText("MESA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(80, 350, 130, 50);

        lb_P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/z10.png"))); // NOI18N
        jPanel1.add(lb_P5);
        lb_P5.setBounds(30, 30, 490, 220);

        jTabbedPane1.addTab("Pregunta 5", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 50, 560, 450);

        JVolver.setBackground(new java.awt.Color(204, 204, 255));
        JVolver.setText("Volver");
        JVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JVolverActionPerformed(evt);
            }
        });
        getContentPane().add(JVolver);
        JVolver.setBounds(480, 520, 90, 30);

        JReinicio.setBackground(new java.awt.Color(204, 204, 255));
        JReinicio.setText("Reiniciar");
        JReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JReinicioActionPerformed(evt);
            }
        });
        getContentPane().add(JReinicio);
        JReinicio.setBounds(485, 32, 90, 30);

        Lpuntaje.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lpuntaje.setText("0 / 5");
        getContentPane().add(Lpuntaje);
        Lpuntaje.setBounds(30, 510, 190, 60);

        setSize(new java.awt.Dimension(632, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
       
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        
    }//GEN-LAST:event_btnC1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Incorrecto - 4
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P4.setIcon(Imagenes);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Incorrecto - 5
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P5.setIcon(Imagenes);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JVolverActionPerformed
        // Volver Menu
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JVolverActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // Incorrecto - 1
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png"));   
        lb_P1.setIcon(Imagenes);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // Correcto - 1
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/z0.png"));   
        lb_P1.setIcon(Imagenes);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        puntaje++;
        Lpuntaje.setText(puntaje + " / 5");
        sonido("cancion3");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // Incorrecto - 1
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png"));   
        lb_P1.setIcon(Imagenes);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // Incorrecto - 1
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png"));   
        lb_P1.setIcon(Imagenes);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // Incorrecto - 2    
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P2.setIcon(Imagenes);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Incorrecto - 2    
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P2.setIcon(Imagenes);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // Correcto - 2
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/z0.png"));   
        lb_P2.setIcon(Imagenes);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        puntaje++;
        Lpuntaje.setText(puntaje + " / 5");
        sonido("cancion3");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // Incorrecto - 2    
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P2.setIcon(Imagenes);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // Incorrecto - 3
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P3.setIcon(Imagenes);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Correcto - 3
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/z0.png"));   
        lb_P3.setIcon(Imagenes);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        puntaje++;
        Lpuntaje.setText(puntaje + " / 5");
        sonido("cancion3");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // Incorrecto - 3
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P3.setIcon(Imagenes);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Incorrecto - 3
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P3.setIcon(Imagenes);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Incorrecto - 4
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P4.setIcon(Imagenes);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Incorrecto - 4
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P4.setIcon(Imagenes);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Correcto - 4
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/z0.png"));   
        lb_P4.setIcon(Imagenes);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        puntaje++;
        Lpuntaje.setText(puntaje + " / 5");
        sonido("cancion3");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Incorrecto - 5
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P5.setIcon(Imagenes);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Incorrecto - 5
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/zr.png")); 
        lb_P5.setIcon(Imagenes);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        sonido("cancion1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Correcto - 5
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/z0.png"));   
        lb_P5.setIcon(Imagenes);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        puntaje++;
        Lpuntaje.setText(puntaje + " / 5");
        sonido("cancion3");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void JReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JReinicioActionPerformed
        // Reinicio
        Icon Imagenes1 = new ImageIcon(getClass().getResource("/imagenes/z6.png")); 
        Icon Imagenes2 = new ImageIcon(getClass().getResource("/imagenes/z7.png")); 
        Icon Imagenes3 = new ImageIcon(getClass().getResource("/imagenes/z8.png")); 
        Icon Imagenes4 = new ImageIcon(getClass().getResource("/imagenes/z9.png")); 
        Icon Imagenes5 = new ImageIcon(getClass().getResource("/imagenes/z10.png")); 
        lb_P1.setIcon(Imagenes1);
        lb_P2.setIcon(Imagenes2);
        lb_P3.setIcon(Imagenes3);
        lb_P4.setIcon(Imagenes4);
        lb_P5.setIcon(Imagenes5);
        JReinicio.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        puntaje = 0;
        Lpuntaje.setText("0 / 5");
    }//GEN-LAST:event_JReinicioActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JReinicio;
    private javax.swing.JButton JVolver;
    private javax.swing.JLabel Lpuntaje;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_P1;
    private javax.swing.JLabel lb_P2;
    private javax.swing.JLabel lb_P3;
    private javax.swing.JLabel lb_P4;
    private javax.swing.JLabel lb_P5;
    // End of variables declaration//GEN-END:variables
}
