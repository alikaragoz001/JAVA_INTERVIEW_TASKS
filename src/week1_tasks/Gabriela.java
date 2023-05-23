package week1_tasks;

public class Gabriela {
    //task1:
    public static String oddOrEven(int number) {
        if (number % 2 == 0) {
            return number + " is Even";
        } else if (number % 2 != 0) {
            return number + " is Odd";
        } else {
            return number + " Invalid Number";
        }
    }


    //task2
    //                                          10   ,         2
    public static void dividingWithoutOperator(int num1, int num2) {
        int finalRes = 0;

        while (num1 >= num2) {
            //     10 - 2
            num1 = num1 - num2;
            finalRes++;
        }

        System.out.println("Result: "+finalRes);
        System.out.println("Remainder: "+num1);
    }

    //task3
    public static void finra(){
     for(int i =1; i<=30;i++){
         if(i%3==0 && i%5==0){
             System.out.println("FINRA");
         }else if(i%3==0){
             System.out.println("FIN");
         }else if(i%5==0){
             System.out.println("RA");
         }else{
             System.out.println(i);
         }
     }
    }


    public static void main(String[] args) {
        //task1:
        System.out.println(oddOrEven(7));
        //task2
        dividingWithoutOperator(100,2);
        //task3
        finra();

    }

}
