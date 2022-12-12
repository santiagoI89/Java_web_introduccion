package figuras;
public class trapecio extends figurasgeometricas 
{
    private double ladoCorto,ladoLargo,altura,traarea,traperimetro;

    public double getLadoCorto() {
        return ladoCorto;
    }
    public trapecio(double ladoCorto, double ladoLargo, double altura, double traarea, double traperimetro) 
    {  
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo;
        this.altura = altura;
        this.traarea = traarea;
        this.traperimetro = traperimetro;
    }
    public void setLadoCorto(double ladoCorto) {
        this.ladoCorto = ladoCorto;
    }

    public double getLadoLargo() {
        return ladoLargo;
    }

    public void setLadoLargo(double ladoLargo) {
        this.ladoLargo = ladoLargo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double gettraArea() {
        return traarea;
    }

    public void settraArea(double traarea) {
        this.traarea = traarea;
    }

    public double gettraPerimetro() {
        return traperimetro;
    }

    public void settraPerimetro(double traperimetro) {
        this.traperimetro = traperimetro;
    }
    @Override
    public void calcularArea() 
    {
        settraArea((getLadoCorto()+getLadoLargo()*getAltura())/2);
        System.out.println("El area es "+gettraPerimetro());  
    }
    public void calcularPerimetro()
    {
        System.out.println("Ingrese el lado corto del trapecio");
        setLadoCorto(ingreso.nextDouble());
        System.out.println("Ingrese el lado largo del trapecio");
        setLadoLargo(ingreso.nextDouble());
        System.out.println("Ingrese la altura del trapecio");
        setAltura(ingreso.nextDouble());
        settraPerimetro(getLadoCorto()+getLadoLargo()+getAltura()*2); 
        System.out.println("El perimetro es "+gettraPerimetro());     
    }
}
