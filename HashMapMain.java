
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class HashMapMain {
    
    /*
    HashMap Sınıfı
    
    1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık
    gelen bir tane değer bulunur.
    2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
    3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
    
    
    
    */
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20, "Php");
        hashMap.put(20,"Php");
        
        hashMap.put(50, "Javascript");
        
        for(Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println("Anahtar:"+ entry.getKey()+ "->>>>>>>>"+ "Değer:" +entry.getValue());
        }
        System.out.println("************");
        TreeMap<Integer,String> treemap= new TreeMap<Integer,String>();
        treemap.put(15,"java");
        treemap.put(50, "python");
        treemap.put(45, "javascript");
        for(Map.Entry<Integer,String> entry:treemap.entrySet()){
            System.out.println("Anahtar:" + entry.getKey() + "->>>>" + "Değer:" + entry.getValue());
        }
        System.out.println("*********");
        LinkedHashMap<Integer,String> linkedHashMap= new LinkedHashMap<Integer,String>();
        linkedHashMap.put(60, "Java");
        linkedHashMap.put(20, "Python");
        linkedHashMap.put(30, "C#");
        for(Map.Entry<Integer,String> entry: linkedHashMap.entrySet()){
            System.out.println("Anahtar:" + entry.getKey() + "->>>>" + "Değer:" + entry.getValue());
        }
    }
}
