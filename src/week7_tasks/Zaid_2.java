package week7_tasks;
/*
Write a return method that can sort an int array in Ascending order without
using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
public class Zaid_2 {
    public static void main(String[] args) {
        int[] num = {10, 9, 8, 7};
        num = sortedNumbers(num);

        for (int each : num) {
            System.out.print(each + " ");
        }
// find the small number of the array and use list to add the ArrayList, and then take from the array and add to the other array
    }
    public static int[] sortedNumbers(int[] numbers){
        int sorted = numbers.length;

        // this is known as the bubbleSort
        for (int i = 0; i < sorted - 1; i++) {
            for (int j = 0; j < sorted - i - 1; j++) {
                if (numbers[j] > numbers[j + 1] ){
                    int n = numbers[ j + 1];
                    numbers[j + 1] = n;
                }
            }

        }
    return numbers;

    }
}
