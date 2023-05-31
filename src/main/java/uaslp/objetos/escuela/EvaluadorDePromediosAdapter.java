package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    EvaluadorDePromedios evaluador;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluador){
        this.evaluador = evaluador;
    }

    public double evalua(String listaEnCadena){
        double promedio = 0;
        String[] lista = listaEnCadena.split(",");
        List<Double> valores = new ArrayList();


        for (int i=0; i <lista.length; i++){
            valores.add( Double.parseDouble((lista[i])));
        }

        return evaluador.evalua(valores);
    }



}


