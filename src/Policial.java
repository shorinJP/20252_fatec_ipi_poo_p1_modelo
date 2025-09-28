public class Policial{
    private String nome;
    private String armamento;
    private int energia;
    private int quantidadeGranadas;

    Policial(String nome, String armamento, int energia, int quantidadeGranadas){
        if(nome.length() >= 4){
            this.nome = nome;
        }
        if(armamento == "Faca" || armamento == "Pistola" || armamento == "Fuzil"){
            this.armamento = armamento;
        }
        if(energia >= 0 && energia <= 10){
            this.energia = energia;
        }
        if(quantidadeGranadas >= 0 && quantidadeGranadas <= 5){
            this.quantidadeGranadas = quantidadeGranadas;
        }
    }

    public void desarmarBomba(){
        System.out.println(nome + " desarmando bomba... ");
    }

    public void lancarGranada(){
        if(quantidadeGranadas > 0){ 
            System.out.println(nome + " lançando granada... ");
            quantidadeGranadas--;
        }
        else{
            System.out.println(nome + " não tem granada");
        } 
    }

    public void atacar(){
        System.out.println(nome + " atacando... ");
    }

    public void passarAVez(){
        System.out.println(nome + " passou a vez... ");
    }
}