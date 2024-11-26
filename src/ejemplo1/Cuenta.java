
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
    
    double CuatroXmil(double y){
        y += y*0.004;
        return y;
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
    
    boolean retiro(int x){
        if (excento==true){
            if (x<=Saldo){
                System.out.println("Contando su dinero...");
                Saldo -= x;
                return true;
            }
            else{
                System.out.println("El valor introducido excede su Saldo actual.");
                return false;
            }
        }
        else{
            if (CuatroXmil(x)<=Saldo){
                System.out.println("Contando su dinero...");
                Saldo -= CuatroXmil(x);
                System.out.println("Retiere su dinero");
                return true;
            }
            else{
                System.out.println("El valor introducido excede su Saldo actual.");
                return false;
            }
        }
    }
    int getSaldo() {
        
        return this.Saldo;
    }
}
