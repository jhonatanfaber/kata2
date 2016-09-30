/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

public class CalculateHistograma {
    
    public static <T> Histograma <T> computeHistograma(T[] vector){
        Histograma<T> histo = new Histograma<>();
        for(T key:vector){
            histo.increment(key);
        }
        return histo;
    }   
}
