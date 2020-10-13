import java.util.*;
public class MazeSolverStack extends MazeSolver {
    private MyStack workList;



    public void makeEmpty() {
        workList = new MyStack();
    }


    public boolean isEmpty() {
        return workList.isEmpty();
    }

    public void add(Square sq) {
        workList.push(sq);
    }

    public Square remove() {
        return workList.pop();
    }

    public Square getNext() {
        return workList.pop();
    }

    public MazeSolverStack(Maze maze){
        super(maze);
        workList = new MyStack();
        add(maze.getStart());
        //solve();
    }
}