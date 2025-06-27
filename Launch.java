import sudokuSolver.SudokuSolverTerminal;

/**
 * Classe de lancement de l'application Sudoku.
 * Initialise une grille de Sudoku, affiche la grille initiale,
 * résout la grille et affiche le résultat dans le terminal.
 */
public class Launch {
    /**
     * Méthode principale. Point d'entrée du programme.
     * @param args Arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {

        // Définition de la grille de Sudoku à résoudre (0 = case vide)
        int[][] grid = {
            {4, 0, 0, 0, 9, 3, 0, 0, 8},
            {0, 0, 9, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 8, 0, 2, 0, 0, 4},
            {7, 0, 2, 0, 0, 1, 0, 0, 0},
            {0, 3, 6, 4, 0, 9, 7, 8, 0},
            {0, 0, 0, 3, 0, 0, 1, 0, 2},
            {8, 0, 0, 1, 0, 5, 0, 0, 0},
            {0, 0, 0, 0, 4, 0, 8, 0, 0},
            {5, 0, 0, 2, 3, 0, 0, 0, 7}
        };

        // Création d'une instance du solveur avec affichage terminal
        SudokuSolverTerminal solver = new SudokuSolverTerminal();
        solver.setgrid(grid);
        
        // Affichage de la grille initiale
        System.out.println("Grille initiale :");
        solver.printGrid();

        // Résolution et affichage du résultat
        if (solver.solve()) {
            System.out.println("\nGrille résolue :");
            solver.printGrid();
        } else {
            System.out.println("Aucune solution trouvée !");
        }
    }

}