package br.com.projeto.exemplo02.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.modelo.Postagem;
import br.com.projeto.exemplo02.repositorio.PostRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemControle {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj){
        return postRepository.save(obj);
    }
}
