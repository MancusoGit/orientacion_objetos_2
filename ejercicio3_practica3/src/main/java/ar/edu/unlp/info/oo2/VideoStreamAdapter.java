package ar.edu.unlp.info.oo2;

public class VideoStreamAdapter extends Media {

    private VideoStream adaptador;

    public void play() {
        adaptador.reproduce();
    }

}
