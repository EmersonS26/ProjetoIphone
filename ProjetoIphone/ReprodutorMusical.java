package ProjetoIphone;

public class ReprodutorMusical extends AparelhoTelefonico implements MinutosRelevantes{
    private String musica = "Verso e poesia";
    private String grupoMusical = "Melim";

    
    @Override
    public void minutosRelevantes() {
        
        System.out.println("Minutos tocados " + getMinutos());
    }


    public void Tocar(){
        System.out.println("Tocando... " + musica +" de " + grupoMusical);
    }
    public void pausar(){
        System.out.println("Pausando música...");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando... " + grupoMusical + musica);
    }
    
    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getGrupoMusical() {
        return grupoMusical;
    }

    public void setGrupoMusical(String grupoMusical) {
        this.grupoMusical = grupoMusical;
    }
    

}
