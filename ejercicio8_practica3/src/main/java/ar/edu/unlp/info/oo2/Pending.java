package ar.edu.unlp.info.oo2;

import java.time.Duration;

public class Pending extends EstadoToDoItem {

    @Override
    public void start(ToDoItem contexto) {
        contexto.registrarInicio();
        contexto.setEstado(new InProgress());
    } 

    @Override
    public void togglePause(ToDoItem contexto) {
        throw new RuntimeException("El ToDoItem no se puede pausar aun");
    }

    @Override
    public Duration workedTime(ToDoItem contexto) {
        throw new RuntimeException("El ToDoItem no inicio aun");
    }
}
