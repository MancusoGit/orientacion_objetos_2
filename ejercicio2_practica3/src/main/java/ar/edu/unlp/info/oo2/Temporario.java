package ar.edu.unlp.info.oo2;

public class Temporario extends Empleado {
    
    private int horas;
    private int hijos;
    private boolean casado;

    public Temporario(int horas, int hijos, boolean casado) {
        this.horas = horas;
        this.hijos = hijos;
        this.casado = casado;
    }

    @Override
    protected double basico() {
        return 20000 + (this.horas * 300);
    }

    @Override
    protected double adicional() {
        double adHijos = this.hijos * 2000;
        return this.casado ? 5000 + adHijos : adHijos;
    }

}
