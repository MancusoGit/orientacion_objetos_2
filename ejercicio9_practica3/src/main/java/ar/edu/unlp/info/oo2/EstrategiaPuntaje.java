package ar.edu.unlp.info.oo2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EstrategiaPuntaje implements EstrategiaSugerencia {

    public List<Pelicula> buscarSugerencias(Decodificador deco) {
        return deco.getCatalogo().stream()
            .filter(p -> !deco.getPeliculasVistas().contains(p))
            .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed() // Mayor puntaje primero
                    .thenComparing(Comparator.comparing(Pelicula::getAñoEstreno).reversed())) // Desempata por más reciente
            .limit(3)
            .collect(Collectors.toList());
    }


}
