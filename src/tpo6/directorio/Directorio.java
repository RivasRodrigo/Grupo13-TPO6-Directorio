
package tpo6.directorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/*Un directorio telefónico posee una lista de Clientes de los que interesa conocer su dni, 
nombre, apellido, ciudad y dirección.
El directorio telefónico posee además las siguientes funcionalidades:

*/

public class Directorio {
    
    private  HashMap<String,Cliente> mapClientes=new HashMap();

    public Directorio() {
    }
    
    /*�? agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
    teléfono. Siendo el nro del teléfono la clave del mismo.*/

    public void agreagarCliente(String numeroTelefono,Cliente cliente){
        mapClientes.put(numeroTelefono, cliente);
        
    }   
    
   /*buscarTel�fono() que en base a un apellido nos devuelve una lista con los nros de
    tel�fono asociados a dicho apellido.*/ 
    public ArrayList<String> buscarTelefono(String apellido)
    {
        ArrayList<String>numsTelefono=new ArrayList();
        Iterator<String> it=mapClientes.keySet().iterator();
        while(it.hasNext()){
            String clave = it.next();
            if(mapClientes.get(clave).getApellido().equals(apellido));
            numsTelefono.add(clave);
        }
       return numsTelefono; 
    }
    /*�? buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al 
mismo.*/
    public Cliente buscarCliente(String numTelefonico){
        
        Cliente cliente = null ;
       
      
        for (Map.Entry<String, Cliente> tel_cli : mapClientes.entrySet()) {
           if(tel_cli.getKey().equals(numTelefonico)){
               cliente = tel_cli.getValue();
               
           }else{
               cliente = null;
           }
           
        }
       
        return cliente;
        
        
    }
    /*�? buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes 
asociados a dicha ciudad.*/
    public ArrayList<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente>clientes=new ArrayList();
        Iterator<String> it=mapClientes.keySet().iterator();
        while(it.hasNext()){
            if(mapClientes.get(it).getCiudad().equals(it));
            clientes.add(mapClientes.get(it));
        }
        return clientes;
    }
    //�? borrarCliente() que en base al número de teléfono elimina al cliente del directorio.
    public void borrarCliente(String telefono){
        mapClientes.remove(telefono);
        
    }
}
