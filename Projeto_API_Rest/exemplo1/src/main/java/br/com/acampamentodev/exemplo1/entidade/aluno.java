package br.com.acampamentodev.exemplo1.entidade;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "alunos")
public class aluno {

    @Id
    private String id;

    @NotEmpty
    private String nome = "";
    @NotEmpty
    private String sobrenome = "";
    @NotEmpty
    private String cpf = "";
    
    @NotNull
    @Min(value = 1)
    private int matricula = 0;

    public String getCpf(){

        return cpf.substring(0,3).concat(".XXX.XXX-XX");
        
    }
    
}
