/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anillo;

/**
 *
 * @author Miguel
 */
public class Proceso {
    private Proceso siguiente;
    private Proceso anterior;
    private boolean esCoordinador, fallando;
    private int id;
    private String lista;

    public boolean isFallando() {
        return fallando;
    }

    public void setFallando(boolean fallando) {
        this.fallando = fallando;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }
    public Proceso(int id) {
        esCoordinador=false;
        this.id=id;
        this.fallando=false;
    }

    public Proceso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Proceso siguiente) {
        this.siguiente = siguiente;
    }

    public Proceso getAnterior() {
        return anterior;
    }

    public void setAnterior(Proceso anterior) {
        this.anterior = anterior;
    }

    public boolean isEsCoordinador() {
        return esCoordinador;
    }

    public void setEsCoordinador(boolean esCoordinador) {
        this.esCoordinador = esCoordinador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String crearLista(String lista){
        if(!lista.contains(" "+id+" ")){
            lista+=" "+id+" ";
            this.lista= lista;
        }
        this.lista= lista;
        return this.lista;
    }
    
    public void fallar(){
        this.esCoordinador=false;
        this.fallando= true;
        this.anterior.setSiguiente(this.siguiente);
        this.siguiente.setAnterior(this.anterior);
    }
    
    public void reanudar(){
        this.fallando= false;
        this.anterior.setSiguiente(this);
        this.siguiente.setAnterior(this);
    }
    
}
