package week7_tasks;
/*
Write a return method that can sort an int array in descending order
without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
public class Zaid_3 {
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        arr = descendingOrder(arr);

        System.out.println(arr + " ");
        // find the biggest num and iterate
    }
    
    public static int[] descendingOrder(int[] numb){
        int ar = numb.length;

        for (int i = ar; i > 0; i--) {
            int key = numb[i];
            int j = i +1;

            while (j <= 0 && numb[j] < key ){
                numb[j - i] = numb[j];
                j++;
            }
            numb[j - 1] = key;
        }
        
        
        
        return numb;
    }
}
