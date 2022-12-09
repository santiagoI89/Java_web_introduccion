package figuras;
import java.util.Scanner;

public abstract class figurasgeometricas 
{
    Scanner ingreso = new Scanner(System.in);
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();   
}
