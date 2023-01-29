package br.com.acampamentodev.exemplo1.entidade;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "alunos")
public class aluno {

    private String nome = "";
    private String sobrenome = "";
    private String cpf = "";
    private int matricula = 0;

    public String getCpf(){

        return cpf.substring(0,3).concat(".XXX.XXX-XX");
        
    }
    
}
