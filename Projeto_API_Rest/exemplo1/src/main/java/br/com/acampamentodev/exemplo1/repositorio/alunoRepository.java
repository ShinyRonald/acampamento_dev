package br.com.acampamentodev.exemplo1.repositorio;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.acampamentodev.exemplo1.entidade.aluno;

public interface alunoRepository extends MongoRepository<aluno, String>{

    public Optional<aluno> findById(String id);

}
