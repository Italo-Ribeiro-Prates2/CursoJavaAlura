public class Filme {

        static String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;
        int duracaoEmMinutos;

        int getTotalDeAvaliacoes(){
                return totalDeAvaliacoes;
        }

        void exibirFichaTecnica() {
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoDeLancamento);
        }

        void avalia(double nota){
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

        double pegaMedia(){
                return somaDasAvaliacoes / totalDeAvaliacoes;
        }
}

