package pt.ul.fc;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

/** Cozinhar comida congelada. */
@StateSet({"congelada", "descongelada", "aCozinhar", "cozinhada", "desperdicada"})
public class RefeicaoCongelada {

    @StateRefinement(to="congelada()")
    public RefeicaoCongelada() {}

    /** Volta a congelar a refeição (só se ainda não começou a ser cozinhada). */
    @StateRefinement(from="true", to="true")
    public void voltarACongelar() {}

    /** Põe a refeição a cozinhar. */
    @StateRefinement(from="true", to="true")
    public void iniciarCozedura() {}

    /** Deita a refeição fora. */
    @StateRefinement(from="true", to="true")
    public void deitarFora() {}

    /** Termina a cozedura. */
    @StateRefinement(from="true", to="true")
    public void terminarCozedura() {}

    /** Descongela a refeição. */
    @StateRefinement(from="congelada()", to="descongelada()")
    public void descongelar() {}
}
