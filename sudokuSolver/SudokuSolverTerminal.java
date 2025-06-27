package sudokuSolver;
/**
 * Classe SudokuSolverTerminal
 * Hérite de SudokuSolver et ajoute des fonctionnalités d'affichage pour le terminal.
 */
public class SudokuSolverTerminal extends SudokuSolver{

    /**
     * Constructeur par défaut.
     */
    public SudokuSolverTerminal() {
        super();
    }

    /**
     * Constructeur avec une grille initiale.
     * @param grid Grille de Sudoku à résoudre
     */
    public SudokuSolverTerminal(int[][] grid) {
        super(grid);
    }

    /**
     * Affiche la grille de Sudoku dans le terminal de façon lisible.
     * Les cases vides sont représentées par un point.
     * @param grid Grille de Sudoku à afficher
     */
    public void printGrid() {
        for (int i = 0; i < SudokuSolver.SIZE; i++) {
            // Affiche une ligne de séparation tous les 3 blocs
            if (i % 3 == 0 && i != 0) System.out.println("------+-------+------");
            for (int j = 0; j < SudokuSolver.SIZE; j++) {
                // Affiche un séparateur vertical tous les 3 blocs
                if (j % 3 == 0 && j != 0) System.out.print("| ");
                // Affiche un point pour les cases vides, sinon la valeur
                System.out.print((super.grid[i][j] == 0 ? "." : super.grid[i][j]) + " ");
            }
            System.out.println();
        }
    }
}