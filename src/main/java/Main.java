import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //       System.out.println("Hello, world!");
        //       SometutUdaljaemTekstFunctions functions = new SometutUdaljaemTekstFunctions();     // vivodit na konsolj Hello i imja iz klassa Main
        //       String text = functions.getWelcomeText("Valera");  // imja Valera
        //       System.out.println(text);                          // rezuljtat  SomeFunctions functions + getWelcomeText

        String text = "Laikraksts, atsaucoties uz anonīmām amatpersonām, apgalvoja, ka Tramps par atlīdzību, kas tiekot maksāta par amerikāņu karavīru nogalināšanu, esot ticis informēts vēl martā.\n" +
                "\n" +
                "Avīze norādījusi, ka talibi naudu esot saņēmuši, taču nav skaidrs, vai pastāv aizdomas par kādas konkrētas ASV militārpersonas nāvi Afganistānā, kuras nogalināšana būtu saistīta ar šo lietu.";

        String[] words = text.split(" ");
        System.out.println("Words count is " + words.length);
        //       System.out.println(words[4]);

        for (int i = 0; i < words.length; i = i + 2) {
            System.out.println("The word with id" + i + " is " + words[i]); // Nachinaetjsa s 0 slovo, rabota so vsem textom, s hagom cherez odno slovo
        }

        for (String word : words) {
            System.out.println(word);  // kazhdoe novoe slovo otobrazhaetjsa s novoj stroki, v tom chisle znaki -. , !
        }

        List<String> names = new ArrayList<String>();
        names.add("Valerijs");
        names.add("Kostik the best");
        names.add("Maxik");
        names.add("uPsa - eto aspirin");

        System.out.println(names.get(1)); //budet Kostik the best   porjadkovoja nomeracija 0 1 2 3

        for (String name : names) {
            System.out.println(name); // budet otobrazhatjsaja to chto v skobkah (Valerijs, Kostik the best, Maxik, uPsa - eto aspirin
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<String, Integer>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey()); // otvet the student is
        }
    }
}

//TreeMap - сама сортирует значения по заданному критерию. TreeMap используется либо с Comparable элементами,
// либо в связке с Comparator. Смотрите статью "Интерфейсы Comparable и Comparator".
/* 1. put(K key, V value) - добавляет элемент в карту;

2. get(Object key) - ищет значение по его ключу;

3. remove(Object key) - удаляет значение по его ключу;

4. containsKey(Object key) - спрашивает, есть ли в карте заданный ключ;

5. containsValue(Object value) - спрашивает есть ли в карте заданное значение;

6. size() - возвращает размер карты (количество пар "ключ-значение").*/



