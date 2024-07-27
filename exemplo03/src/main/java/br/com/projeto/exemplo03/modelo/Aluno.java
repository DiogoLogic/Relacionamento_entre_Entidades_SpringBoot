package br.com.projeto.exemplo03.modelo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "alunos")
public class Aluno {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long codigo;


private String aluno;

@ManyToAny
@JoinTable(
    name = "tabela_auxiliar",
    joinColumns = {@JoinColumn(name = "codigo_aluno", referencedColumnName = "codigo")},
    inverseJoinColumns = {@JoinColumn(name = "codigo_curso", referencedColumnName ="codigo")}
)
private List<Curso> cursos = new  ArrayList<>();

}
