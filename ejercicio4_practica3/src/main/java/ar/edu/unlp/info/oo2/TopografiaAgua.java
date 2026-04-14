package ar.edu.unlp.info.oo2;

public class TopografiaAgua extends Topografia {

    public TopografiaAgua() {

    }

    @Override
    public double proporcionAgua() {
        return 1;
    }

    @Override
    public boolean esIgualA(Topografia otra) {
        // Le pasamos la pelota al otro objeto, diciéndole "Soy Agua"
        return otra.esIgualAAgua(this); 
    }

    @Override
    protected boolean esIgualAAgua(TopografiaAgua agua) {
        return true; 
    }

    @Override
    protected boolean esIgualATierra(TopografiaTierra tierra) {
        return false; 
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
