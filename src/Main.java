import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = 60;
        int inputNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("random number is " + randomNumber);
        Boolean isExit = false;
        do{
            System.out.print("Enter number: ");
            
            String str = sc.nextLine();
            if(confirmInputNumber(str)){
                inputNumber = Integer.parseInt(str);
                break;
            }else {
                System.out.println("Can nhap so co 2 chu so!! ");

            }
        }while(isExit==false);

        int hangChuc = randomNumber/10, donvi = randomNumber%10;
        int inputDaonguoc = (donvi)*10  + (hangChuc/10);

        //System.out.println(confirmInputNumber(inputNumber));

        if(inputNumber==randomNumber){
            System.out.println("10000$ for you!! ");
        }else if(inputNumber==inputDaonguoc){
            System.out.println("3000$ for you!! ");
        }else if(inputNumber/10==hangChuc||inputNumber%10==hangChuc||
                inputNumber/10==donvi||inputNumber%10==donvi){
            System.out.println("1000$ for you!! ");
        }else{
            System.out.println("Chuc may man lan sau! ");
        }
    }


    public static boolean confirmInputNumber(String ipn){
        
        if(ipn.matches("^[0-9]{2}$"))
            return true;
        return false;
    }
}

