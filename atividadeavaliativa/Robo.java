package atividadeavaliativa;
public abstract class Robo{

    private int codigo;
    private String nome;
    private int ataque;
    private int defesa;
    private int energia_atual = 100;
    private int vitorias = 0;
    private int derrotas = 0;
    private int pontos = 0;
    private int combatesRealizados = 0;
    private String tipo;

    public Robo(int codigo, String nome, int ataque, int defesa, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public static boolean atributosValidos(int ataque, int defesa) {
        if (ataque < 10 || ataque > 30 || defesa < 0 || defesa > 20) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public String getNome() {
        return this.nome;
    }
    public int getAtaque() {
        return this.ataque;
    }
    public int getDefesa() {
        return this.defesa;
    }
    public int getEnergiaAtual() {
        return this.energia_atual;
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public int getDerrotas() {
        return this.derrotas;
    }
    public int getPontos() {
        return this.pontos;
    }
    public int getCombatesRealizados() {
        return this.combatesRealizados;
    }
    public String getTipo() {
        return this.tipo;
    }

    public int ataqueDoGolpe() {
        return this.ataque;
    }
    public int reduzirDanoRecebido(int dano) {
        return dano;
    }

    public boolean podeLutar() {
        return this.energia_atual >= 30;
    }

    public void receberDano(int dano) {
        if (dano > 0) {
            this.energia_atual = this.energia_atual - dano;
            if (this.energia_atual < 0) {
                this.energia_atual = 0;
            }
        }
    }
    public int calcularDano(Robo adversario, int rodada){
        int dano = this.ataqueDoGolpe() - adversario.getDefesa();
        if (dano < 5) {
            dano = 5;
        }

        if (rodada % 2 == 0) {
            dano += 5;
        }
        dano = adversario.reduzirDanoRecebido(dano);
        return dano;
    }
    public void registrarVitoria() {
        this.vitorias++;
        this.pontos += 3;
        this.combatesRealizados++;
    }
    public void registrarDerrota() {
        this.derrotas++;
        this.combatesRealizados++;
    }
    public void registrarEmpate() {
        this.pontos ++;
        this.combatesRealizados++;
    }
    public void exibirStatus() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defesa: " + this.defesa);
        System.out.println("Energia atual: " + this.energia_atual);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Pontos: " + this.pontos);
        System.out.println("Combates realizados: " + this.combatesRealizados);

        if (this.energia_atual >= 30) {
            System.out.println("pode usar o robo");
        } else { 
            System.out.println("bota essa merda carregar");
        }

    }
    
}
