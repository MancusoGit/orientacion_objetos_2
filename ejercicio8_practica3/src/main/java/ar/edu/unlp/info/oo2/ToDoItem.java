package ar.edu.unlp.info.oo2;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

    private String nombre;
    private EstadoToDoItem estado;
    private Duration tiempo;
    private List<String> comentarios;
    private Instant inicioItem;
    private Instant finalItem;

    public ToDoItem(String name) {
        this.nombre = name;
        this.estado = new Pending();
        this.comentarios = new ArrayList<>();
    }

    protected void setEstado(EstadoToDoItem estado) {
        this.estado = estado;
    }

    public void start() {
        this.estado.start(this);
    }

    public void togglePause() {
        this.estado.togglePause(this);
    }

    public void finish() {
        this.estado.finish(this);
    }

    public Duration workedTime() {
        return this.estado.workedTime(this);
    }

    public void addComment(String comment) {
        this.estado.addComment(this, comment);
    }

    protected void registrarInicio() { 
        this.inicioItem = Instant.now(); 
    }
    
    protected void registrarFin() { 
        this.finalItem = Instant.now(); 
    }
    
    protected Instant getStartTime() { 
        return this.inicioItem; 
    }
    
    protected Instant getEndTime() { 
        return this.finalItem; 
    }

    protected void agregarComentario(String comentario) {
        this.comentarios.add(comentario);
    }

    
}
