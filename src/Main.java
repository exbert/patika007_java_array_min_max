public class Main {
    public static void main(String[] args) {

        int[] list = {52, 7, 15, 84, -43, 91, 0, 1};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
                // System.out.println("Temp min is : " + min);
            }
            if (i > max) {
                max = i;
                // System.out.println("Temp max is : " + max);
            }
        }

        System.out.println("Min value of list is : " + min);
        System.out.println("Max value of list is : " + max);
    }
}
