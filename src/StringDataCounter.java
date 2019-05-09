import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDataCounter {
    public static void main(String[] args) {
        String text = "Notre Dame is a very old cathedral in Paris, France. It is one of France's most famous landmarks and many people visit it each year. The cathedral is on a small island on the River Seine. It is the cathedral of the Catholic Archdiocese of Paris, one of 23 archdioceses in France. The cathedral was built during two centuries. It is a very good example of Gothic Architecture in France. At the time it was finished, the cathedral was the biggest such building in Western Europe. Between 1844 and 1864, the building was renovated under the direction of Eugène Viollet-le-Duc, who incorporated elements into the design that the medieval building had not possessed before. The two rose windows which ornate the transept are among the biggest in Europe: each has a diameter of 13m.";

        System.out.println("number of words is: " + countWords(text));
        System.out.println("number of vowels is: " + countVowels(text));
        System.out.println("number of senteces is: " + countSentences(text));
        showProperNouns(text);
    }

    public static int countWords(String input) {
        String[] string = input.split("[ ]");
        int nrOfWords = string.length;
        return nrOfWords;

    }

    public static int countVowels(String input) {
        int count = 0;
        String str = input.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }

    public static int countSentences(String input) {
        String[] strArray = input.split("[.,:]");
        int numberOfSenteces = strArray.length;
        return numberOfSenteces;

    }

    public static void showProperNouns(String input) {
        String pattern = "[A-Z]\\w*";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.print(m.group(0) + " ");
        }
    }
}
