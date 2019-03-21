/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunicacionCerrada;

import java.util.ArrayList;

/**
 *
 * @author <Mikel>
 */
public class Grupo {
    private ArrayList<Usuario> usuarios;
    private final int id;
    private final int clave;
    public Grupo(int clave){
        this.usuarios= new ArrayList<>();
        this.id=this.hashCode();
        this.clave=clave;
    }
    
    public boolean acceder(int clave, Usuario newUsuario){
        if(this.clave==clave){
            for(Usuario u: this.usuarios)
                if(u.id==newUsuario.id)
                    return false;
            this.usuarios.add(newUsuario);
            System.out.println("se agregó "+newUsuario.getId());
            return true;
        }else return false;
    }
   
    public boolean acceso(int idProm){
        for(Usuario u: this.usuarios){
            if(u.getId()==idProm) return true;
        }
        return false;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public int getId() {
        return id;
    }

    public int getClave() {
        return clave;
    }
    
    public void enviarMensaje(String msj, int idUs){
        for(Usuario user: this.usuarios){
            if(user.getId()!=idUs) user.recibirMensaje(msj, this.id);//podría sustituirse por idUs si se quiere poner al usuaro remitente y no el gurpo
        }
    }
    public boolean eliminarUsuario(int idU){
        for(int i=0;i<this.usuarios.size();i++){
            if(this.usuarios.get(i).getId()==idU){
                this.usuarios.remove(i);
                return true;
            }
        }
        return false;
    }
}
