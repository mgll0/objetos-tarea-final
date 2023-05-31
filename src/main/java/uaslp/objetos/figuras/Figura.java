package uaslp.objetos.figuras;

public class Figura extends DrawableItem{
    String name;
    public Figura(String name) {
        this.name = name;
    }

    public Figura(){

    }

    public String getName() {
        return name;
    }
}
