package Repositorios;

import java.util.HashMap;
import java.util.Map;

import exemplo.Produto;

public class RepositorioProduto {
	private Map<String,Produto> catalogo;

	public RepositorioProduto() {
		this.catalogo = new HashMap<String, Produto>();
	}
	
	public Produto getProduto(String id) {
		return catalogo.get(id);
	}
	
	public void setProduto(Produto p) {
		catalogo.replace(p.getId(), p);
	}
	
	public void addProduto(Produto p) {
		catalogo.put(p.getId(), p);
	}
	
	public void removeProduto(String id) {
		catalogo.remove(id);
	}
	
	public void removeProduto(Produto p) {
		catalogo.remove(p.getId());
	}

	public String listar() {
		return catalogo.values().toString();
	}
	
}
