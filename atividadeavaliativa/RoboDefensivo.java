package atividadeavaliativa;
public class RoboDefensivo extends Robo {

    public RoboDefensivo(int codigo, String nome, int ataque, int defesa) {
        super(codigo, nome, ataque, defesa, "Defensivo");
    }

    @Override
    public int reduzirDanoRecebido(int dano) {
        int danoFinal = dano - 3;
        if (danoFinal < 2) {
            danoFinal = 2;
        }
        return danoFinal;
    }
}
