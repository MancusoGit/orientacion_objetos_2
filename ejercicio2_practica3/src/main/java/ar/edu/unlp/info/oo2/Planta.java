package ar.edu.unlp.info.oo2;

public class Planta extends Empleado {

    private int hijos;
    private int antiguedad;
    private boolean casado; //true esta casado, false NO esta casado.

    public Planta(int hijos, int antiguedad, boolean casado) {
        this.hijos = hijos;
        this.antiguedad = antiguedad;
        this.casado = casado;
    }

    @Override
    protected double basico() {
        return 50000;
    }

    @Override
    protected double adicional() {
        double adAtrib = (this.hijos * 2000) + (this.antiguedad * 2000);
        return this.casado ? 5000 + adAtrib : adAtrib;
    }

}
