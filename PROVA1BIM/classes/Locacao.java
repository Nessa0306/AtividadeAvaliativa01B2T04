import java.time.LocalDate;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private boolean devolvida;

    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.devolvida = false;
    }

    public void realizarDevolucao() {
        this.devolvida = true;
    }

    public boolean devolvida() {
        return devolvida;
    }

    public double calcularValorTotal() {
        long dias = dataDevolucao.toEpochDay() - dataRetirada.toEpochDay();
        return dias * veiculo.getValorDiaria();
    }

    public String toString() {
        return cliente + "\n" +
               veiculo.exibirInfo() + "\n" +
               "Retirada: " + dataRetirada +
               ", Devolução: " + dataDevolucao +
               ", Status: " + (devolvida ? "Finalizada" : "Ativa") +
               ", Total: " + calcularValorTotal();
    }
}