public class carro {

    private int velocidade = 0;
    private int velocidadeMaxima = 120;

    public void acelerar(){
        if(velocidade+10 <= velocidadeMaxima ){

        velocidade += 10;
    }

    }

    public void frear(){

        if(velocidade-10 >= 0 ){
            
        velocidade -= 10;
    }

    }

    @Override
    public String toString(){
        return String.format("Sua velocidade é: %s", velocidade);
    }
    
}
