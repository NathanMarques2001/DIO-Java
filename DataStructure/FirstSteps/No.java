package FirstSteps;

public class No<T> {
	private T conteudo;
	private No proximo;
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximo = null;
	}
	
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
}
