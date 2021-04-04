package br.com.yagoananias.mybooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.yagoananias.mybooks.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
