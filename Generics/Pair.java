package Generics;
/*Generics Interface */
public interface Pair<T,U>{
    T getFirst();
    U getSecond();
    void setFirst(T first);
    void setSecond(U second);
}
class GenericTwoPair<T,U> implements Pair<T,U>{
    private T first;
    private U second;
    
    @Override
    public T getFirst(){
        return first;
    }

    @Override
    public U getSecond(){
        return second;
    }

    @Override
    public void setFirst(T first){
        this.first=first;
    }

    @Override
    public void setSecond(U second){
        this.second=second;
    }
    GenericTwoPair(T first,U second){
        this.first=first;
        this.second=second;
    }
}
