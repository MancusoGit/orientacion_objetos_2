package ar.edu.unlp.info.oo2;

public class TweetOriginal extends Tweet {

    private String texto;

    public TweetOriginal(String mensaje) {
        int min = 1;
        int max = 280;

        if (mensaje.length() >= min && mensaje.length() <= max) {
            this.texto = mensaje;
        }
    }

    @Override
    public String getTexto() {
        return this.texto;
    }
}
