public class Locadora {
    private Locacao[] locacoes = new Locacao[10];
    private int contador = 0;

    public boolean adicionarLocacao(Locacao locacao) {
        if (contador < locacoes.length) {
            locacoes[contador++] = locacao;
            return true;
        }
        return false;
    }

    public void listarLocacoesAtivas() {
        for (int i = 0; i < contador; i++) {
            if (!locacoes[i].isDevolvida()) {
                System.out.println(locacoes[i]);
                System.out.println();
            }
        }
    }
}