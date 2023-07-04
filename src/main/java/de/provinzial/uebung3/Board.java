package de.provinzial.uebung3;

/**
 * Spielfeld für die Darstellung der Bewegungen eines Roboters
 * @version 1.0
 * @author tlubowiecki
 */
public class Board {

    private final String[][] board;

    public Board(int size) {
        this.board = new String[size][size];
    }

    public Board(int sizeX, int sizeY) {
        this.board = new String[sizeX][sizeY];
    }

    /**
     * Positioniert den Roboter an seiner x und y Position
     * @param robot
     */
    public void setRobot(Robot robot) {
        board[robot.getY()][robot.getX()] = "@";
        print();
    }

    /**
     * Entfernt die alte Position des Roboters vom Spielfeld
     * @param robot
     */
    public void clear(Robot robot) {
        board[robot.getY()][robot.getX()] = null;
    }

    /**
     * Schreibt den aktuellen Zustand des Spielfelds in die Konsole
     */
    private void print() {
        for(String[] row: board) {
            for(String cell: row) {
                if(cell != null && cell.equals("@")) {
                    System.out.print(cell + " ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
