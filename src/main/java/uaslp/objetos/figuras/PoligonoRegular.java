package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    int numeroLados;
    double lado;


    public PoligonoRegular(int numeroLados) throws NumeroInvalidoDeLados {

        super("Poligono Regular");
        this.numeroLados = numeroLados;
        if (lado <= 3){
            throw new NumeroInvalidoDeLados();
        }

    }
    public PoligonoRegular(int numeroLados, double lado) {
        super("Poligono Regular");
        this.numeroLados = numeroLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getArea(){
        double hipotenusa = Math.pow(lado, 2);
        double a = Math.pow((lado/2), 2);
        double apotema = Math.sqrt(hipotenusa-a);
        double area = ((lado*numeroLados)*apotema)/2;
        return area;
    }

    public double getLado() {
        return lado;
    }

}
