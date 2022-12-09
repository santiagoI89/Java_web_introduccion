package figuras;

public class triangulo extends figurasgeometricas 

{
    private double base,altura,areat,perimetrot;

    public double getBase() {
        return base;
    }

    public triangulo( double base, double altura, double areat, double perimetrot) {      
        this.base = base;
        this.altura = altura;
        this.areat = areat;
        this.perimetrot = perimetrot;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double gettriArea() {
        return areat;
    }

    public void settriArea(double areat) {
        this.areat = areat;
    }

    public double gettriPerimetro() {
        return perimetrot;
    }

    public void settriPerimetro(double perimetrot) {
        this.perimetrot = perimetrot;
    }
    
    @Override
    public void calcularArea() 
    {
        settriArea(getBase()*(getAltura()/2));
        System.out.println("El area es igual "+gettriArea());
        
    }
    public void calcularPerimetro()
    {
        System.out.println("Digite la base del triangulo");
        setBase(ingreso.nextDouble());
        System.out.println("Digite la altura del triangulo");
        setAltura(ingreso.nextDouble());
        settriPerimetro(getBase()+(getAltura()*2));
        System.out.println("El perimetro es igual "+gettriPerimetro());
    }
}
