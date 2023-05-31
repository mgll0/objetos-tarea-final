package uaslp.objetos.escuela;

public class Sender implements Dependencia3{
    @Override
    public boolean send(int a, int b) {
        return true;
    }

    @Override
    public void recover() {
    }

    @Override
    public void save(String c) {

    }
}
