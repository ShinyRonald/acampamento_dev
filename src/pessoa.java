public class pessoa {

    private String nome = "";
    private String sobrenome = "";
    private int sexo = 0; //1 male ; 2 female

    public String dizerNome(){

        switch(sexo){

         case 1 :
         return String.format("Bem vindo as bolinhas %s %s", nome, sobrenome);

         case 2 :
         return String.format("Bem vindo as luluzinhas %s %s", nome, sobrenome);

         default:
         return "Não binário";
         
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}