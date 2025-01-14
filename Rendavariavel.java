public class Rendavariavel extends rendimento{

    private double valorInicial;
    private double valorFinal;
    private double dividendos;

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getDividendos() {
        return dividendos;
    }

    public void setDividendos(double dividendos) {
        this.dividendos = dividendos;
    }



    @Override
    public double calcRenda() {
        double calcRv = ((getValorFinal() - getValorInicial() + getDividendos()) / getValorInicial()) * 100;
        return calcRv;

    }

    }
