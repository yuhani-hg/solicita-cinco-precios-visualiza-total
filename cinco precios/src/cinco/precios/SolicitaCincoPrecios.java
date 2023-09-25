package cinco.precios;
import java.util.Scanner;
public class SolicitaCincoPrecios {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        float n1, n2, n3, n4, n5, momo;
        System.out.print ("Ingresa un precio: ");
        n1=leer.nextFloat();
        System.out.print ("Ingresa otro precio: ");
        n2=leer.nextFloat();
        System.out.print ("Ingresa otro precio: ");
        n3=leer.nextFloat();
        System.out.print ("Ingresa otro precio: ");
        n4=leer.nextFloat();
        System.out.print ("Ingresa otro precio: ");
        n5=leer.nextFloat();
        momo=(n1+n2+n3+n4+n5);
        System.out.print ("El total a pagar es: "+momo);
    }
    
}

  
