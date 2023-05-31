package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {

    public double evalua(List<Double> calificaciones){
        double promedio = 0;

        for (Double i : calificaciones){
            promedio+= i;
        }
        promedio = promedio/ calificaciones.size();

        return promedio;
    }

}
