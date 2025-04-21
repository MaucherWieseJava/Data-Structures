import java.util.NoSuchElementException;


public interface ListIF {

    //Add an Element to the beginning of the list
    void addFirst(Object obj);
    //Add an Elememt to the end of the list
    void addLast(Object obj);
    //Insert an Element at the given index in the List
    void insert(int index, Object obj) throws IndexOutOfBoundsException;

    //Get the first element of the list
    Object getFirst() throws NoSuchElementException;
    //Get the last element of the list
    Object getLast() throws NoSuchElementException;
    //Remove the first element of the list
    Object removeFirst() throws NoSuchElementException;
    //Remove the last element of the list
    Object removeLast() throws NoSuchElementException;
    //Get the element at the given index
    Object get(int index) throws IndexOutOfBoundsException;



    //Get the total length of the list gives the amount of elements
    int size();

    //Check if the list is empty
    boolean isEmpty();

    //Iterator to iterate through the list for traversing
    IteratorIF iterator();





}
