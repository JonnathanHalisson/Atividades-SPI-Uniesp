package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeRepository repository;


    @GetMapping("/teste/iesp") /*Não é recomendado pois o próprio método tem o caminho quando se é o caminho base (ele já tem o caminho de forma implícita). Se usa quando se tem algo específico para mostrar.*/
    public String teste1(){
        return "teste";
    }

    @GetMapping("/teste")
    public Filme teste(){
        Filme f = new Filme();
        f.setTitulo("Teste");
        return f;
    }


    /*gravar*/
    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = repository.save(filme);
        return filme;
    }

    /*recuperar*/
    /*Manda tudo pela url*/
    @GetMapping
    public String listar(){
        return "Deveria Retornar Lista";
    }

    @DeleteMapping
    public String remover(){
        return "Removendo";
    }

    @PutMapping
    public String atualizar(){
        return "Atualizar";
    }

}
