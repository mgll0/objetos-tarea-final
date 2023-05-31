package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    double base;
    double altura;

    String descripcion = "Cualquier triangulo";

    public Triangulo(String message, String descripcion){
        super(message);
        this.descripcion = descripcion;
    }
    public Triangulo( ){

    }

    public Triangulo(double base, double altura, String message){
        super(message);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;

    }


    public double getArea() throws DatoFaltanteException {
        if (base <= 0){
            throw new BaseNoProvistaException();
        }
        if (altura <= 0){
            throw new AlturaNoProvistaException();
        }
        return (base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription() {
        return descripcion;
    }
}


