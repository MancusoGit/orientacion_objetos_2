package ar.edu.unlp.info.oo2;

public class TopografiaPantano extends Topografia {

    @Override
    public double proporcionAgua() {
        return 0.7;
    }

    @Override
    public boolean esIgualA(Topografia otra) {
        // Le pasamos la pelota al otro objeto, diciéndole "Soy Agua"
        return otra.esIgualAPantano(this); 
    }

    @Override
    protected boolean esIgualAAgua(TopografiaAgua agua) {
        return false; 
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
        return true;
    }
    
}
