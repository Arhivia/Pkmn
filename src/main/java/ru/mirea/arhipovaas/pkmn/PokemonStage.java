package ru.mirea.arhipovaas.pkmn;

public enum PokemonStage {
    BASIC,
    STAGE1,
    STAGE2,
    VSTAR,
    VMAX;

    PokemonStage() {
    }

    @Override
    public String toString() {
        return "PokemonStage{" + name() + '}';
    }
}