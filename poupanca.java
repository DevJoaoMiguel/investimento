public class poupanca extends rendimento{

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

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    private double valor;
        private int tempo;
        private double juros;


    @Override
    public double calcRenda() {
        double calculoP = getValor() * Math.pow(1 + (getJuros() / 100), getTempo());
        return calculoP;
    }

}
