package br.com.acampamentodev.exemplo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.acampamentodev.exemplo1.Service.AlunoService;
import br.com.acampamentodev.exemplo1.entidade.aluno;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/aluno")
public class controller {

    @Autowired
    AlunoService alunoService;

    @GetMapping("/get")
    public List<aluno> getAluno(){
        return alunoService.obterTodos();
    }

    @GetMapping("/get={id}")
    public ResponseEntity<aluno> getAlunoMatricula(@PathVariable String id){
        Optional<aluno> aluno = alunoService.findById(id);

    
        if(aluno == null){
        return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(aluno.get());

        }

    @PostMapping("/post")
    public ResponseEntity<aluno> inserir(@Valid @RequestBody aluno aluno){
        
        alunoService.inserir(aluno);
        
        return ResponseEntity.created(null).body(aluno);

    }

    @PutMapping("/put={id}")
    public ResponseEntity<aluno> atualizarAluno(@RequestBody aluno novosDadosAluno, @PathVariable String id){

        aluno aluno = alunoService.atualizar(id, novosDadosAluno);

        if(aluno != null){

            return ResponseEntity.ok(aluno);
        }

        return ResponseEntity.notFound().build();
    }
    
    @PatchMapping("/patch/{id}")
    public ResponseEntity<aluno> atualizarCpf(@RequestParam("cpf") String cpf, @PathVariable String id){

        Optional<aluno> aluno = alunoService.findById(id);

        if(aluno.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        aluno novo = aluno.get();
        novo.setCpf(cpf);

        alunoService.atualizar(id,novo);

        return ResponseEntity.ok(novo);

        
    }

    @DeleteMapping("/delete={id}")
    public ResponseEntity<aluno> deletar(@PathVariable String id){
        Optional<aluno> aluno = alunoService.findById(id);

        if(aluno.isPresent()){
            alunoService.deletar(id);
            return ResponseEntity.ok(aluno.get());
        }

        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/deleteAll")
    public String deletarTodos(){

        alunoService.deleteAll();

        return "Deletado";
    }
}
