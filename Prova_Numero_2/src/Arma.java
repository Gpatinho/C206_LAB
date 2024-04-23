public class Arma {
    private String nomeArma;
    private int dano;

    public Arma(String nomeArma, int dano) {
        this.nomeArma = nomeArma;
        this.dano = dano;
    }

    public Arma() {

    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
