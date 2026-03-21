package ar.edu.unlp.info.oo2;

import java.util.ArrayList;

public class Twitter {

    private ArrayList<Usuario> usuarios;

    public Twitter() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario user) {
        if (buscarUsuario(user.getScreenName()) == null) {
            this.usuarios.add(user);
        }
    }

    public void eliminarUsuario(String username) {
        Usuario aux = buscarUsuario(username);
        if (aux != null) {
            aux.eliminarTweets();
            this.usuarios.remove(aux);
        }
    }

    public Usuario buscarUsuario(String username) {
        return usuarios.stream()
                .filter(user -> user.getScreenName().equals(username))
                .findFirst()
                .orElse(null);
    }

}
