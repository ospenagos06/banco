
package ejemplo1;

public class Cuenta {
    
    private String Titular;
    private int Saldo;


    boolean consignacion(int x){
        
        boolean peticion = true;
        
        if(peticion == true){
                Saldo = Saldo + x;
                return true;
        }else{
            return false;
        }  
    }

    int getSaldo() {
        
        return this.Saldo;
    }
}
