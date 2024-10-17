package ru.mirea.arhipovaas.pkmn;

import java.util.*;

public class PkmnApplication {
    public static void main(String[] args) {
        CardImport cdimp = new CardImport("./src/main/resources/my_card.txt");
        Card card = cdimp.imprt();
        System.out.println(card);
    }
}