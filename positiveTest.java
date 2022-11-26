import java.util.Scanner;
public class positiveTest  {
   
    public static void main(String[] args) throws CustomException {
        Scanner input = new Scanner(System.in);
        int  a = 0 ;
        int sum =0 ;

        while (a<5){
            System.out.println("Enter a number ");
            int x = input.nextInt();
            if(x<0){
                try {

                   throw new CustomException();
                }
                catch (CustomException ex){
                    System.out.println();
                }
            }
            else
            {
                
                if(x%2==0){
                    sum++;
                }
                a++ ;
            }
        }

        System.out.println("The total even numbers is = "+sum);
    }
    public static class CustomException extends Exception{
        public CustomException(){
            System.out.println("Input Positive Integer Only");
        }
    }
    
}
