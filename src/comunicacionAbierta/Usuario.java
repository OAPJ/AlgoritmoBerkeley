package comunicacionAbierta;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author <Mikel>
 */
public class Usuario extends javax.swing.JFrame {
    int id;
    Servidor servidor;
    public Usuario() {
        initComponents();
        this.servidor=new Servidor();
        this.idLabel.setText("0");
        this.bandejaEntrada.setEditable(false);
        this.setSize(565, this.getHeight());
        this.setResizable(false);
        this.enviarGrupo.setActionCommand("grupo");
        this.enviarUsuario.setActionCommand("usuario");
        this.buttonGroup1.add(this.enviarGrupo);
        this.buttonGroup1.add(this.enviarUsuario);
    }
    public Usuario(Servidor server, int id) {
        initComponents();
        this.id=id;
        this.servidor=server;
        this.setResizable(false);
        this.idLabel.setText(id+"");
        this.bandejaEntrada.setEditable(false);
        this.setSize(565, this.getHeight());
        this.enviarGrupo.setActionCommand("grupo");
        this.enviarUsuario.setActionCommand("usuario");
        this.buttonGroup1.add(this.enviarGrupo);
        this.buttonGroup1.add(this.enviarUsuario);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        idLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        escribirMensaje = new javax.swing.JTextArea();
        enviarMensaje = new javax.swing.JButton();
        claveGrupo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        entrarGrupo = new javax.swing.JToggleButton();
        enviarUsuario = new javax.swing.JRadioButton();
        enviarGrupo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        idDestino = new javax.swing.JTextField();
        crearGrupo = new javax.swing.JButton();
        idGupoAgregadoCreado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bandejaEntrada = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        idRemitente = new javax.swing.JLabel();
        idGrupo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLabel.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("00");

        escribirMensaje.setColumns(20);
        escribirMensaje.setRows(5);
        jScrollPane1.setViewportView(escribirMensaje);

        enviarMensaje.setText("Enviar");
        enviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarMensajeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Introduzca clave de grupo");

        entrarGrupo.setText("Entrar");
        entrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarGrupoActionPerformed(evt);
            }
        });

        enviarUsuario.setText("Usuario");

        enviarGrupo.setText("Grupo");
        enviarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarGrupoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Id destino");

        idDestino.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        crearGrupo.setText("Crear");
        crearGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearGrupoActionPerformed(evt);
            }
        });

        idGupoAgregadoCreado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        bandejaEntrada.setColumns(20);
        bandejaEntrada.setRows(5);
        jScrollPane3.setViewportView(bandejaEntrada);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("De:");

        jLabel3.setText("id grupo");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(claveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idGupoAgregadoCreado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(crearGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entrarGrupo))
                            .addComponent(idLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(119, 119, 119))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idRemitente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(70, 70, 70))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enviarMensaje)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enviarGrupo)
                                .addGap(40, 40, 40)
                                .addComponent(idDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enviarUsuario)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(idGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarUsuario)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarGrupo)
                    .addComponent(idDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviarMensaje)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idGupoAgregadoCreado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearGrupo)
                            .addComponent(entrarGrupo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarGrupoActionPerformed

    private void crearGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearGrupoActionPerformed
        try{
            int aux= Integer.parseInt(this.claveGrupo.getText());
            int idGrupo=this.servidor.crearGrupo(aux);
            this.idGupoAgregadoCreado.setText(idGrupo+"");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduzca clave válida(números)");
        }
    }//GEN-LAST:event_crearGrupoActionPerformed

    private void entrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarGrupoActionPerformed
        try{
            int password= Integer.parseInt(this.claveGrupo.getText());
            int grupoId = Integer.parseInt(this.idGrupo.getText());
            boolean resultado = this.servidor.agregarUsuarioAGrupo(this, grupoId, password);
            if(resultado) JOptionPane.showMessageDialog(null, "Se accedió al grupo :3");
            else JOptionPane.showMessageDialog(null, "No se pudo acceder al grupo");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduzca clave e identificador válida(números)");
        }
    }//GEN-LAST:event_entrarGrupoActionPerformed

    private void enviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarMensajeActionPerformed
        try{
            boolean aux=false;
            int idReceptor= Integer.parseInt(this.idDestino.getText());
            if(this.buttonGroup1.getSelection().getActionCommand().equals("grupo"))
                aux=this.servidor.enviarGrupo(this.escribirMensaje.getText(),this.id, idReceptor);
            else
                aux=this.servidor.enviarUsuario(this.escribirMensaje.getText(),this.id, idReceptor);
            if(!aux) JOptionPane.showMessageDialog(null, "No se pudo enviar mensaje");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduzca id válido");
        }catch(NullPointerException s){
            JOptionPane.showMessageDialog(null, "Elija un objetivo");
        }
    }//GEN-LAST:event_enviarMensajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int idGrupoEliminar= Integer.parseInt(this.idGrupo.getText());
            int claveGrupoEliminar = Integer.parseInt(this.claveGrupo.getText());
            if(this.servidor.elimiarGrupo(idGrupoEliminar, claveGrupoEliminar)) 
                JOptionPane.showMessageDialog(null, "Se eliminnó el gurpo");
            else JOptionPane.showMessageDialog(null, "No se pudo completar la acción");
            
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(null,"Introduzca clave e id válidos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            int idGrupoSalir= Integer.parseInt(this.idGrupo.getText());
            if(this.servidor.salirGrupo(idGrupoSalir, this.id))
                JOptionPane.showMessageDialog(null, "Se salió del grupo");
            else JOptionPane.showMessageDialog(null, "No se pudo completar la acción");
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(null,"Introduzca clave e id válidos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void recibirMensaje(String mensaje, int remitente){
        this.bandejaEntrada.setText(mensaje);
        this.idRemitente.setText(remitente+"");
    }
    
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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    

        public int getId(){
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bandejaEntrada;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField claveGrupo;
    private javax.swing.JButton crearGrupo;
    private javax.swing.JToggleButton entrarGrupo;
    private javax.swing.JRadioButton enviarGrupo;
    private javax.swing.JButton enviarMensaje;
    private javax.swing.JRadioButton enviarUsuario;
    private javax.swing.JTextArea escribirMensaje;
    private javax.swing.JTextField idDestino;
    private javax.swing.JTextField idGrupo;
    private javax.swing.JLabel idGupoAgregadoCreado;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idRemitente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
