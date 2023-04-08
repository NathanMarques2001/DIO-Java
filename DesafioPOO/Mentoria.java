package DesafioPOO;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public Mentoria(String titulo, String descricao) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.data = LocalDate.now();
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", titulo=" + getTitulo() + ", descricao=" + getDescricao() + "]";
	}

}
