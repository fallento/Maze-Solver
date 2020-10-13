public class Square {


    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;
    public static final int WORKLIST = 4;
    public static final int EXPLORED = 5;
    public static final int FINALPATH = 6;

    private int type;
    private int finalType;
    private Square squarePrevious;
    private int row; private int col;

    public Square(int typeInt, int Row, int Column){
        row = Row;
        col = Column;
        type = typeInt;
        finalType = typeInt;
        squarePrevious = null;
    }

    public String toString(){
            if(type == SPACE)
                return "_";
            else if(type == WALL)
                return "#";
            else if(type == START)
                return "S";
            else
                return "E";
    }
    
    public char getStatus(){
            if (type == WORKLIST)
                return 'o';
            else if(type == EXPLORED)
                return '.';
            else 
                return 'x';

        }
        


    public int getType(){
        return type;
    }

    public void typeSet(int newType){
        type = newType;
    }

    public void resetType(){
        type = finalType;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public boolean isMarked(){
        if (type == 4 || type == 5 || type == WALL){
            return true;
        } else{
            return false;
        }
    }

    public void setSquarePrevious(Square sq){
        squarePrevious = sq;
    }

    public Square getSquarePrevious(){

        return squarePrevious;
    }

}