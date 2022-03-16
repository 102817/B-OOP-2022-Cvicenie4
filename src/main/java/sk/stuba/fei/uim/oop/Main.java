package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pes> list = new ArrayList<>();
        list.add(new Pes("dunco"));
        list.add(new Pes("luna"));
        System.out.println(list.size());

        ArrayList<Macka> listMaciek = new ArrayList<>();
        listMaciek.add(new Macka("murko"));
        listMaciek.add(new Macka("garfield"));
        System.out.println(listMaciek.size());

        ArrayList<Zviera> listZveri = new ArrayList<>();
        listZveri.addAll(list);
        listZveri.addAll(listMaciek);
        System.out.println(listZveri.size());

        Collections.shuffle(listZveri);

        for (var i = 0; i< listZveri.size(); i++){
            listZveri.get(i).pohladkat();

        }
        for (Zviera zver : listZveri){
            zver.pohladkat();
        }

        var itetator = listZveri.iterator();
        while(itetator.hasNext()){
            var prvok = itetator.next();
            prvok.zvukZvierata();

        }

    }

}
