package objeto;

public class ProdutoEstoque {
	private String nome;
	private int quantidade;
	
	public ProdutoEstoque() {}
	
	public ProdutoEstoque(String nome, int quantidade) {
		setNome (nome);
		setQuantidade (quantidade);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if (quantidade > 0) {
			this.quantidade = quantidade;
		}
	}
	
	public void adicionarEstoque (int qtd) {
		quantidade += qtd;
	}
	public void removerEstoque (int qtd) {
		if (qtd <= quantidade) {
			quantidade -= qtd;
		}
	}

}