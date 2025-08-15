package display;

public class Titulo implements ElementoVisual {
    private final String titulo;

    public Titulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibir() {
        System.out.println("=== "+titulo+" ===");
    }
}
