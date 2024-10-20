package ru.mirea.pkmn;

public enum EnergyType {
    FIRE,
    GRASS,
    WATER,
    LIGHTNING,
    PSYCHIC,
    FIGHTING,
    DARKNESS,
    METAL,
    FAIRY,
    DRAGON,
    COLORLESS;

    EnergyType() {
    }

    @Override
    public String toString() {
        return "EnergyType{" + name() + '}';
    }
}