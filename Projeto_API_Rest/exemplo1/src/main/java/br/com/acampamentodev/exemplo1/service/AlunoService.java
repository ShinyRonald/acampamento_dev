package br.com.acampamentodev.exemplo1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acampamentodev.exemplo1.entidade.aluno;
import br.com.acampamentodev.exemplo1.repositorio.alunoRepository;

@Service
public class AlunoService {

    @Autowired
    alunoRepository alunoR;

    public List<aluno> obterTodos(){
        return alunoR.findAll();
    }

    public Optional<aluno> findById(String id){

        return alunoR.findById(id);

    }

    public aluno inserir(aluno aluno){

        alunoR.insert(aluno);

        return aluno;

    }

    public aluno atualizar(String id, aluno novosDadosDoAluno){

        Optional<aluno> aluno = findById(id);

        if(aluno.isPresent()){
            aluno novoAluno = aluno.get();

            novoAluno.setNome(novosDadosDoAluno.getNome());
            novoAluno.setCpf(novosDadosDoAluno.getCpf());
            novoAluno.setSobrenome(novosDadosDoAluno.getSobrenome());
            alunoR.save(novoAluno);

            return novoAluno;
        }

        return null;
    }

    public void deletar(String id) {
        Optional<aluno> aluno = findById(id);

       if (aluno.isPresent()) {
           alunoR.delete(aluno.get());
       }
    }

    public void deleteAll(){
        alunoR.deleteAll();
    }
} 
