/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunicacionCerrada;

import java.util.ArrayList;
import javax.swing.DefaultListModel;


/**
 *
 * @author <\Mikel>
 */
public class Servidor extends javax.swing.JFrame {
    private final ArrayList<Grupo> grupos;
    private final ArrayList<Usuario> usuarios;
    private final DefaultListModel<String> modelo;
    private int idDisponible;
    /**
     * Creates new form Servidor
     */
    public Servidor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.grupos=new ArrayList<>();
        this.usuarios=new ArrayList<>();
        this.modelo=new DefaultListModel<>();
        this.idDisponible=1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        crearUsuario = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaGrupos = new javax.swing.JList<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jScrollPane5.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crearUsuario.setText("Crear usuario");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Grupos:");

        jScrollPane6.setViewportView(listaGrupos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(crearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        Usuario nuevo= new Usuario(this, this.idDisponible);
        this.idDisponible++;
        nuevo.setVisible(true);
        this.usuarios.add(nuevo);
    }//GEN-LAST:event_crearUsuarioActionPerformed
    public int crearGrupo(int clave){
        Grupo nuevoG=new Grupo(clave);
        this.grupos.add(nuevoG);
        this.modelo.addElement(nuevoG.getId()+"");
        this.listaGrupos.setModel(modelo);
        return nuevoG.getId();
    }
    public boolean agregarUsuarioAGrupo(Usuario nuevo, int id, int clave){
        for(Grupo g: this.grupos){
            if(g.getId()==id){
                return g.acceder(clave, nuevo);
            }
        }
        return false;
    }
    
    public boolean enviarGrupo(String mensaje, int idRemitente, int idReceptor){
        for(Grupo g: this.grupos){
            if(idReceptor== g.getId()){
                if(g.acceso(idRemitente)){
                    g.enviarMensaje(mensaje, idRemitente);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean enviarUsuario(String mensaje, int idRemitente, int idReceptor){
        for(Usuario u: this.usuarios){
            if(idReceptor== u.getId()){
                u.recibirMensaje(mensaje, idRemitente);
                return true;
            }
        }
        return false;
    }
    
    public boolean elimiarGrupo(int idGrupo, int clave){
        for(int i=0;i<this.grupos.size();i++){
            if(this.grupos.get(i).getId()==idGrupo && this.grupos.get(i).getClave()==clave){
                this.grupos.remove(i);
                this.modelo.removeElementAt(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean salirGrupo(int idGrupo, int idUsuario){
        for(int i=0;i<this.grupos.size();i++){
            if(this.grupos.get(i).getId()==idGrupo){
                return this.grupos.get(i).eliminarUsuario(idUsuario);
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton crearUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> listaGrupos;
    // End of variables declaration//GEN-END:variables
}
