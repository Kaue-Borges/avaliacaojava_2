package atividadeavaliativa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Robo> robos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("cadastro de robos");
        System.out.println("1 Cadastrar robo");
        System.out.println("2 Lista dos robos");
        System.out.println("3 realizar combate");
         System.out.println("0 Sair");
        System.out.print("digite a opção: ");
        opcao = scanner.nextInt();
    switch (opcao) {
        case 1:
            System.out.print("Digite o código do robo: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do robo: ");
            String nome = scanner.nextLine();
            System.out.print("Informe o poder de ataque: ");
            int ataque = scanner.nextInt();
            System.out.print("informe o poder de defesa: ");
            int defesa = scanner.nextInt();
            if (!Robo.atributosValidos(ataque, defesa)) {
                System.out.println("Ataque deve ser entre 10 e 30.");
                System.out.println("Defesa deve ser entre 0 e 20.");
                break;
            }
                System.out.println("qual o tipo do robo? 1 ofensivo, 2 defensivo, 3 equilibrado");
                int tipo = scanner.nextInt();

                Robo robo;
                if (tipo == 1) {
                    robo = new RoboOfensivo(codigo, nome, ataque, defesa);
                }
                else if (tipo == 2) {
                    robo = new RoboDefensivo(codigo, nome, ataque, defesa);
                }
                else if (tipo == 3) {
                    robo = new RoboEquilibrado(codigo, nome, ataque, defesa);}
                else {
                    System.out.println("esse tipo não existe.");
                    break;
                }
                robos.add(robo);
                System.out.println("Robo cadastrado.");
                break;
            case 2:
                System.out.println("lista dos robos:");
                for (Robo r : robos) {
                     r.exibirStatus();
                }
                break;
            case 3:
                System.out.println("me passa o código do primeiro robo:");
                int codigo1 = scanner.nextInt();
                System.out.println("me passa o código do segundo robo:");
                int codigo2 = scanner.nextInt();
                Robo robo1 = null;
                Robo robo2 = null;
                for(Robo r : robos){
                    if(r.getCodigo() == codigo1){
                        robo1 = r;
                    }
                    if(r.getCodigo() == codigo2){
                        robo2 = r;
                    }
                }
                if(robo1 == null || robo2 == null){
                    System.out.println("não consegui encontrar os robos.");
                    break;                   
                }
                if (codigo1 ==codigo2){
                    System.out.println("não tem ele lutar contra ele mesmo né cara.");
                    break;
                }
                if(!robo1.podeLutar() || !robo2.podeLutar()){
                    System.out.println("o robo precisa ter pelo menos 30 de energia pra fazer o combate.");
                    break;
                }
                System.out.println("a luta vai ser entre " +robo1.getNome() + " e " + robo2.getNome());
                Robo primeiro;
                Robo segundo;

                if(robo1.getPontos() < robo2.getPontos() || (robo1.getPontos() == robo2.getPontos() && robo1.getCodigo() < robo2.getCodigo())){
                    primeiro = robo1;
                    segundo = robo2;
                }
                else{
                    primeiro = robo2;
                    segundo = robo1;
                }
                System.out.println("o robo " + primeiro.getNome() + " vai começar atacando.");
                for(int rodada = 1; rodada <=5; rodada++){
                    System.out.println("rodada " + rodada);
                    int dano = primeiro.calcularDano(segundo, rodada);
                    segundo.receberDano(dano);
                    System.out.println(primeiro.getNome() + " atacou " + segundo.getNome());
                    System.out.println("dano: " + dano);
                    System.out.println("A energia do " + segundo.getNome() + " é: " + segundo.getEnergiaAtual());
                    if(segundo.getEnergiaAtual() == 0){
                        System.out.println(segundo.getNome() + " finish him");
                        break;
                    }
                dano = segundo.calcularDano(primeiro, rodada);
                primeiro.receberDano(dano);
                System.out.println(segundo.getNome() + " atacou " + primeiro.getNome());
                System.out.println("dano: " + dano);
                System.out.println("A energia do " + primeiro.getNome() + " é: " + primeiro.getEnergiaAtual());
                if(primeiro.getEnergiaAtual() == 0){
                    System.out.println(primeiro.getNome() + " finish him");
                    break; 
                } 
                }
                if(primeiro.getEnergiaAtual() > segundo.getEnergiaAtual()){
                    System.out.println("o vencedor é " + primeiro.getNome());
                    System.out.println(" Finish HIMMM ");
                    primeiro.registrarVitoria();
                    segundo.registrarDerrota();
                }
                else if(segundo.getEnergiaAtual() > primeiro.getEnergiaAtual()){
                    System.out.println("o vencedor é " + segundo.getNome());
                    System.out.println(" Finish HIMMM ");
                    segundo.registrarVitoria();
                    primeiro.registrarDerrota();
                }
                else{
                    System.out.println("empate cada robo ganha só 1 ponto");
                    primeiro.registrarEmpate();
                    segundo.registrarEmpate();
                }
                break;
                        case 0:
                System.out.println("Saindo do programa.");
                break;

        } 
    } while (opcao != 0); 
        scanner.close();
    }
}
