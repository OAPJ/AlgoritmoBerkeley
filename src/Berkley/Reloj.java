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
    private ArrayList<Integer> horas;
    private int horaSegundos;
    private int umbral;
    private int escl;
    
    Reloj(){
       super();
       super.setVisible(true);
       super.agregarManager.setVisible(true);
       super.umbralManager.setVisible(true);
       super.mensajeManager.setVisible(true);
       super.setLocationRelativeTo(null);
       super.sincronizarManager.setVisible(true);
       super.setSize(680, 480);
       esclavos=new ArrayList<>();
       diferencias = new ArrayList<>();
       horas = new ArrayList<>();
       horaSegundos = 0;
       escl = 0;
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
       escl++;
       JFrameReloj aux= new JFrameReloj("Reloj "+Integer.toString(escl));
       aux.setVisible(true);
       esclavos.add(aux);
   }
   
   public void sincronizarActionPerformed(java.awt.event.ActionEvent evt){
       try{
           horas = new ArrayList<>();
           int aux = 0;
           this.umbral= (int)Double.parseDouble(super.umbralManager.getText());
           aux += Integer.parseInt(super.getHour().getText())*60*60;
           aux += Integer.parseInt(super.getMinute().getText())*60;
           aux += Integer.parseInt(super.getSecond().getText());
           horaSegundos = aux;
           super.adelantar(2000);
           for(JFrameReloj c: esclavos){
               aux = 0;
               aux += Integer.parseInt(c.getHour().getText())*60*60;
               aux += Integer.parseInt(c.getMinute().getText())*60;
               aux += Integer.parseInt(c.getSecond().getText());
               horas.add(aux);
               c.adelantar(2000);
           }
           calcularPromedio();
           
       }catch(NumberFormatException r){
           System.out.println(super.umbralManager.getText());
           JOptionPane.showMessageDialog(null, "Inserte un umbral válido");
       }
   }
   
   public void calcularPromedio(){
       int cont=1, promedio=0;
       diferencias = new ArrayList<>();
       super.getjTextArea1().setText("Diferencias");
       for(int i=0; i<horas.size(); i++){
           diferencias.add(horas.get(i)-horaSegundos);
           super.getjTextArea1().setText(super.getjTextArea1().getText()+"\n"+esclavos.get(i).getjLabel4().getText()+" => "+diferencias.get(i));
       }
       for(int i=0; i<diferencias.size(); i++){
           if(diferencias.get(i) < umbral && diferencias.get(i) > (-1*umbral)){
               cont++;
               promedio += diferencias.get(i);
           }
       }
       promedio = promedio/cont;
       super.getjTextArea1().setText(super.getjTextArea1().getText()+"\n\nPromedio  => "+promedio);
       int horafinal = horaSegundos + promedio;
       int h = horafinal /3600;
       int m = (horafinal - h*3600) / 60;
       int s = horafinal - h*3600 - m*60;
       super.getjTextArea1().setText(super.getjTextArea1().getText()+"\n\nNueva hora  => "+h+":"+m+":"+s);
       
       super.setHora(h);
       super.setMinuto(m);
       super.setSegundo(s);
       for(JFrameReloj c: esclavos){
           c.setHora(h);
           c.setMinuto(m);
           c.setSegundo(s);
       }
   }
}
