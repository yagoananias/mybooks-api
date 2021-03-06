package br.com.yagoananias.mybooks.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yagoananias.mybooks.domain.Categoria;
import br.com.yagoananias.mybooks.domain.Livro;
import br.com.yagoananias.mybooks.repositories.CategoriaRepository;
import br.com.yagoananias.mybooks.repositories.LivroRepository;

@Service
public class DBService {	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informatica", "Tecnologia da Informação");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Ciência e Tecnologia");
		Categoria cat3 = new Categoria(null, "Biografias", "Personalidades do mundo");
				
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Loren ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "H. G. Wells", "Loren ipsum", cat2);
		Livro l4 = new Livro(null, "I Robot", "Isaac Asimov", "Loren ipsum", cat2);
				
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat1.getLivros().addAll(Arrays.asList(l3, l4));
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4));
	}

}
