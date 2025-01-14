public class LCILCA extends rendimento{

        private double valorInicial;
        private double taxaJuros;
        private int tempo;

        public double getValorInicial() {
            return valorInicial;
        }

        public void setValorInicial(double valorInicial) {
            this.valorInicial = valorInicial;
        }

        public double getTaxaJuros() {
            return taxaJuros;
        }

        public void setTaxaJuros(double taxaJuros) {
            this.taxaJuros = taxaJuros / 100;
        }

        public int getTempo() {
            return tempo;
        }

        public void setTempo(int tempo) {
            this.tempo = tempo;
        }

        @Override
        public double calcRenda() {
            double calcLL= getValorInicial() * Math.pow(1 +getTaxaJuros(), getTempo());
            return calcLL;
        }
    }

