package ar.edu.unlp.info.oo2;

public abstract class Topografia {

    public abstract double proporcionAgua();
    
    public double proporcionTierra() {
        return 1.0 - this.proporcionAgua();
    }

    public abstract boolean esIgualA(Topografia otra);

    protected abstract boolean esIgualAAgua(TopografiaAgua agua);

    protected abstract boolean esIgualATierra(TopografiaTierra tierra);
    
    protected abstract boolean esIgualAMixta(TopografiaMixta mixta);

    protected abstract boolean esIgualAPantano(TopografiaPantano pantano);

}
