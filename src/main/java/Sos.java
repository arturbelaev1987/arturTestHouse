import java.util.*;

public class Sos {

    String text = "the the I I as sos";
    String[] words = text.split(" ");
    //Generic function to remove duplicates in list and maintain order
    private static <E> List<E> removeDuplicate(List<E> list) {
        Set<E> array = new LinkedHashSet<E>();
        array.addAll(list);
        return  new ArrayList<E>(array);
        // return new ArrayList<>(array);

    }
    public static void main(String[] args) {
        //Print [2, 3, 5, 4]
        System.out.println(removeDuplicate(Arrays.asList(2,2,3,5, 3, 4)));
        //Print [AB, BC, CD]
        System.out.println(removeDuplicate(Arrays.asList("AB","BC","CD","AB")));
    }
}
