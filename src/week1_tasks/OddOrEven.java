package week1_tasks;

public class OddOrEven {

    public static void identifyOddEven(int number){

        if(number %2 == 0){
            System.out.println(number + "is even");
        }else{
            System.out.println(number + " is odd");
        }

    }

    public static void main(String[] args) {
        int number = 5;
        identifyOddEven(number);
    }
}



