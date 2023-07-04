package de.provinzial.uebung3;

import java.awt.*;

public class Robot {

    private Point pos;
    private String name;

    final private Board board;

    public Robot(String name, int x, int y, Board board) {
        this.board = board;
        this.name = name;
        this.pos = new Point(x, y);
    }

    public Robot(String name, Board board) {
        this(name, 0, 0, board);
    }

    public void moveTop() {
        board.clear(this);
        pos.y--;
        board.setRobot(this);
    }

    public void moveDown() {
        board.clear(this);
        pos.y++;
        board.setRobot(this);
    }

    public void moveRight() {
        board.clear(this);
        pos.x++;
        board.setRobot(this);
    }

    public void moveLeft() {
        board.clear(this);
        pos.x--;
        board.setRobot(this);
    }

    public int getX() {
        return pos.x;
    }

    public int getY() {
        return pos.y;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "pos=" + pos +
                ", name='" + name + '\'' +
                '}';
    }
}
