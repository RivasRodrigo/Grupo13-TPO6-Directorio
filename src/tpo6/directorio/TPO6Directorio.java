/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo6.directorio;

import com.sun.org.apache.bcel.internal.generic.DREM;

/**
 *
 * @author Rodrigo
 */
public class TPO6Directorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Cliente cl = new Cliente("34434434","carlos","barloa","san luis","Sarmiento 2323");
       Directorio d1 = new Directorio();
       
       d1.agreagarCliente("26634433",cl);
        System.out.println(d1.buscarCliente("26634433")) ;
      //  System.out.println(d1.buscarCliente("343434"));
        if(d1.buscarCliente("343434")==null){
            System.out.println("cliente no encontrado");
        }
    }
    
}
