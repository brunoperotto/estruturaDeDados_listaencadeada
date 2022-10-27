/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaencadeadasimples1_bruno;

/**
 *
 * @author Usuario
 */
public class Listaencadeadasimples1_bruno {

    public static void main(String[] args) {
        listaligada lista = new listaligada();
        
        paciente p1 = new paciente();
        p1.Idade = 8;
        p1.nome = "Lisa";
        p1.sexo = 'f';
        
        paciente p2 = new paciente();
        p2.Idade = 10;
        p2.nome = "Bart";
        p2.sexo = 'm';
        
        paciente p3 = new paciente();
        p3.Idade = 40;
        p3.nome = "Margie";
        p3.sexo = 'f';
        
        paciente p4 = new paciente();
        p1.Idade = 50;
        p1.nome = "Homer";
        p1.sexo = 'm';
        
        lista.imprimir(lista);
    }
}
