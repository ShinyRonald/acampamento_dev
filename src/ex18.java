public class ex18 {

    public static void main(String[] args) throws Exception {

        String[] frases = {"Programar é legal","Pipipi popopo caixa de fosforo"};

        for(String frase : frases){

            if(frase.length() > 20){
                System.out.println(frase.substring(0, 20).concat("..."));
            }else{
                System.out.println(frase);
            }
    }

    }
}