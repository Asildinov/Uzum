//
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean already = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    already = true;
                    break;
                }
            }
            if (!already) {
                temp[index] = arr[i];
                index++;
            }
        }

        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

