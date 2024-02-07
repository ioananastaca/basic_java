package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Container<Integer, String> cont = new Container<>(12, "hello");
        int v1 = cont.getItem1();
        String v2 = cont.getItem2();
        Container<String, String> container = new Container<>("hello", "Ioana");
        System.out.println(container.getItem1());

        Set<String> myset1 = new HashSet<>();
        myset1.add("one");
        myset1.add("two");
        Set<String> myset2 = new HashSet<>();
        myset2.add("three");
        myset2.add("one");

        Set<String> result = union(myset1, myset2);
        Iterator<String> itr = result.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //wildcard


    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
