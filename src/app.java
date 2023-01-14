import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class app {

    public static void main(String[] args) throws Exception {

        
        FileWriter writer = new FileWriter("A.txt");
        FileReader reader = new FileReader("/home/ronald/acampamento/acampamento/src/acampamento.txt");
        BufferedReader bufferedreader = new BufferedReader(reader);
        String line = bufferedreader.readLine();

        while(line != null){
            
            writer.write(line.replaceAll("(([0-9]){3}[.]){3}([0-9]{3})", "192.168.0.1,18033"));
            line = bufferedreader.readLine();
        }



        writer.close();
        bufferedreader.close();
        reader.close();
    }
    
}
