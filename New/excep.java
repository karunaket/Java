import java.util.*;
class excep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        trynumber(number);
    }

    public static void trynumber(int number){
        try {
        checkEven(number);
        System.out.println(number+" is Even");
        } catch (IllegalArgumentException e) {
        System.out.println("error"+e.getMessage());
        }
    }
    public static void checkEven(int number){
        if(number%2!=0){
            throw new IllegalArgumentException(number+" is odd");
        }
    }
}