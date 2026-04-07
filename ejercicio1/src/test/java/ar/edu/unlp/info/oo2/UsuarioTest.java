package ar.edu.unlp.info.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UsuarioTest {

    private Usuario usuario;
    private Usuario usuario2;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Gerardo Sofovich");
    }

    @Test
    void testAgregarTweet() {
        usuario.agregarTweet("viva peron");
        usuario.agregarTweet("");
        usuario.agregarTweet("La Tierra Media es un mundo fascinante que ha cautivado a generaciones enteras. Desde las pacíficas colinas de la Comarca hasta las oscuras profundidades de Mordor, la historia de la Comunidad nos enseña sobre el valor, la lealtad inquebrantable y el sacrificio. aaaaaaaaaaaaaaaaaa");
        assertEquals(1, usuario.getCantidadDeTweets());
    }

    @Test
    void testRetweetear() {
        TweetOriginal tw = new TweetOriginal("aguante river");
        usuario.retweetear(tw);
        assertEquals(1, usuario.getCantidadDeTweets());
        usuario.retweetear(tw);
        assertEquals(2, usuario.getCantidadDeTweets());
    }

}
