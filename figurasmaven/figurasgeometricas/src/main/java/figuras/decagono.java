package figuras;

public class decagono extends figurasgeometricas

{
    private double lado1,apotema,Dearea,Deperimetro;

    public double getLado1() {
        return lado1;
    }

    public decagono( double lado1, double apotema, double Dearea, double Deperimetro) {
        this.lado1 = lado1;
        this.apotema = apotema;
        this.Dearea = Dearea;
        this.Deperimetro = Deperimetro;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getdeArea() {
        return Dearea;
    }

    public void setdeArea(double Dearea) {
        this.Dearea = Dearea;
    }

    public double getdePerimetro() {
        return Deperimetro;
    }

    public void setdePerimetro(double Deperimetro) {
        this.Deperimetro = Deperimetro;
    }
    

    @Override
    public void calcularArea() 
    {
        System.out.println("Ingrese el valor del apotema del decagono");
        setApotema(ingreso.nextDouble());
        setdeArea(getdePerimetro()*getApotema()/2);
        System.out.println("El area es igual "+getdeArea()); 
    }    
    public void calcularPerimetro()
    {
        System.out.println("Ingrese el valor de uno de los lados del decagono");
        setLado1(ingreso.nextDouble());
        setdePerimetro(getLado1()*10);
        System.out.println("El perimetro es"+getdePerimetro()); 
    }
    
}
