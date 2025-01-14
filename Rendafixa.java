public class Rendafixa extends rendimento {

    private double valor;
    private int tempo;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getAporteMensal() {
        return aporteMensal;
    }

    public void setAporteMensal(double aporteMensal) {
        this.aporteMensal = aporteMensal;
    }

    private double juros;
    private double aporteMensal;





    @Override
    public double calcRenda() {
        double valorFinal = getValor();
        int meses = getTempo() * 12;
        double taxaJurosMensal = Math.pow(1 + getJuros(), 1.0 / 12) - 1;


        for (int i = 0; i < meses; i++) {
            valorFinal = valorFinal * (1 + taxaJurosMensal) + getAporteMensal();
        }

        return valorFinal;
    }


    public double calcRendaSemAporte() {
        return getValor() * Math.pow((1 + getJuros()), getTempo());
    }
}
