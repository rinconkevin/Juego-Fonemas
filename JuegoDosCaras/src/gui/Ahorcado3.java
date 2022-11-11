/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import auxiliar.LogicaJuego;
import auxiliar.NewMain;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author Dark
 */
public class Ahorcado3 extends javax.swing.JFrame {

    private VFondo fondo;
    private String[] palabras = {"MAMA", "AMO", "MIMO", "PUMA", "MAPA",
        "PAPA", "PIPA", "SUMA", "MISA", "MESA",
        "MASA", "SOPA", "SAPO", "OSO", "PESO"};
    private int T;
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
    
    public Ahorcado3() {
        initComponents();

        fondo = new VFondo(getWidth(), getHeight());
        add(fondo, BorderLayout.CENTER);
        inicio();
    }

    public int random() {
        int numero = 0;
        Random h = new Random();
        numero = h.nextInt(4);
        return numero;
    }

    public void inicio() {
        T = random() + 10;
        puntaje = 0;
        Ltexto.setText("");
        Icon Imagenes = new ImageIcon(getClass().getResource("/imagenes/z" + (T + 1) + ".png"));
        Limagen.setIcon(Imagenes);
        String[] Letras = palabras[T].split("");
        for (String Letra : Letras) {
            Ltexto.setText(Ltexto.getText() + " _ ");
        }
        
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        
        jButton6.setEnabled(true);
        
        jButton10.setEnabled(true);
        
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        
        jButton22.setEnabled(true);
        
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);

    }

    public void verificarLetra(String[] a, String b, String p) {
        String Acumular = "";
        String Acumular2 = "";
        puntaje++;
        int Contador = 0;
        String[] SR = Ltexto.getText().split(" ");
        for (String s : SR) {
            if (!s.equals("")) {
                Acumular = Acumular + s;
            }
        }
        
        String[] SR2 = Acumular.split("");

        if (!Acumular.contains(b)) {
            for (int i = 0; i < a.length; i++) {
                if (SR2[i].equals("_")) {
                    if (a[i].equals(b)) {
                        Acumular2 = Acumular2 + b;
                        Contador++;
                    } else {
                        Acumular2 = Acumular2 + " _ ";
                    }
                }else{
                    Acumular2 = Acumular2 + SR2[i];
                }
            }

        }else{
            Acumular2 = Acumular;
        }
        
        if(Contador > 0){
            sonido("cancion2");
        }else{
            sonido("cancion1");
        }
        
        if(p.equals(Acumular2)){
            JOptionPane.showMessageDialog(null, "Felicidades, Lo lograste en "+ puntaje + " intentos", "Ganaste!!", JOptionPane.INFORMATION_MESSAGE);
            sonido("cancion3");
            
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            
            jButton6.setEnabled(false);
            
            jButton10.setEnabled(false);
            
            jButton13.setEnabled(false);
            jButton14.setEnabled(false);
            
            jButton16.setEnabled(false);
            jButton17.setEnabled(false);
            
            jButton19.setEnabled(false);
            jButton20.setEnabled(false);
            
            jButton22.setEnabled(false);
            

        }

        Ltexto.setText(Acumular2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        Limagen = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Ltexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");
        getContentPane().setLayout(null);

        jButton2.setText("A");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 370, 50, 30);

        jButton3.setText("B");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 410, 50, 30);

        jButton6.setText("E");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(210, 370, 50, 30);

        jButton10.setText("I");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(310, 370, 50, 30);

        jButton13.setText("L");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(160, 410, 50, 30);

        jButton14.setText("M");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(260, 410, 50, 30);

        jButton16.setText("O");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(410, 370, 50, 30);

        jButton17.setText("P");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(360, 410, 50, 30);

        jButton19.setText("R");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(460, 410, 50, 30);

        jButton20.setText("S");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(560, 410, 50, 30);

        jButton22.setText("U");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(510, 370, 50, 30);
        getContentPane().add(Limagen);
        Limagen.setBounds(110, 50, 470, 240);

        jButton27.setText("Volver");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(530, 470, 100, 30);

        jButton28.setText("Siguiente");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28);
        jButton28.setBounds(520, 10, 100, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Ltexto.setBackground(new java.awt.Color(255, 255, 255));
        Ltexto.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Ltexto.setText("S");
        jPanel1.add(Ltexto);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 280, 210, 60);

        setSize(new java.awt.Dimension(706, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        //Volver Menu
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        //Reinicio
        inicio();
        
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Verificar A
        jButton2.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "A",palabras[T]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Verificar B
        jButton3.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "B",palabras[T]);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Verificar E
        jButton6.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "E",palabras[T]);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Verificar I
        jButton10.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "I",palabras[T]);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // Verificar O
        jButton16.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "O",palabras[T]);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // Verificar R
        jButton19.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "R",palabras[T]);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // Verificar S
        jButton20.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "S",palabras[T]);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // Verificar U
        jButton22.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "U",palabras[T]);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Verificar P
        jButton17.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "P",palabras[T]);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // Verificar M
        jButton14.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "M",palabras[T]);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Verificar L
        jButton13.setEnabled(false);
        String[] Letras = palabras[T].split("");
        verificarLetra(Letras, "L",palabras[T]);
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(Ahorcado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ahorcado3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Limagen;
    private javax.swing.JLabel Ltexto;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
