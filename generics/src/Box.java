/*public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}*/

/**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado
aqui com o <T> o tipo sera inferido automaticamente.
*/
public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
