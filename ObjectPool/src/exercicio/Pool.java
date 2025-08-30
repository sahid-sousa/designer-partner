package exercicio;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
