import java.util.ArrayList;

public class MyStach<T> implements UVGStack<T>{
    private ArrayList<T> stack;

    public MyStach(){
        stack = new ArrayList<>();
    }

    @Override
    //Inserta un elemento en la parte superior del Stack
    public void push(T x){
        stack.add(x);
    }

    @Override
    //Elimna y devuelve el elemento de la parte superior del Stack
    public T pop(){
        if(!isEmpty()){
            return stack.remove(stack.size()-1);
    }
        return null;
    }

    @Override
    //Devuelve el elemento de la parte superior del Stack
    public T top(){
        if(!isEmpty()){
            return stack.get(stack.size()-1);
        }
        return null;
    }

    @Override
    //Devuelve true si el Stack esta vacio
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
