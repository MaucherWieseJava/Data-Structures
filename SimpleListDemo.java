

/**

public class SimpleListDemo {
    public static void main(String[] args) {
        ListIF liste = new SimpleList();
        liste.addFirst("Zwei");
        liste.addFirst("Eins");
        liste.addLast("Drei");
        liste.addLast("Vier");

        IteratorIF iterator = liste.iterator();
        while (iterator.hasNext()) {
            Object nutzdaten = iterator.next();
            System.out.println(nutzdaten);
        }

        System.out.println("Elemente in der Liste: " + liste.size());
    }
}


*/
