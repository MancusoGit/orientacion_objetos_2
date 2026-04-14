package ar.edu.unlp.info.oo2;

public class TopografiaTierra extends Topografia {

    public TopografiaTierra() {

    }

    @Override
    public double proporcionAgua() {
        return 0;
    }

    @Override
    public boolean esIgualA(Topografia otra) {
        // Le pasamos la pelota al otro objeto, diciéndole "Soy Tierra"
        return otra.esIgualATierra(this); 
    }

    @Override
    protected boolean esIgualAAgua(TopografiaAgua agua) {
        return false; 
    }

    @Override
    protected boolean esIgualATierra(TopografiaTierra tierra) {
        return true;
    }

    @Override
    protected boolean esIgualAMixta(TopografiaMixta mixta) {
        return false; 
    }

    @Override
    protected boolean esIgualAPantano(TopografiaPantano pantano) {
        return false;
    }

}
