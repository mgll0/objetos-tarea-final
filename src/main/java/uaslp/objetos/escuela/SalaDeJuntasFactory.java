package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    private static SalaDeJuntas sala;

    public SalaDeJuntasFactory(){

    }


    public static SalaDeJuntas get(String name){
        sala = new SalaDeJuntas();
        sala.setNombre(name);

        return sala;
    }
}
