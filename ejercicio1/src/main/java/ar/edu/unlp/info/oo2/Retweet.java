package ar.edu.unlp.info.oo2;

public class Retweet extends Tweet {

    private Tweet origen;

    public Retweet(Tweet original) {
        if (original != null) {
            this.origen = original;
        }
    }

    @Override
    public String getTexto() {
        return this.origen.getTexto();
    }

    @Override
    public boolean getOrigen(Usuario user) {
        return this.origen.getOrigen(user);
    }
}
