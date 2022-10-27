/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeadasimples1_bruno;

/**
 *
 * @author Usuario
 */
public class listaligada {
    celula primeira;
    celula ultima;
    int totalElementos = 0;
    
    void adicionarNoComeco(Object elemento){
        celula nova = new celula(this.primeira,elemento);
        this.primeira = nova;
        if(this.totalElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalElementos++;
    }
    
    void adiciona(Object elemento){
        if(this.totalElementos == 0){
            this.adicionarNoComeco(elemento);
        }else{
            celula nova = new celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalElementos++;
        }
    }
    
    boolean posicaoOcupada(int pos){
        return((pos>=0)&&(pos<this.totalElementos));
    }
    
    celula pegaCelula(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição não existe");
        }else{
            celula atual = this.primeira;
            for(int i = 0; i<pos;i++){
                atual = atual.getProxima();
            }
            return(atual);
        }
    }
    
    void adiciona(int pos, Object elemento){
        if(pos == 0){
            this.adicionarNoComeco(elemento);
        }else if(pos == this.totalElementos){
            this.adiciona(elemento);
        }else{
            celula anterior = this.pegaCelula(pos-1);
            celula nova = new celula(anterior.getProxima(),elemento);
            anterior.setProxima(nova);
            this.totalElementos++;
        }
    }
    
    Object pega(int posicao){
        return(this.pegaCelula(posicao).getElemento());
    }
    
    void removeComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posição não existente");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalElementos--;
            if(this.totalElementos == 0){
                this.ultima = null;
            }
        }
    }
    
    boolean contem(Object elemento){
        celula atual = this.primeira;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            atual = atual.getProxima();
        }
        return(false);
    }
    
    int tamanho(){
        return(this.totalElementos);
    }
    
    void imprimir(listaligada lista){
        if(lista.primeira == null){
            System.out.println("A lista está vazia.");
        }else{
            celula corrente = this.primeira;
            
            for(int i = 1; i<= this.tamanho();i++){
                paciente atual = (paciente) corrente.elemento;
                
                System.out.println("----------");
                System.out.println("Posição da Lista..: "+i);
                System.out.println("Nome: "+atual.nome);
                System.out.println("Idade: "+atual.Idade);
                System.out.println("Sexo: "+atual.sexo);
                System.out.println("----------");
                
                corrente = corrente.getProxima();
            }
            
            System.out.println("**********");
        }
    }
}
