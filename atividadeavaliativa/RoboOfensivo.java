package atividadeavaliativa;
public class RoboOfensivo extends Robo {

    public RoboOfensivo(int codigo, String nome, int ataque, int defesa) {
        super(codigo, nome, ataque, defesa, "Ofensivo");
    }

    @Override
    public int ataqueDoGolpe() {
        int ataqueComBonus = getAtaque() + 5;
        return ataqueComBonus;
    }
}
