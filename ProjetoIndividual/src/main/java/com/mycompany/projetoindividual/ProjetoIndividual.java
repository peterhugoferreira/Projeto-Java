/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoindividual;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class ProjetoIndividual extends javax.swing.JFrame {
    Integer contador = 0;
    //Máximo Mínimo e média do numeros sorteados
        Integer maxCpu = 0;
        Integer minCpu = 100;
        Double medCpu = 0.0;
        
        Integer maxDisco = 0;
        Integer minDisco = 100;
        Double medDisco = 0.0;
        
        Integer maxMemoria = 0;
        Integer minMemoria = 100;
        Double medMemoria = 0.0;
    /**
     * Creates new form ProjetoIndividual
     */
    public ProjetoIndividual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCPU = new javax.swing.JLabel();
        LabelDisco = new javax.swing.JLabel();
        LabelMemoria = new javax.swing.JLabel();
        progressCPU = new javax.swing.JProgressBar();
        progressDisco = new javax.swing.JProgressBar();
        progressMemoria = new javax.swing.JProgressBar();
        ButtonLeitura = new javax.swing.JButton();
        TextDisco = new javax.swing.JTextField();
        TextCpu = new javax.swing.JTextField();
        TextMemoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textMaxCpu = new javax.swing.JTextField();
        textMinCpu = new javax.swing.JTextField();
        textMaxDisco = new javax.swing.JTextField();
        textMedCpu = new javax.swing.JTextField();
        textMedDisco = new javax.swing.JTextField();
        textMinDisco = new javax.swing.JTextField();
        textMinMemoria = new javax.swing.JTextField();
        textMaxMemoria = new javax.swing.JTextField();
        textMedMemoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelCPU.setText("CPU");

        LabelDisco.setText("Disco");

        LabelMemoria.setText("Memória");

        ButtonLeitura.setText("Fazer leitura");
        ButtonLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLeituraActionPerformed(evt);
            }
        });

        TextDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDiscoActionPerformed(evt);
            }
        });

        TextCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCpuActionPerformed(evt);
            }
        });

        TextMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMemoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Maximo");

        jLabel2.setText("Maximo");

        jLabel3.setText("Maximo");

        jLabel4.setText("Mínimo");

        jLabel5.setText("Mínimo");

        jLabel6.setText("Mínimo");

        jLabel7.setText("Média");

        jLabel8.setText("Média");

        jLabel9.setText("Média");

        textMaxCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaxCpuActionPerformed(evt);
            }
        });

        textMinCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMinCpuActionPerformed(evt);
            }
        });

        textMaxDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaxDiscoActionPerformed(evt);
            }
        });

        textMedCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedCpuActionPerformed(evt);
            }
        });

        textMedDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedDiscoActionPerformed(evt);
            }
        });

        textMinDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMinDiscoActionPerformed(evt);
            }
        });

        textMinMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMinMemoriaActionPerformed(evt);
            }
        });

        textMaxMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaxMemoriaActionPerformed(evt);
            }
        });

        textMedMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedMemoriaActionPerformed(evt);
            }
        });

        jLabel10.setToolTipText("");

        labelContador.setText("Contador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ButtonLeitura)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textMaxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel5))
                                        .addComponent(progressDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textMinDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textMedDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelContador, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LabelCPU)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textMaxCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addComponent(progressCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textMinCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textMedCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LabelMemoria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textMaxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6))
                                .addComponent(progressMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textMinMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textMedMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLeitura)
                    .addComponent(jLabel10)
                    .addComponent(labelContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCPU)
                    .addComponent(TextCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(progressCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(textMaxCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMinCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMedCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDisco)
                    .addComponent(TextDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textMaxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(textMedDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textMinDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMemoria)
                    .addComponent(TextMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(textMinMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMedMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMaxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLeituraActionPerformed
        // Gera numeros aleatórios
        Random aleatorio = new Random();
        //Random aleatorio2 = new Random();
        //Random aleatorio3 = new Random();
        // Salva em uma variável
        Integer numero1 = aleatorio.nextInt(101);
        Integer numero2 = aleatorio.nextInt(101);
        Integer numero3 = aleatorio.nextInt(101);
            
        //Armazena os numero da CPU
        if (numero1 > maxCpu) {
            maxCpu = numero1;
        }
        if (numero1 < minCpu) {
            minCpu = numero1;
        }
        //Armazena os numeros do Disco
        if (numero2 > maxDisco) {
            maxDisco = numero2;
        }
        if (numero2 < minDisco) {
            minDisco = numero2;
        }
        //Armazena os numeros da Memoria
        if (numero3 > maxMemoria) {
            maxMemoria = numero3;
        }
        if (numero3 < minMemoria) {
            minMemoria = numero3;
        } 
        
        contador += 1;
        medCpu = (medCpu + numero1);
        medDisco = (medDisco + numero2);
        medMemoria = (medMemoria + numero3);
        
        Double mediaCpu = medCpu/contador;
        Double mediaDisco = medDisco/contador;
        Double mediaMemoria = medMemoria/contador;
        
        //Mostra os numeros
        TextCpu.setText(String.valueOf(numero1));
        textMaxCpu.setText(String.valueOf(maxCpu));
        textMinCpu.setText(String.valueOf(minCpu));
        textMedCpu.setText
        (String.valueOf(String.format("%.2f", (mediaCpu))));
        
        TextDisco.setText(String.valueOf(numero2));
        textMaxDisco.setText(String.valueOf(maxDisco));
        textMinDisco.setText(String.valueOf(minDisco));
        textMedDisco.setText
        (String.valueOf(String.format("%.2f", (mediaDisco))));
        
        TextMemoria.setText(String.valueOf(numero3));
        textMaxMemoria.setText(String.valueOf(maxMemoria));
        textMinMemoria.setText(String.valueOf(minMemoria));
        textMedMemoria.setText
        (String.valueOf(String.format("%.2f", (mediaMemoria))));
        
        progressCPU.setValue(numero1);
        progressDisco.setValue(numero2);
        progressMemoria.setValue(numero3);
        
        labelContador.setText(String.valueOf(contador));
        
      
    }//GEN-LAST:event_ButtonLeituraActionPerformed

    private void TextDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDiscoActionPerformed

    private void TextCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCpuActionPerformed

    private void TextMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMemoriaActionPerformed

    private void textMaxCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaxCpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaxCpuActionPerformed

    private void textMinCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMinCpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMinCpuActionPerformed

    private void textMaxDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaxDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaxDiscoActionPerformed

    private void textMedCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedCpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedCpuActionPerformed

    private void textMedDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedDiscoActionPerformed

    private void textMinDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMinDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMinDiscoActionPerformed

    private void textMinMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMinMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMinMemoriaActionPerformed

    private void textMaxMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaxMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaxMemoriaActionPerformed

    private void textMedMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedMemoriaActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLeitura;
    private javax.swing.JLabel LabelCPU;
    private javax.swing.JLabel LabelDisco;
    private javax.swing.JLabel LabelMemoria;
    private javax.swing.JTextField TextCpu;
    private javax.swing.JTextField TextDisco;
    private javax.swing.JTextField TextMemoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelContador;
    private javax.swing.JProgressBar progressCPU;
    private javax.swing.JProgressBar progressDisco;
    private javax.swing.JProgressBar progressMemoria;
    private javax.swing.JTextField textMaxCpu;
    private javax.swing.JTextField textMaxDisco;
    private javax.swing.JTextField textMaxMemoria;
    private javax.swing.JTextField textMedCpu;
    private javax.swing.JTextField textMedDisco;
    private javax.swing.JTextField textMedMemoria;
    private javax.swing.JTextField textMinCpu;
    private javax.swing.JTextField textMinDisco;
    private javax.swing.JTextField textMinMemoria;
    // End of variables declaration//GEN-END:variables
}
