public class MergeStringsAlternatively {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i<word1.length() || i<word2.length()) {

            if (i<word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i<word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;

        }

        System.out.println(result.toString());






    }
}