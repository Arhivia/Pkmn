package ru.mirea.pkmn;

public class PkmnApplication {
    public static void main(String[] args) {
        CardImport cdimp = new CardImport("./src/main/resources/my_card.txt");
        Card card = cdimp.importFromTxt();
        System.out.println("My pokemon card:");
        System.out.println(card);

        CardExport cdexp = new CardExport(card);
        cdexp.exportToCrd();

        System.out.println("\n\nAnother person's pokemon card:");
        System.out.println(cdimp.importFromCrd("Azumarill.crd"));
    }
}