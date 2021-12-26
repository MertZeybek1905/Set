import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("java");
        set1.add("c#");
        set1.add("python");
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("***************");
        Set<String> set2= new LinkedHashSet<String>();
        set2.add("java");
        set2.add("c#");
        set2.add("python");
        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("*********");
        Set<String> set3= new TreeSet<String>();
        set3.add("ali");
        set3.add("ahmet");
        set3.add("aslı");
        for (String s : set3) {
            System.out.println(s);
        }
    }
}