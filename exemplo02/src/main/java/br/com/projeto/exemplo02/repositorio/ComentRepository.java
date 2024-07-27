package br.com.projeto.exemplo02.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.exemplo02.modelo.Comentario;

public interface ComentRepository extends CrudRepository<Comentario, Long>{


}
