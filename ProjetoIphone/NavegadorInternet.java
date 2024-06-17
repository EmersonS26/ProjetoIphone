package ProjetoIphone;

public class NavegadorInternet {
    private String login = " George ";
    private String senha = " ****** ";

    public void exibirPagina(){
        System.out.println("Exibindo página de carregamento...\nInicializando Sistema...");
        System.out.println("Login: " + login + " Senha: " + senha);
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba de navegação....");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Sistema...");
        for(int i = 5; i >= 0; i--){
            System.out.println(i+ "...");
        }
        System.out.println("Página atualizada...");
    }

}
