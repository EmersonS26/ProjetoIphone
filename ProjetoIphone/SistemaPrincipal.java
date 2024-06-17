package ProjetoIphone;

public class SistemaPrincipal {
    public static void main(String[] args) {
        AparelhoTelefonico a = new AparelhoTelefonico();
        a.Informacoes();
        a.Ligar();
        a.atender();
        a.iniciarCorreioVoz();
        a.minutosRelevantes();
        
        ReprodutorMusical b = new ReprodutorMusical();
        b.Informacoes();
        b.selecionarMusica();
        b.Tocar();
        b.pausar();
        b.minutosRelevantes();

        NavegadorInternet c = new NavegadorInternet();
        c.exibirPagina();
        c.adicionarNovaAba();
        c.atualizarPagina();

    }
}
