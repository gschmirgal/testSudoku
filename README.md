# SudokuSolver

Ce projet Java propose une solution simple et efficace pour résoudre des grilles de Sudoku 9x9 à l'aide de l'algorithme de backtracking.

## Fonctionnalités
- Résolution automatique de grilles de Sudoku (9x9)
- Affichage lisible de la grille dans le terminal
- Code commenté et documenté (Javadoc)

## Structure du projet
- `sudokuSolver/SudokuSolver.java` : Classe principale contenant l'algorithme de résolution
- `sudokuSolver/SudokuSolverTerminal.java` : Affichage de la grille dans le terminal
- `launch.java` : Point d'entrée du programme, exemple d'utilisation

## Utilisation
1. **Compilation**
   ```sh
   javac sudokuSolver/*.java launch.java
   ```
2. **Exécution**
   ```sh
   java Launch
   ```

## Exemple de sortie
```
Grille initiale :
4 . . | . 9 3 | . . 8 
. . 9 | . 6 . | . . . 
. . . | 8 . 2 | . . 4 
------+-------+------
7 . 2 | . . 1 | . . . 
. 3 6 | 4 . 9 | 7 8 . 
. . . | 3 . . | 1 . 2 
------+-------+------
8 . . | 1 . 5 | . . .
. . . | . 4 . | 8 . .
5 . . | 2 3 . | . . 7

Grille résolue :
4 2 1 | 5 9 3 | 6 7 8
3 8 9 | 7 6 4 | 5 2 1
6 7 5 | 8 1 2 | 3 9 4
------+-------+------
7 5 2 | 6 8 1 | 4 3 9
1 3 6 | 4 2 9 | 7 8 5
9 4 8 | 3 5 7 | 1 6 2
------+-------+------
8 9 3 | 1 7 5 | 2 4 6
2 1 7 | 9 4 6 | 8 5 3
5 6 4 | 2 3 8 | 9 1 7
```

## Personnalisation
Pour tester une autre grille, modifiez simplement le tableau `grid` dans `launch.java`.

## Auteur
- Projet réalisé par SCHMIRGAL Guillaume

## Licence
Ce projet est open-source et libre d'utilisation.
