package ar.edu.unlp.info.oo2;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONAdapter implements Exporter {

    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();
        socios.stream()
        .forEach(s -> this.exportarPriv(s,jsonArray));
        return jsonArray.toJSONString();
    }

    private void exportarPriv(Socio socio, JSONArray jsArray) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", socio.getNombre());
        jsonObject.put("email", socio.getEmail());
        jsonObject.put("legajo", socio.getLegajo());
        jsArray.add(jsonObject);
    }

}
