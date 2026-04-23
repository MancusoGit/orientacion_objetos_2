package ar.edu.unlp.info.oo2;

import java.time.Duration;
import java.time.Instant;

public class InProgress extends EstadoToDoItem {

    @Override
    public void togglePause(ToDoItem contexto) {
        contexto.setEstado(new Paused());
    }

    @Override
    public void finish(ToDoItem contexto) {
        contexto.registrarFin();
        contexto.setEstado(new Finished());
    }

    @Override
    public Duration workedTime(ToDoItem contexto) {
        return Duration.between(contexto.getStartTime(), Instant.now());
    }
    
}
