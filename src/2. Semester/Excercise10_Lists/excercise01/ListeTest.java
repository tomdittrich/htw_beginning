package excercise01;

/**
 * Created by Tom on 26.12.2016.
 */
public class ListeTest {

    public static void main(String[] args) {
        Node test = new Node(6);

        Liste liste = new Liste(10);
        liste.set(5, 0);
        liste.addFirst(20);
        liste.addFirst(0);
        liste.addLast(200);
        //0 20 5 200

        liste.add(5000, 1);

        liste.remove(200);
        System.out.println(liste.get(0));
        System.out.println(liste.get(1));
        System.out.println(liste.get(2));
        System.out.println(liste.get(3));
        //System.out.println(liste.get(4));
        //System.out.println(liste.toString());

        //System.out.println(liste.contains(4));
        //System.out.println(liste.contains(5));

    }
}
