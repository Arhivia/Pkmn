package ru.mirea.arhipovaas.pkmn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CardImport {
    private String filePath;

    public CardImport(String filePath) {
        this.filePath = filePath;
    }

    public Card imprt() {
        Card card = new Card();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setPokemonStage(PokemonStage.valueOf(line.toUpperCase()));
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setName(line);
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setHp(Integer.parseInt(line));
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setPokemonType(EnergyType.valueOf(line.toUpperCase()));
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                CardImport c = new CardImport(line);
                Card cd = c.imprt();
                card.setEvolvesFrom(cd);
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                String[] skillList = line.split(",");
                List<AttackSkill> skills = new ArrayList<>();
                for (String skill : skillList) {
                    String[] skillData = skill.split("/");
                    skills.add(new AttackSkill(skillData[1], null, skillData[0], Integer.parseInt(skillData[2])));
                }
                card.setSkills(skills);
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setWeaknessType(EnergyType.valueOf(line.toUpperCase()));
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setResistanceType(EnergyType.valueOf(line.toUpperCase()));
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setRetreatCost(line);
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setGameSet(line);
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                card.setRegulationMark(line.charAt(0));
            }

            line = br.readLine();
            if (!line.equals("-") && !line.isEmpty()) {
                String[] ownerData = line.split("/");
                card.setPokemonOwner(new Student(ownerData[1], ownerData[0], ownerData[2], ownerData[3]));
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return card;
    }
}