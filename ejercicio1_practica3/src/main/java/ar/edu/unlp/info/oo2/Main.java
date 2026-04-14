package ar.edu.unlp.info.oo2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
        System.out.println("VoorheesExporter: ");
        System.err.println("");
        System.out.println(biblioteca.exportarSocios());
        System.err.println("");
        Exporter nuevoExporter = new JSONAdapter();
        biblioteca.setExporter(nuevoExporter);
        System.err.println("JSONSimpleExporter: ");
        System.err.println("");
        System.out.println(biblioteca.exportarSocios());
        System.err.println("");
        Exporter nuevExporter = new JacksonAdapter();
        biblioteca.setExporter(nuevoExporter);
        System.err.println("JacksonExporter: ");
        System.err.println("");
        System.out.println(biblioteca.exportarSocios());
        System.err.println("");
    }
    
}