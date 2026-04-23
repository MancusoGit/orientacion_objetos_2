package ar.edu.unlp.info.oo2;

import java.util.List;
import java.util.stream.Collectors;

public class EstrategiaSimilaridad  implements EstrategiaSugerencia {

    public List<Pelicula> buscarSugerencias(Decodificador deco) {
        return deco.getPeliculasVistas().stream()
            .flatMap(p -> p.getPeliculasSimilares().stream()) // Obtenemos las similares de cada reproducida
            .distinct() // Evitamos películas repetidas en el stream
            .filter(p -> !deco.getPeliculasVistas().contains(p)) // Que no se haya reproducido
            .sorted((p1, p2) -> Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno())) // De más a menos reciente
            .limit(3)
            .collect(Collectors.toList());
    }

}
