package display;

public class Texto implements ElementoVisual {
    private final String conteudo;
    
    public Texto(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public void exibir() {
        System.out.println(conteudo);
    }
    
}
