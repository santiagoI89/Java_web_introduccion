package figuras;
import java.util.*;
public class ejecutar 
{public static void main(String[] args) 
    { Scanner ingreso = new Scanner(System.in);
        triangulo mytriangulo = new triangulo(0, 0, 0, 0); trapecio myTrapecio = new trapecio(0, 0, 0, 0, 0);decagono myDecagono = new decagono(0, 0, 0, 0);
        int seguir=0,seleccion;
        do{System.out.println("Calcular perimetro y area");
            System.out.println("Escoja una figura\nDigite 1 para triangulo\nDigite 2 para trapecio\nDigite 3 para decagono ");
            seleccion=ingreso.nextInt();
            switch(seleccion)
            {case 1:{System.out.println("Calcular perimetro:");
                    mytriangulo.calcularPerimetro();
                    System.out.println("Calcular area");
                    mytriangulo.calcularArea();
                    break;}
                case 2:{System.out.println("Trapecio");
                    System.out.println("Calcular perimetro:");
                    myTrapecio.calcularPerimetro();
                    System.out.println("Calcular area");
                    myTrapecio.calcularArea();
                    break;}
                case 3:{
                    System.out.println("Calcular perimetro:");
                    myDecagono.calcularPerimetro();
                    System.out.println("Calcular area");
                    myDecagono.calcularArea();
                    System.out.println("fin");
                    break;               }
                default:
                { System.out.println("Ingreso incorrecto");
                    break;}
            }
          System.out.println("Digte 1 para continuar o cualquier otro numero para salir");
          seguir=ingreso.nextInt();       
        }while(seguir==1);
        ingreso.close();
    }  }
