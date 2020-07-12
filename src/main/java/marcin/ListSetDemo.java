package marcin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDemo {
    public static void main(String[] args) {
        List <String> listastringow= new ArrayList<String>();
        listastringow.add("");
        listastringow.add("ala ma kota");
        listastringow.add("ala ma kota");
        for(int i=0; i<listastringow.size();i++){
            System.out.println(listastringow.get(i));
        }
        System.out.println("------------------------------");
        Set<String> setstringow= new HashSet<String>();
        setstringow.add("");
        setstringow.add("ala ma kota");
        setstringow.add("ala ma kota");
        for(String s: setstringow){
            System.out.println(s);
        }
    }
}
