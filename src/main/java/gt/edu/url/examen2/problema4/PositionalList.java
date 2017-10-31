package gt.edu.url.examen2.problema4;

public interface PositionalList<E> {
    	/**
	 * Returns PositionalList elements count
	 * @return number of elements in stack
	 */
	int size( );
        /**
	 * Returns if the PositionalList is empty
	 * @return true if is empty
	 */
	boolean isEmpty( );
        /**
	 * Returns the first positon of the PositionalList
	 * @return the element in the first position
	 */
	Position<E> first( );
         /**
	 * Returns the last positon of the PositionalList
	 * @return the element in the last position
	 */
	Position<E> last( );
	Position<E> addFirst(E e);
	Position<E> addLast(E e);
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	Position<E> after(Position<E> p) throws IllegalArgumentException;
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	E set(Position<E> p, E e) throws IllegalArgumentException;
	E remove(Position<E> p) throws IllegalArgumentException;
        //Metodo a implementar
        Position<E> positionAtIndex(int i)throws IllegalArgumentException;
        

}
