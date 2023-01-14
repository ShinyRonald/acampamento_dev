public class ex22 {

    public static void main(String[] args) throws Exception {

        pessoa a = new pessoa();
        a.setNome("Jabuti");
        a.setSobrenome("Cor de rosa");

        //1 male, 2 female
        a.setSexo(2);

        System.out.println(a.dizerNome());
    }   
    }