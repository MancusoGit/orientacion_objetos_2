package ar.edu.unlp.info.oo2;

import java.time.Duration;

public abstract class EstadoToDoItem {

    public void start(ToDoItem contexto) {};

    public void togglePause(ToDoItem contexto) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void finish(ToDoItem contexto) {};

    public abstract Duration workedTime(ToDoItem contexto);

    public void addComment(ToDoItem contexto, String comment) {
        contexto.agregarComentario(comment);
    };

}
