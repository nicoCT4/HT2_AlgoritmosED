public interface UVGStach <T> {
    // Métodos a utilizar para las clases que sirvan como Stack
    public void push(T x); //Inserta un elemento en la parte superior del Stack
    public T pop(); //Elimna y devuelve el elemento de la parte superior del Stack
    public T top(); //Devuelve el elemento de encima sin eliminarlo
    public boolean isEmpty(); //Verifica que el Stack no esté vacío
}
