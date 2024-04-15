public class ReversePrefixOfWord {
    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';

        int index = 0;
        for(int i=0; i<word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        StringBuilder str1 = new StringBuilder(word.substring(0, index + 1));
        StringBuilder str2 = new StringBuilder(word.substring(index + 1));

        str1.reverse();
        str1.append(str2);
        
        System.out.println(str1.toString());


    }
}