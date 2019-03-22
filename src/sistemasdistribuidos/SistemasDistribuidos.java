/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdistribuidos;

import Berkley.JFrameReloj;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class SistemasDistribuidos implements Runnable {
    int x=0, y=x+2, z=y+5;
    /**
     * @param args the command line arguments
     */
    
    public SistemasDistribuidos()  {
        this.run();
        
    }

    public static void main(String[] args) {
        SistemasDistribuidos n=new SistemasDistribuidos();
        n.run();
        System.out.println(n.getXYZ());
    }

    @Override
    public void run() {
       
        while(true){
            try {
                System.out.println(x +" " + y +" "+z);
                Thread.sleep(2000);
                x+=3; y+=2; z+=5;
            } catch (InterruptedException ex) {
                Logger.getLogger(SistemasDistribuidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String getXYZ(){
        return x+" "+y+ " "+z;
    }
}
