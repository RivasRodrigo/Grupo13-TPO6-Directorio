
package tpo_6_laboratorio_1_guiatelefonica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*Un directorio telef√≥nico posee una lista de Clientes de los que interesa conocer su dni, 
nombre, apellido, ciudad y direcci√≥n.
El directorio telef√≥nico posee adem√°s las siguientes funcionalidades:

*/

public class Directorio {
    
    private  HashMap<String,Cliente> mapClientes=new HashMap<>();

    public Directorio() {
    }
    
    /*‚ó? agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
    tel√©fono. Siendo el nro del tel√©fono la clave del mismo.*/
    public void agreagarCliente(){
        
    }
   /*buscarTelÈfono() que en base a un apellido nos devuelve una lista con los nros de
    telÈfono asociados a dicho apellido.*/ 
    public void buscarTelefono(String apellido)
    {
        
    }
    /*‚ó? buscarCliente() que en base al nro de tel√©fono retorna el Cliente asociado al 
mismo.*/
    public void buscarCliente(){
        
    }
    /*‚ó? buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes 
asociados a dicha ciudad.*/
    public void buscarClientes(String ciudad){
        ArrayList<Cliente>clientes=new ArrayList();
        Iterator<String> it=mapClientes.keySet().iterator();
        while(it.hasNext()){
            
        }
    }
    //‚ó? borrarCliente() que en base al n√∫mero de tel√©fono elimina al cliente del directorio.
    public void borrarCliente(){
        
    }
}
