package ar.edu.unlp.info.oo2;

import java.time.Duration;

public class Finished extends EstadoToDoItem {
    
    @Override
    public Duration workedTime(ToDoItem contexto) {
        return Duration.between(contexto.getStartTime(), contexto.getEndTime());
    }

    @Override
    public void addComment(ToDoItem contexto, String comment) {

    }
    
}
