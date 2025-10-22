package objeto;

public class Musica {
	private String titulo;
	private int duracaoSegundos;

	public Musica () {}
	
	public Musica(String titulo, int duracaoSegundos) {
		setTitulo  (titulo);
		setDuracaoSegundos (duracaoSegundos);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}
	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
	
	public String formatarDuracao() {
		return (duracaoSegundos / 60) + ":" + (duracaoSegundos % 60);
	}

}