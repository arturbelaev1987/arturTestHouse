import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //       System.out.println("Hello, world!");
        //       SomeFunctions functions = new SomeFunctions();     // vivodit na konsolj Hello i imja iz klassa Main
        //       String text = functions.getWelcomeText("Valera");  // imja Valera
        //       System.out.println(text);                          // rezuljtat  SomeFunctions functions + getWelcomeText

        String text = "Laikraksts, atsaucoties uz anonīmām amatpersonām, apgalvoja, ka Tramps par atlīdzību, kas tiekot maksāta par amerikāņu karavīru nogalināšanu, esot ticis informēts vēl martā.\n" +
                "\n" +
                "Avīze norādījusi, ka talibi naudu esot saņēmuši, taču nav skaidrs, vai pastāv aizdomas par kādas konkrētas ASV militārpersonas nāvi Afganistānā, kuras nogalināšana būtu saistīta ar šo lietu.";

        String[] words = text.split(" ");
        System.out.println("Words count is " + words.length);
        //       System.out.println(words[4]);

        for (int i = 0; i < words.length; i = i + 2) {
            System.out.println("The word with id" + i + " is " + words[i]);
        }

        for (String word : words) {
            System.out.println(word);
        }

        List<String> names = new ArrayList<String>();
        names.add("Valerijs");
        names.add("Kostik the best");
        names.add("Maxik");
        names.add("uPsa - eto aspirin");

        System.out.println(names.get(1)); //budet Kostik the best

        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<String, Integer>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}



