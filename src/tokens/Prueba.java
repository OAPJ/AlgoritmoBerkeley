/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

/**
 *
 * @author <Mikel>
 */
public class Prueba {
    public void dispose(){
        
    }
    public static void main(String[] args) throws InterruptedException {
        ProcesoT p= new ProcesoT(0,null);
        ProcesoT p1= new ProcesoT(1,null);
        p.setSigNodo(p1);
        p1.setSigNodo(p);
        p.setVisible(true);
        p1.setVisible(true);
        
        for(;;){
            p.pasarToken();
            Thread.sleep(1000);
            p1.pasarToken();
            Thread.sleep(1000);
        }
    }
}
