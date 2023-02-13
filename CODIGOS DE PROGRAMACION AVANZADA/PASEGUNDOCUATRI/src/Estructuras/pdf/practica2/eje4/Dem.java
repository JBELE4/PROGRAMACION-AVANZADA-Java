package Estructuras.pdf.practica2.eje4;

import java.util.Comparator;

public class Dem  implements Comparator<Lol> {

    @Override
    public int compare(Lol o1, Lol o2) {
        return -1*o1.getS().compareTo(o2.getS());
    }
}

