package br.com.projeto.exemplo02.controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.modelo.Comentario;
import br.com.projeto.exemplo02.repositorio.ComentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/comentarios")
public class ComentControle {

@Autowired
private ComentRepository comentRepository;

    @GetMapping("/listar")
    public Iterable<Comentario> listar(){ 
        return comentRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj){
        return comentRepository.save(obj);
    }

}
