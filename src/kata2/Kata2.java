package kata2;
import java.util.HashMap;

public class Kata2 {
   
    public static void main(String[] args) {
         
   // integer[] vector = {2,1,3,1,4,6,100,100,2,100};
   // Double[] vector = {2.1,1.1,3.1,1.1,4.1,6.1,100.1,100.1,2.1,100.1};
    String[] vector = {"Ana","Elena","Pedro","Juan","Elena","Pedro","Pepe","Pepe"};
    
    Histograma histo = new Histograma(vector);
    HashMap<String, Integer> histograma = histo.getHistograma();
    
        // recorro las claves del histograma, no el vector del hisgrama.
        for(String key:histograma.keySet()){
            System.out.println(key +"-->"+ histograma.get(key));
        }
    }
}
