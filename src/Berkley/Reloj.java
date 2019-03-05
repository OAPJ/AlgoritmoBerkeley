/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Berkley;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Reloj extends JFrameReloj {
    private ArrayList<JFrameReloj> esclavos;
    private ArrayList<Integer> diferencias;
    private int umbral;
    Reloj(){
       super();
       super.setVisible(true);
       super.agregarManager.setVisible(true);
       super.umbralManager.setVisible(true);
       super.mensajeManager.setVisible(true);
       super.setLocationRelativeTo(null);
       super.sincronizarManager.setVisible(true);
       super.setSize(480, 480);
       esclavos=new ArrayList<>();
       diferencias = new ArrayList<>();
       super.agregarManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
       super.sincronizarManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sincronizarActionPerformed(evt);
            }
        });
    }
                                
   
   public static void main(String arc[]){
       Reloj clock = new Reloj();
   }
   public void agregarActionPerformed(java.awt.event.ActionEvent evt){
       JFrameReloj aux= new JFrameReloj();
       aux.setVisible(true);
       esclavos.add(aux);
   }
   public void sincronizarActionPerformed(java.awt.event.ActionEvent evt){
       try{
           int aux = 0;
           this.umbral= (int)Double.parseDouble(super.umbralManager.getText());
           aux += Integer.parseInt(super.getHour().getText())*60*60;
           aux += Integer.parseInt(super.getMinute().getText())*60;
           aux += Integer.parseInt(super.getSecond().getText());
           super.adelantar(2000);
           for(JFrameReloj c: esclavos){
               aux = 0;
               aux += Integer.parseInt(c.getHour().getText())*60*60;
               aux += Integer.parseInt(c.getMinute().getText())*60;
               aux += Integer.parseInt(c.getSecond().getText());
               c.adelantar(2000);
           }
       }catch(NumberFormatException r){
           System.out.println(super.umbralManager.getText());
           JOptionPane.showMessageDialog(null, "Inserte un umbral válido");
       }
   }
}
