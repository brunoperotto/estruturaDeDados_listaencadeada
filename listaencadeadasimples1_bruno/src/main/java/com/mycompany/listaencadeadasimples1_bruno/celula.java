/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeadasimples1_bruno;

/**
 *
 * @author Usuario
 */
public class celula {
    celula proxima;
    Object elemento;
    
    celula(celula proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    celula(Object elemento){
        this.elemento = elemento;
    }
    
    void setProxima(celula proxima){
        this.proxima = proxima;
    }
    
    celula getProxima(){
        return(this.proxima);
    }
    
    Object getElemento(){
        return(this.elemento);
    }
    
}
