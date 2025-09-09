
public class Main {
    public static void main(String[] args) {
        String str = "hello world qwerty world";
        int n = 2;

        String[] words = str.split(" ");
        int count;

        for (int i = 0; i < words.length; i++) {
            count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == n) {
                System.out.println(words[i]);
            }
        }
    }
}
