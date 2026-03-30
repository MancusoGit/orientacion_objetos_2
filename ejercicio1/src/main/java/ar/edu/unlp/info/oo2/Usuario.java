package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {

    private String screenName;
    private List<Tweet> tweets;


    public Usuario(String nombreUsuario) {
        this.screenName = nombreUsuario;
        this.tweets = new ArrayList<>();
    }

    public String getScreenName() {
        return this.screenName;
    }

    public void agregarTweet(String mensaje) {
        int min = 1;
        int max = 280;

        if (mensaje.length() >= min && mensaje.length() <= max) {
            this.tweets.add(new TweetOriginal(mensaje));
        }
    }

    public void retweetear(TweetOriginal tweet) {
        this.tweets.add(new Retweet(tweet));
    }

    public boolean contieneTweet(Tweet tw) {
        return this.tweets.contains(tw);
    }

    public void eliminarTweets() {
        this.tweets.clear();
    }

    public void eliminarTweetsDelUsuario(Usuario user) {
        this.tweets = this.tweets.stream()
                        .filter(tw -> !tw.getOrigen(user))
                        .collect(Collectors.toList());
        
    }

}
