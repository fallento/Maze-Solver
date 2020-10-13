import java.util.*;

public class MyStack implements StackADT{
    public ArrayList<Square> x;

    public int size(){
        return x.size();
    }

    public MyStack(){
        x = new ArrayList<Square>();
    }

    public void push(Square element){
        x.add( element);
    }

    public Square pop(){
        try{
            if(x.size()!=0){
                Square z = x.remove(x.size() - 1);
                return z;
            }else{
                throw new NoSuchElementException();
            }
        } catch(NoSuchElementException e){
            System.out.println("You tried to remove an element, but the stack is empty");
        }
        return null;
    }
        public Square peek(){
        if (x.size()!=0){
            Square toReturn = x.get(x.size()-1);
            return toReturn;
        }else {
            throw new NoSuchElementException();
        }
    }



    public boolean isEmpty(){
        return x.size() == 0;
    }

    public void clear(){
        x.clear();
    }

}