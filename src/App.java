import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
            //loop do jogo
            //p1 = policia && p2 = terrorista
            var p1 = new Policial("Newton", "Faca", 10, 5);
            var p2 = new Terrorista("RB", "Fuzil", 6, 5);
            var gerador = new Random();
            int acaoP1;
            int acaoP2;
            
            while(true){
                acaoP1 = gerador.nextInt(4) + 1;
                acaoP2 = gerador.nextInt(4) + 1;
                switch(acaoP1){
                    case 1:
                    p1.atacar();
                    break;
                    case 2:
                    p1.lancarGranada();
                    break;
                    case 3:
                    p1.desarmarBomba();
                    break;
                    case 4:
                    p1.passarAVez();
                    break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                switch(acaoP2){
                case 1:
                    p2.atacar();
                    break;
                case 2:
                    p2.lancarGranada();
                    break;
                case 3:
                    p2.plantarBomba();
                    break;
                case 4:
                    p2.passarAVez();
                    break;
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            Thread.sleep(5000);
        }
    }
}
