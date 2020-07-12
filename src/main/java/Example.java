import java.sql.Array;
import java.util.Arrays;
import java.util.*;

public class Example {
    public static void main(String[] args) {

        String text = "Laikraksts, Laikraksts, Laikraksts, atsaucoties uz anonīmām amatpersonām, apgalvoja, ka Tramps par atlīdzību, kas tiekot maksāta par amerikāņu karavīru nogalināšanu, esot ticis informēts vēl martā.\n" +
                "\n" +
                "Avīze norādījusi, ka talibi naudu esot saņēmuši, taču nav skaidrs, vai pastāv aizdomas par kādas konkrētas ASV militārpersonas nāvi Afganistānā, kuras nogalināšana būtu saistīta ar šo lietu.";

        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        System.out.println(text);

    }
}
 //text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
//       System.out.println(text);