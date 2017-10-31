package gt.edu.url.examen2.problema4;

public interface PositionalList<E> {

    /**
     * Returns PositionalList elements count
     * @return number of elements in stack
     */
    int size();
    
    /**
     * Returns if the PositionalList is empty
     * @return true if is empty
     */
    boolean isEmpty();
    
    /**
     * Returns the first position of the PositionalList
     * @return the element in the first position
     */
    Position<E> first();
    
    /**
     * Returns the last position of the PositionalList
     * @return the element in the last position
     */
    Position<E> last();
    
    /**
     * adds in the first position of the PositionalList
     * @return the position of the first element
     */
    Position<E> addFirst(E e);
    
    /**
     * adds in the last position of the PositionalList
     * @return the position of the last element
     */
    Position<E> addLast(E e);
    
    /**
     * Returns the node before the actual node
     * @return the position of the node before
     */
    Position<E> before(Position<E> p) throws IllegalArgumentException;
    
   /**
     * Returns the node after the actual node
     * @return the position of the node after
     */
    Position<E> after(Position<E> p) throws IllegalArgumentException;
    
    /**
     * add a new node before the indicated node
     * @return the position of the new node
     */
    Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
    
    /**
     * add a new node after the indicated node
     * @return the position of the new node
     */
    Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
    
    /**
     * Set a new element in a indicated node
     * @return the new element
     */
    E set(Position<E> p, E e) throws IllegalArgumentException;
    
    /**
     * Removes from the list the indicated node
     * @return the removed node
     */
    E remove(Position<E> p) throws IllegalArgumentException;
    
    /**
     * Returns the node in the position of the indicated node
     * @return the element of the node indicated by the index
     */
    Position<E> positionAtIndex(int i) throws IllegalArgumentException;
}
