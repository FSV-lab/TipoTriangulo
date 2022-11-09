

package tipotriangulo;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class TipoTriangulo {
 

    public static void main(String[] args) {
        float l1,l2,l3;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el Valor del lado 1:");
        l1 = lector.nextFloat();
        System.out.println("Ingrese el valor del lado 2:");
        l2 = lector.nextFloat();
        System.out.println("Ingrese el valor del lado 3:");
        l3 = lector.nextFloat();
        //Triangulo Equilatero tiene todos los lados iguales
        if ((l1 == l2)&&(l2 == l3)) {
            System.out.println("El triangulo es Equilatero!");
        }
        //Triangulo Isoceles tienes dos lados iguales y uno diferente
        if ((l1 == l2)&&(l2 != l3)||(l2 == l3)&&(l3 != l1)||(l1 == l3)&&(l3 !=l2)){
            System.out.println("El triandulo es Isoceles!");
        }
        //Triangulo escaleno ninguno de sus lados son iguales
        if ((l1 != l2)&&(l1 != l3)&&(l2 != l3)&&(l2 != l1)&&(l3 != l2)&&(l3 != l1)){
        System.out.println("El triangulo es Escaleno!");
        }  
                
                
                        
             
                     
        
    }
}


