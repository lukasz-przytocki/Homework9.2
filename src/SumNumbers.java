public class SumNumbers {

    public static int sumNumbers(int number){
        int sum = 0;
        String numberString = Integer.toString(number);

        for (int i = 0; i <numberString.length() ; i++) {
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
