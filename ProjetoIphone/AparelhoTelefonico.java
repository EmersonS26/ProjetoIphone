package ProjetoIphone;

public class AparelhoTelefonico extends Iphone implements MinutosRelevantes {
    private String usuario = " Joaquim ";
    private String senhaUsuario = " ******* ";
    protected double minutos = 0.055;

    public void Informacoes(){
        setSenhaUsuario(senhaUsuario);
        System.out.println("Usuário: " + usuario + " ingressou com sucesso.\nInicializando Sistema...");
    }
    

    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getSenhaUsuario() {
        return senhaUsuario;
    }


    public void setSenhaUsuario(String senhaUsuario2) {
        this.senhaUsuario = senhaUsuario2;
    }

    public void Ligar(){
        System.out.println("Ligando para aparelho selecionado.... ");
    }
    public void atender(){
        System.out.println("Telefone atendido");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Telefone em caixa postal...\nIndo para caixa postal(correio de voz)");
    }
    @Override
    public void minutosRelevantes() {
        System.out.println("Minutos em ligação: " + minutos);
       
    }


    public double getMinutos() {
        return minutos;
    }


    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

     
}
