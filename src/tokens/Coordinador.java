/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author <Mikel>
 */
public class Coordinador extends Thread{
    ArrayList<ProcesoT> procesos;
    public Coordinador(ArrayList<ProcesoT> procesos) {
        this.procesos = procesos;
    }
    @Override
    public void run(){
        int pos=0;
        while(true){
            
            synchronized(procesos){
                if(pos>=procesos.size()) pos=0;
                if(procesos.get(pos).pasarToken()){
                try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Coordinador.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            pos++;}
            if(pos>=procesos.size()) pos=0;
            System.out.println(procesos.size());
        }
    }
    public void add(){
        ProcesoT po= new ProcesoT(procesos.size()+1, procesos);
        po.setVisible(true);
        this.procesos.add(po);
        this.procesos.get(0).setAntNodo(procesos.get(procesos.size()-1));
        this.procesos.get(procesos.size()-1).setSigNodo(procesos.get(0));
        System.out.println(procesos.get(procesos.size()-1).getId());
    }
    public ArrayList<ProcesoT> getProcesos() {
        return procesos;
    }
}
