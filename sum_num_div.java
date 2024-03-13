public class Main {
    public static void main(String[] args) {
        int[] array_values = {100, 52, 43, 99, 42, 40, 91};
        int sum = div_func(array_values);
        System.out.println("The Sum of numbers that are divisible by '5' and '2': "sum);
    }

    public static int div_func(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if ((num % 5 == 0) && (num % 2 == 0)) {
                sum =sum + num;
            }
        }
        return sum;
    }
}
