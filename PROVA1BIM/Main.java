import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "11111111111", "12345");
        Cliente cliente2 = new Cliente("Maria", "22222222222", "67890");

        Veiculo carro = new Carro("ABC1234", 100, true);
        Veiculo moto = new Moto("XYZ5678", 50, 300);

        Locacao loca1 = new Locacao(cliente1, carro, LocalDate.of(2026, 4, 20), LocalDate.of(2026, 4, 25));
        Locacao loca2 = new Locacao(cliente2, moto, LocalDate.of(2026, 4, 22), LocalDate.of(2026, 4, 28));

        loca1.realizarDevolucao();

        Locadora locadora = new Locadora();
        locadora.adicionarLocacao(loca1);
        locadora.adicionarLocacao(loca2);

        locadora.listarLocacoesAtivas();
    }
}