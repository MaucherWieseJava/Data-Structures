import java.util.NoSuchElementException;

/** Author
 * @Adrian_Stötzler, 12.01.2024
 *
 */






public abstract class SimpleList implements ListIF {
            private SimpleListNode head = null;

            public SimpleList(){
                head = new SimpleListNode(null, null);

            }
            @Override
            public void addFirst(Object obj){
                SimpleListNode n = new SimpleListNode(obj, head.getNext());
                head.setNext(n);

            }
            @Override
            public void addLast(Object obj){
                SimpleListNode m = head;
                while (m.getNext() != null){
                    m = m.getNext();

                }
                //Neuen Node erstellen der auf die Null zeigt
                SimpleListNode n = new SimpleListNode(obj, null);
                m.setNext(n);


            }

            //TODO void Insert method

            @Override
            public Object getFirst() throws NoSuchElementException{
                if(isEmpty()){
                    throw new NoSuchElementException();

                }else {
                    SimpleListNode ersterKnoten = head.getNext();
                    return ersterKnoten.getElement();
                    //Get Element muss noch implementiert werden
                }




            }
            @Override
            public Object getLast() throws NoSuchElementException {
                if(isEmpty()){
                    throw new NoSuchElementException();

                }
                SimpleListNode m = head;
                while(m.getNext().getNext() != null){
                    //Wenn ein übernächster Eintrag existiert, bewege ich mich um eins nach vorne
                    m = m.getNext();

                }
                return m.getElement();



            }


            @Override
            public Object removeFirst() throws NoSuchElementException {
                if(isEmpty()){
                    throw new NoSuchElementException();

                }
                SimpleListNode ersterKnoten = head.getNext();
                head.setNext(ersterKnoten.getNext());
                return ersterKnoten.getElement();

            }



            @Override
            public Object removeLast() throws NoSuchElementException {
                if(isEmpty()){
                    throw new NoSuchElementException();


                }
                SimpleListNode m = head;
                while(m.getNext().getNext() != null){
                    //Wenn ein übernächster Knoten existiert bewege ich mich eins nach vorne
                    m = m.getNext();

                }
                //Dieser Eintrag wird als Objekt abgespeichert bevor er aus der Liste gelöscht wird
                Object obj = m.getNext().getElement();
                m.setNext(null);
                return obj;


            }


            public int size() {
                int counter = 0;
                SimpleListNode m = head;
                while(m.getNext() != null){
                    m = m.getNext();
                    counter++;

                }
                return counter;

            }


            //Methode des typs Boolean (Wahr/Falsch)
            public boolean isEmpty() {
                return head.getNext() == null;

            }





            //TODO Insert
            //Insert eines Elementes an einer beliebigen Stell
            @Override
            public void insert(int index, Object obj){
                if(index < 0 || index > size()) {
                    throw new NoSuchElementException();

                }
                SimpleListNode neuerKnoten = new SimpleListNode(obj, null);

                //Spezialfall einfügen am Anfang der Liste, eig deckt addFirst dies schon :)

                if(index == 0){
                    neuerKnoten.setNext(head.getNext());
                    head.setNext(neuerKnoten);
                    return;

                }
                //Einfügen an einer beliebigen Stelle
                SimpleListNode current = head;
                //Wertebereich der Liste
                for(int i = 0; i < index; i++) {
                    current = current.getNext();


                }
                neuerKnoten.setNext(current.getNext());
                current.setNext(neuerKnoten);



            }





            //TODO Get
            //Beliebiges Element ausgeben
            public Object get(int index) throws IndexOutOfBoundsException {
                if(index < 0 || index >= size()) {
                    throw new IndexOutOfBoundsException("Fehler :(");

                }
                SimpleListNode current = head.getNext();
                for(int i = 0; i < index; i++) {
                    current = current.getNext();

                }
                return current.getElement();


            }




            //TODO Iterator
            /**
            public IteratorIF iterator() {
                return new SimpleListIterator();

            }
            */
            class SimpleListIterator implements IteratorIF {
                private SimpleListNode node;
                public SimpleListIterator() {
                    node = head.getNext();

                }
                public boolean hasNext(){
                    return node != null;

                }
                public Object next() throws NoSuchElementException {
                    if(node == null) {
                        throw new NoSuchElementException();


                    }
                    Object obj = node.getElement();
                    return obj;

                }

            }





}

