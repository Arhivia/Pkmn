package ru.mirea.pkmn;

public class PkmnApplication {
    public static void main(String[] args) {
        CardImport cdimp = new CardImport("./src/main/resources/my_card.txt");
        Card card = cdimp.importFromTxt();
        System.out.println(card);

        CardExport cdexp = new CardExport(card);
        cdexp.exportToCrd();

        System.out.println(cdimp.importFromCrd("Glastrier.crd"));
    }
}