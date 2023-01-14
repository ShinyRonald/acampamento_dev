public class cachorro {

    private String nome = "";
    private int sexo = 0; //1 male , 2 female


    public void trocarNome(String nome){

        this.nome = nome;

    }

    public void trocarSexo(int sexo){

        this.sexo = sexo;

    }

    @Override
    public String toString(){

        return String.format("O nome: %s \nO sexo: %s", nome, sexo);

    }

    


    
}
