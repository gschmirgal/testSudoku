package sudokuSolver;
/**
 * Classe SudokuSolver
 * Fournit les méthodes de base pour résoudre une grille de Sudoku.
 */
public class SudokuSolver {

    /**
     * Taille de la grille de Sudoku (9x9).
     */
    static final int SIZE = 9;
    
    /**
     * Grille de Sudoku à résoudre.
     */
    protected int[][] grid;

    /**
     * Constructeur par défaut.
     */
    public SudokuSolver() {
    }

    /**
     * Constructeur avec une grille initiale.
     * @param grid Grille de Sudoku à résoudre
     */
    public SudokuSolver(int[][] grid) {
        this.grid = grid;
    }

    /**
     * Définit la grille de Sudoku à résoudre.
     * @param grid Grille de Sudoku
     */
    public void setgrid(int[][] grid) {
        this.grid = grid;
    }

    /**
     * Résout récursivement la grille de Sudoku en utilisant le backtracking.
     * @return true si la grille est résolue, false sinon
     */
    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Si la case est vide
                if (this.grid[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        // Vérifie si le chiffre peut être placé
                        if (this.isValid(row, col, num)) {
                            this.grid[row][col] = num;

                            if (solve()) 
                                return true;

                            this.grid[row][col] = 0; // backtrack
                        }
                    }
                    return false; // aucun chiffre valide à cette position
                }
            }
        }
        return true; // plus de cases vides
    }

    /**
     * Vérifie si un chiffre peut être placé à une position donnée.
     * @param row Ligne de la case
     * @param col Colonne de la case
     * @param num Chiffre à placer
     * @return true si le chiffre peut être placé, false sinon
     */
    private boolean isValid(int row, int col, int num) {
        // Vérifie la ligne
        for (int x = 0; x < SIZE; x++) {
            if (this.grid[row][x] == num) 
                return false;
        }

        // Vérifie la colonne
        for (int x = 0; x < SIZE; x++) {
            if (this.grid[x][col] == num) 
                return false;
        }

        // Vérifie le carré 3x3
        int startRow = row - (row % 3);
        int startCol = col - (col % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.grid[i + startRow][j + startCol] == num) 
                    return false;
            }
        }

        return true;
    }
}