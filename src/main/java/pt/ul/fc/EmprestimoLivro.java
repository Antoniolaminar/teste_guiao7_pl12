package pt.ul.fc;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

/** Emprestar um livro da biblioteca. */
@StateSet({"disponivel", "requisitado", "atrasado", "perdido"})
public class EmprestimoLivro {

    @StateRefinement(to="disponivel()")
    public EmprestimoLivro() {}

    /** Devolve o livro à biblioteca. */
    @StateRefinement(from="true", to="true")
    public void devolver() {}

    /** Marca o empréstimo como atrasado. */
    @StateRefinement(from="true", to="true")
    public void marcarAtraso() {}

    /** Renova o empréstimo (o livro continua requisitado). */
    @StateRefinement(from="true", to="true")
    public void renovar() {}

    /** Dá o livro como perdido (definitivo). */
    @StateRefinement(from="true", to="true")
    public void declararPerdido() {}

    /** Requisita o livro. */
    @StateRefinement(from="disponivel()", to="requisitado()")
    public void requisitar() {}
}
