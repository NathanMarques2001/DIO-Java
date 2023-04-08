package DesafioPOO;

public class Main {

	public static void main(String[] args) {

		Conteudo curso1 = new Curso("Java", "Descricao curso de Java", 8);
		Conteudo curso2 = new Curso("JavaScript", "Descricao curso de JavaScript", 4);
		Conteudo mentoria1 = new Mentoria("Mentoria Java", "Descricao mentoria Java");
		Conteudo mentoria2 = new Mentoria("Mentoria JavaScript", "Descricao mentoria JavaScript");

		Bootcamp bootcamp = new Bootcamp("Java Developer", "Descricao Bootcamp", curso1, mentoria1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria2);

		Dev dev1 = new Dev();
		dev1.setNome("Nathan");
		dev1.inscreverBootcamp(bootcamp);

		Dev dev2 = new Dev();
		dev2.setNome("Camila");

		System.out.println(dev1.getConteudosInscritos());
		System.out.println(dev1.getConteudosConcluidos());
		System.out.println(dev1.calcularXp());

		dev2.inscreverBootcamp(bootcamp);
		dev2.progredir();
		dev2.progredir();
		System.out.println(dev2.getConteudosInscritos());
		System.out.println(dev2.getConteudosConcluidos());

		System.out.println(dev2.calcularXp());
	}

}
