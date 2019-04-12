/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuido;

/**
 *
 * @author <Mikel>
 */
public class prueba {
    public static void main(String[] args) {
        Proceso process1= new Proceso(1);
        Proceso process2= new Proceso(2);
        Proceso process3= new Proceso(3);
        Proceso process4= new Proceso(4);
        
        process1.agregarAGrupo(process3);
        process1.agregarAGrupo(process2);
        process1.agregarAGrupo(process4);
        
        process2.agregarAGrupo(process3);
        process2.agregarAGrupo(process1);
        process2.agregarAGrupo(process4);
        
        process3.agregarAGrupo(process1);
        process3.agregarAGrupo(process2);
        process3.agregarAGrupo(process4);
        
        process4.agregarAGrupo(process1);
        process4.agregarAGrupo(process2);
        process4.agregarAGrupo(process3);
        
        process1.setVisible(true);
        process2.setVisible(true);
        process3.setVisible(true);
        process4.setVisible(true);
    }
}
