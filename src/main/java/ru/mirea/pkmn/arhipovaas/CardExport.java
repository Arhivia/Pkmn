package ru.mirea.pkmn.arhipovaas;

import ru.mirea.pkmn.Card;

import java.io.*;

public class CardExport {
    private Card c = new Card();

    public CardExport(Card c) {
        this.c = c;
    }

    public void exportToCrd() {
        File myFile = new File(c.getName() + ".crd");
        try (FileOutputStream fileOutputStream = new FileOutputStream(myFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(c);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
