public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Soma das avaliacoes: " + somaDasAvaliacoes);
        System.out.println("Total de avaliacoes: " + totalAvaliacoes);

    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    double pegaMediaAvaliacoes(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}


