package ar.edu.unlp.info.oo2;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter implements Exporter {

    private ObjectMapper mapper;

    public JacksonAdapter() {
        this.mapper = new ObjectMapper();
    }

    public String exportar(List<Socio> socios) {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(socios);
        } catch (Exception e) {
            throw new RuntimeException("Error al serializar con Jackson", e);
        }
    }

}
