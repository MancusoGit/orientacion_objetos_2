package ar.edu.unlp.info.oo2;

public class Pasante extends Empleado {

    private int examenes;

    public Pasante(int examenes) {
        this.examenes = examenes;
    }

    @Override
    protected double basico() {
        return 20000;
    }

    @Override
    protected double adicional() {
        return this.examenes * 2000;
    }

}
