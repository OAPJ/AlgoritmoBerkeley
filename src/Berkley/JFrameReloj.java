/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Berkley;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameReloj extends javax.swing.JFrame implements Runnable {
    boolean f;
    private int hora;
    private int minuto;
    private int segundo;
    private Calendar calendario;
    private Date fecha;
    Thread hilo;
    public JFrameReloj(int a) {
        initComponents();
        f=true;
        this.agregarManager.setVisible(false);
        this.umbralManager.setVisible(false);
        this.mensajeManager.setVisible(false);
        this.sincronizarManager.setVisible(false);
        hilo= new Thread(this);
        this.calendario= new GregorianCalendar();
        this.setSize(400, 400);
        this.setResizable(false);
        
    }
    @Override
    public void run() {
        Thread currhilo = Thread.currentThread();
        while(currhilo==hilo){
//            fecha= new Date();
//            this.calendario.setTime(fecha);
//            this.hora= calendario.get(Calendar.HOUR_OF_DAY);
//            this.minuto= calendario.get(Calendar.MINUTE);
//            this.segundo= calendario.get(Calendar.SECOND);
            if(f){
                this.segundo++;
            if(!validarSegundo()){
                segundo=0;
                this.minuto++;
                if(!validarMinuto()){
                    minuto=0;
                    hora++;
                    if(!validarHora()){
                        hora=0;
                    }
                }
            }
           if(hora<10)
                this.hour.setText("0"+this.hora);
           else
                this.hour.setText(this.hora+"");
           if(minuto<10)
                this.minute.setText("0"+this.minuto);
           else
                this.minute.setText(this.minuto+"");
           if(segundo<10)
                this.second.setText("0"+this.segundo);
           else
                this.second.setText(this.segundo+"");
           try{
                Thread.sleep(1000);
           }catch(InterruptedException w){
            
        }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        horaText = new javax.swing.JTextField();
        minutoText = new javax.swing.JTextField();
        segundosText = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        minute = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        time4 = new javax.swing.JLabel();
        horaReal = new javax.swing.JButton();
        agregarManager = new javax.swing.JToggleButton();
        umbralManager = new javax.swing.JTextField();
        mensajeManager = new javax.swing.JLabel();
        sincronizarManager = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hora");

        jLabel2.setText("Minutos");

        jLabel3.setText("Segundos");

        start.setText("Comenzar");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        minute.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        minute.setText("00");

        hour.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        hour.setText("00");

        time2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        time2.setText(":");

        second.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        second.setText("00");

        time4.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        time4.setText(":");

        horaReal.setText("Comenzar horaReal");
        horaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaRealActionPerformed(evt);
            }
        });

        agregarManager.setText("Agregar reloj");

        mensajeManager.setText("Umbral(segundos).");

        sincronizarManager.setText("Comenzar sincronización");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(horaReal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(start, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115)
                        .addComponent(sincronizarManager)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(segundosText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(minutoText)
                                    .addComponent(horaText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(time4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(umbralManager, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mensajeManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarManager)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarManager)
                    .addComponent(umbralManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensajeManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minute)
                        .addComponent(hour)
                        .addComponent(time2)
                        .addComponent(time4)
                        .addComponent(second))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(horaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(minutoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(segundosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start)
                    .addComponent(sincronizarManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaReal)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        try{
            this.hora= Integer.parseInt(this.horaText.getText());
            this.minuto= Integer.parseInt(this.minutoText.getText());
            this.segundo= Integer.parseInt(this.segundosText.getText());
            if(validarHora()&&validarMinuto()&&validarSegundo()){
                if(hora<10)
                    this.hour.setText("0"+this.hora);
                else
                    this.hour.setText(this.hora+"");
                if(minuto<10)
                    this.minute.setText("0"+this.minuto);
                else
                    this.minute.setText(this.minuto+"");
                if(segundo<10)
                    this.second.setText("0"+this.segundo);
                else
                    this.second.setText(this.segundo+"");
                this.hilo.start();
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectas");
            }
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_startActionPerformed

    private void horaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaRealActionPerformed
        fecha= new Date();
        this.calendario.setTime(fecha);
        this.hora= calendario.get(Calendar.HOUR_OF_DAY);
        this.minuto= calendario.get(Calendar.MINUTE);
        this.segundo= calendario.get(Calendar.SECOND);
        if(hora<10)
           this.hour.setText("0"+this.hora);
        else
           this.hour.setText(this.hora+"");
        if(minuto<10)
           this.minute.setText("0"+this.minuto);
        else
           this.minute.setText(this.minuto+"");
        if(segundo<10)
           this.second.setText("0"+this.segundo);
        else
           this.second.setText(this.segundo+"");
        this.hilo.start();
    }//GEN-LAST:event_horaRealActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrameReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReloj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReloj(0).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton agregarManager;
    private javax.swing.JButton horaReal;
    private javax.swing.JTextField horaText;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel mensajeManager;
    private javax.swing.JLabel minute;
    private javax.swing.JTextField minutoText;
    private javax.swing.JLabel second;
    private javax.swing.JTextField segundosText;
    public javax.swing.JToggleButton sincronizarManager;
    private javax.swing.JButton start;
    private javax.swing.JLabel time2;
    private javax.swing.JLabel time4;
    public javax.swing.JTextField umbralManager;
    // End of variables declaration//GEN-END:variables

    private boolean validarHora() {
        return this.hora<24 && this.hora>-1;
    }
    private boolean validarMinuto() {
        return this.minuto<60 && this.minuto>-1;
    }
    private boolean validarSegundo() {
        return this.segundo<60 && this.segundo>-1;
    }
    public void retrasar(long tiempo){
        try {
            f=false;
            System.out.println(f);
                    
            hilo.suspend();
            Thread.sleep(tiempo);
            hilo.resume();
            f=true;
            System.out.println(f);
//            int auxH= this.hora;
//            int auxM= this.minuto;
//            int auxS= this.segundo;
//            Thread.sleep(tiempo);
//            this.hora=auxH;
//            this.minuto=auxM;
//            this.segundo=auxS;
        } catch (InterruptedException ex) {
            Logger.getLogger(JFrameReloj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void adelantar(long tiempo){
        int segundos = (int)tiempo/1000;
        for(int i=0;i<segundos;i++){
            this.segundo++;
            if(!validarSegundo()){
                segundo=0;
                this.minuto++;
                if(!validarMinuto()){
                    minuto=0;
                    hora++;
                    if(!validarHora()){
                        hora=0;
                    }
                }
            }
        }
    }

    void setAgregarVisible() {
        this.agregarManager.setVisible(true);
    }
}
