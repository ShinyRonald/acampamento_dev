public class ex17 {

    public static void main(String[] args) throws Exception {

      String[] frutas = {"Jaca", "Melancia", "Fruta-Pão", "Graviola", "Banana-da-Terra"};

      for(String fruta : frutas){

        if(fruta.contains("-")){
            System.out.println(fruta.concat("(palavra composta)"));
        }else{
            System.out.println(fruta);
        }

      }
    }
}