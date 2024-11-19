
package ejemplo1;
// Describiendo un sistema bancario
//Metodos son: consignar, retirar, tranferencia
// Clase cliente y clase cuenta
public class Cuenta {
    
    private String Titular;
    private int Saldo;

    Cuenta(Cliente Nestor) {
        Titular = Nestor.nombre;
    }


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
