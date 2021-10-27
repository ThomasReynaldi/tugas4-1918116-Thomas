package com.example.tugas4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LamboData {
    private static String [] lamboName = {
            "Lamborghini Urus",
            "Lamborghini Huracan Coupe",
            "Lamborghini Huracan Spyder",
            "Lamborghini Huracan RWD Coupe",
            "Lamborghini Huracan RWD Spyder",
            "Lamborghini Huracan Performante"
    };

    private static String [] lamboHarga = {
            "Rp. 14 Miliar",
            "Rp. 9,8 Miliar",
            "Rp. 4,4 Miliar",
            "Rp. 4,1 Miliar",
            "Rp. 3,9 Miliar",
            "Rp. 3,8 Miliar"


    };

    private static int [] lamboPhoto = {
            R.drawable.urus,
            R.drawable.huracancp,
            R.drawable.huracans,
            R.drawable.rwdc,
            R.drawable.rwds,
            R.drawable.huracanp
    };

    static ArrayList<Lambo> getListData(){
        ArrayList<Lambo> list = new ArrayList<>();
        for (int position = 0; position<lamboName.length; position++){
            Lambo lambo = new Lambo();
          lambo.setName(lamboName[position]);
          lambo.setHarga(lamboHarga[position]);
          lambo.setPhoto(lamboPhoto[position]);
          list.add(lambo);

        }
        return list;
    }
}
