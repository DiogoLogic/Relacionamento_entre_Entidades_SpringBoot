package br.com.projeto.exemplo02.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.exemplo02.modelo.Postagem;

public interface PostRepository extends CrudRepository<Postagem, Long>{

}
