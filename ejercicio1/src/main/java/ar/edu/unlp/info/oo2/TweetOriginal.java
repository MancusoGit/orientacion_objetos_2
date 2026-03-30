package ar.edu.unlp.info.oo2;

public class TweetOriginal extends Tweet {

    private String texto;

    public TweetOriginal(String mensaje) {
        this.texto = mensaje;
    }

    @Override
    public String getTexto() {
        return this.texto;
    }
    
    @Override
    public boolean getOrigen(Usuario user) {
        return user.contieneTweet(this);
    }

}
