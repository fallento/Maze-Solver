import java.util.*;
import java.io.*;
public class MazeTester{
   public static void main(String[] args){
      Maze maze = new Maze();
      Square s = new Square(0,0,0);
      if(maze.loadMaze("Maze_File")){
         System.out.println(maze.getStart());
         System.out.println(maze.getExit());
         
      }
   }
}