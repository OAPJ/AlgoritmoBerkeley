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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JFrameReloj extends javax.swing.JFrame implements Runnable {
    boolean f;
    private int hora;
    private int minuto;
    private int segundo;
    private Calendar calendario;
    private Date fecha;
    Thread hilo;
    
    public JFrameReloj() {
        initComponents();
        f=true;
        this.agregarManager.setVisible(false);
        this.umbralManager.setVisible(false);
        this.mensajeManager.setVisible(false);
        this.sincronizarManager.setVisible(false);
        hilo= new Thread(this);
        this.calendario= new GregorianCalendar();
        this.setSize(810, 470);
        jLabel4.setText("Servidor");
    }
    
    public JFrameReloj(String n) {
        initComponents();
        f=true;
        this.agregarManager.setVisible(false);
        this.umbralManager.setVisible(false);
        this.mensajeManager.setVisible(false);
        this.sincronizarManager.setVisible(false);
        this.jScrollPane1.setVisible(false);
        hilo= new Thread(this);
        this.calendario= new GregorianCalendar();
        this.setSize(837, 480);
        jLabel4.setText(n);
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

        jPanel1 = new javax.swing.JPanel();
        umbralManager = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mensajeManager = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        horaText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        minutoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        segundosText = new javax.swing.JTextField();
        agregarManager = new javax.swing.JToggleButton();
        start = new javax.swing.JButton();
        horaReal = new javax.swing.JButton();
        sincronizarManager = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        second = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        time4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo Berkeley");

        jPanel1.setLayout(null);

        umbralManager.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(umbralManager);
        umbralManager.setBounds(250, 340, 67, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Servidor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 160, 40);

        mensajeManager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeManager.setForeground(new java.awt.Color(255, 0, 0));
        mensajeManager.setText("Umbral(segundos).");
        jPanel1.add(mensajeManager);
        mensajeManager.setBounds(100, 340, 160, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Hora");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 290, 40, 20);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(540, 20, 210, 170);

        horaText.setBackground(new java.awt.Color(255, 153, 153));
        horaText.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jPanel1.add(horaText);
        horaText.setBounds(80, 290, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Minutos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 290, 70, 17);

        minutoText.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(minutoText);
        minutoText.setBounds(230, 290, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Segundos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 290, 90, 17);

        segundosText.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(segundosText);
        segundosText.setBounds(370, 290, 58, 20);

        agregarManager.setBackground(new java.awt.Color(255, 255, 204));
        agregarManager.setText("Agregar reloj");
        jPanel1.add(agregarManager);
        agregarManager.setBounds(600, 270, 150, 80);

        start.setBackground(new java.awt.Color(255, 255, 204));
        start.setText("Comenzar");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start);
        start.setBounds(10, 370, 160, 50);

        horaReal.setBackground(new java.awt.Color(255, 255, 204));
        horaReal.setText("Comenzar horaReal");
        horaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaRealActionPerformed(evt);
            }
        });
        jPanel1.add(horaReal);
        horaReal.setBounds(180, 370, 180, 50);

        sincronizarManager.setBackground(new java.awt.Color(255, 255, 204));
        sincronizarManager.setText("Comenzar sincronización");
        jPanel1.add(sincronizarManager);
        sincronizarManager.setBounds(530, 360, 210, 50);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        second.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        second.setText("00");

        hour.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        hour.setText("00");

        time2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        time2.setText(":");

        minute.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        minute.setText("00");

        time4.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        time4.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(time4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minute)
                    .addComponent(second)
                    .addComponent(hour)
                    .addComponent(time4)
                    .addComponent(time2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 50, 310, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ovall\\OneDrive\\Documents\\NeatBeans\\SistemasDistrubidos\\AlgoritmoBerkeley-master\\545fdf80960a97683a217c83-1024x576.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-10, 0, 820, 470);

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 810, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
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
          if(!hilo.isAlive())
              this.hilo.start();
      }
      else
          JOptionPane.showMessageDialog(null, "Datos incorrectas","Algoritmo Berkeley",JOptionPane.ERROR_MESSAGE);
      }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Faltan los datos","Algoritmo Berkeley",JOptionPane.ERROR_MESSAGE);
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
        if(!hilo.isAlive())
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReloj().setVisible(true);
                
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
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
//
    public JLabel getHour() {
        return hour;
    }

    public void setHour(JLabel hour) {
        this.hour = hour;
    }

    public JLabel getMinute() {
        return minute;
    }

    public void setMinute(JLabel minute) {
        this.minute = minute;
    }

    public JLabel getSecond() {
        return second;
    }

    public void setSecond(JLabel second) {
        this.second = second;
    }

    void setAgregarVisible() {
        this.agregarManager.setVisible(true);
    }
    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
}
