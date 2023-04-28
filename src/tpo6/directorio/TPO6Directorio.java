
package tpo6.directorio;



/**
 *
 * @author Rodrigo
 */
public class TPO6Directorio {

    
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
