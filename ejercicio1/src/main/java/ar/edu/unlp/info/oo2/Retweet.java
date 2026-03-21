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

    public Tweet getOrigen() {
        return this.origen;
    }
}
