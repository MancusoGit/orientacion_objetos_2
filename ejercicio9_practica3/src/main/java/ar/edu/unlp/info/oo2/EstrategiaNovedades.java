package ar.edu.unlp.info.oo2;

import java.util.List;
import java.util.stream.Collectors;

public class EstrategiaNovedades implements EstrategiaSugerencia {

    public List<Pelicula> buscarSugerencias(Decodificador deco) {
        return deco.getCatalogo().stream()
            .filter(p -> !deco.getPeliculasVistas().contains(p)) // Que no se haya reproducido
            .sorted((p1, p2) -> Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno())) // Orden descendente por año
            .limit(3)
            .collect(Collectors.toList());
    }

}
