/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdistribuidos;

import Berkley.JFrameReloj;
import javax.swing.JFrame;

/**
 *
 * @author Miguel
 */
public class SistemasDistribuidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameReloj reloj1= new JFrameReloj(0);
        reloj1.setVisible(true);
        JFrameReloj reloj2= new JFrameReloj(0);
        reloj2.setVisible(true);
        JFrameReloj reloj3= new JFrameReloj(0);
        reloj3.setVisible(true);
    }
    
}
