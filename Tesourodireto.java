public class Tesourodireto extends rendimento{

    private double ValorInicial;
    private double ValorFinal;

    public double getValorFinal() {
        return ValorFinal;
    }

    public void setValorFinal(double valorFinal) {
        ValorFinal = valorFinal;
    }

    public double getValorInicial() {
        return ValorInicial;
    }

    public void setValorInicial(double valorInicial) {
        ValorInicial = valorInicial;
    }






    @Override
    public double calcRenda() {
        double calcT = (getValorFinal()/getValorInicial()) *100 -100;
        return calcT;
    }
}
