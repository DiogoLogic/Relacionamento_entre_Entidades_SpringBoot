package br.com.projeto.exemplo01.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.projeto.exemplo01.modelo.Cargo;
import br.com.projeto.exemplo01.repositorio.CargoRepositorio;

@Service
// Anotação que indica que esta classe é um serviço, um componente do Spring que contém lógica de negócios.
// O Spring gerencia a instância dessa classe e a injeta onde for necessário.
public class CargoService {

    // Declaração de uma variável final para armazenar a referência ao repositório de cargos.
    // O modificador 'final' garante que essa referência não será modificada após ser atribuída.
    public final CargoRepositorio cargoRepositorio;

    // Construtor da classe CargoService que recebe um CargoRepositorio como parâmetro.
    // A injeção de dependência ocorre aqui, permitindo que o repositório seja fornecido ao serviço pelo Spring.
    public CargoService(CargoRepositorio cargoRepositorio){
        // Atribuição do repositório injetado à variável de instância.
        this.cargoRepositorio = cargoRepositorio;
    }

    // Método para retornar todos os cargos.
    // Chama o método findAll do repositório para buscar todas as entidades Cargo no banco de dados.
    public Iterable<Cargo> findAll(){
        return cargoRepositorio.findAll();
    }

    // Método para buscar um cargo por ID.
    // Chama o método findById do repositório para buscar uma entidade Cargo pelo seu ID.
    public Optional<Cargo> findById(Long id) {
        return cargoRepositorio.findById(id);
    }
}

