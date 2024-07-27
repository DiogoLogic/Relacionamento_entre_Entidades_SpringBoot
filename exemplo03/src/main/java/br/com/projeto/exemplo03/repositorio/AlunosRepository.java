package br.com.projeto.exemplo03.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.exemplo03.modelo.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Long>{

}
