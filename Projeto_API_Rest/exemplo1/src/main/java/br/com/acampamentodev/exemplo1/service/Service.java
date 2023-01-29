package br.com.acampamentodev.exemplo1.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.acampamentodev.exemplo1.repositorio.alunoRepository;
import br.com.acampamentodev.exemplo1.entidade.aluno;

public class Service {

    @Autowired
    alunoRepository AlunoRepository;

    public List<aluno> obterTodos() {
        return AlunoRepository.findAll();
    }

    public aluno inserir(aluno aluno) {
        AlunoRepository.insert(aluno);
        return aluno;
    }

    public aluno atualizar(int matricula, aluno novosDadosDoaluno) {
        aluno aluno = selecionaralunoPelaMatricula(matricula);

        if (aluno != null) {
            BeanUtils.copyProperties(novosDadosDoaluno, aluno);
            AlunoRepository.save(aluno);
        }

        return aluno;
    }

    public void remove(int matricula) {
        aluno aluno = selecionaralunoPelaMatricula(matricula);

        if (aluno != null) {
            AlunoRepository.delete(aluno);
        }
    }

    public aluno selecionaralunoPelaMatricula(int matricula) {
        aluno aluno = AlunoRepository.findByMatricula(matricula);

        return aluno;
    }

}
