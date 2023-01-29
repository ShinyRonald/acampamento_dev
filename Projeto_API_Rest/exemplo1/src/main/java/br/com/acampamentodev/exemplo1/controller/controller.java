package br.com.acampamentodev.exemplo1.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acampamentodev.exemplo1.entidade.aluno;
import br.com.acampamentodev.exemplo1.repositorio.alunoRepository;


@RestController
@RequestMapping("/api/aluno")
public class controller {

    @Autowired
    alunoRepository AlunoRepository;

    @GetMapping("/get")
    public List<aluno> getAluno(){
        return AlunoRepository.findAll();
    }

    @GetMapping("/get={matricula}")
    public ResponseEntity<aluno> getAlunoMatricula(@PathVariable int matricula){
        aluno aluno = AlunoRepository.findByMatricula(matricula);

    
        if(aluno == null){
        return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(aluno);

        }

    @PostMapping("/post")
    public ResponseEntity<aluno> inserir(@RequestBody aluno aluno){
        
        AlunoRepository.insert(aluno);
        
        return ResponseEntity.created(null).body(aluno);

    }

    @PutMapping("/put={matricula}")
    public ResponseEntity<aluno> atualizarAluno(@RequestBody aluno novosDadosAluno, @PathVariable int matricula){
        aluno aluno = AlunoRepository.findByMatricula(matricula);

        if(aluno == null){
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(novosDadosAluno, aluno);
        AlunoRepository.insert(aluno);
        return ResponseEntity.created(null).body(aluno);
    }

    
}
