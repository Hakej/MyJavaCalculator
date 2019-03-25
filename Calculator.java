import java.util.*;

public class Calculator
{
    static Scanner sc = new Scanner(System.in);

    static int var1, var2;

    public static void main(String[] args)
    {
        getNumbers();
        doOperation();
    }

    private static void getNumbers()
    {
        boolean isNumberCollected = false;

        while(!isNumberCollected)
        {
            System.out.print("Wpisz pierwszą liczbę: ");
            if(sc.hasNextInt())
            {
                var1 =  Integer.parseInt(sc.nextLine());
                isNumberCollected = true;
            }
            else
            {
                System.out.println("Niepoprawna wartość!");
                sc.nextLine();
            }
        }
        isNumberCollected = false;
        while(!isNumberCollected)
        {
            System.out.print("Wpisz drugą liczbę: ");
            if(sc.hasNextInt())
            {
                var2 =  Integer.parseInt(sc.nextLine());
                isNumberCollected = true;
            }
            else
            {
                System.out.println("Niepoprawna wartość!");
                sc.nextLine();
            }
        }
    }

    private static void doOperation()
    {
        boolean noOperation = true;
        while(noOperation)
        {
            System.out.print("Wybierz działanie: \n[+] Dodawanie\n[-] Odejmowanie\n[*] Mnożenie \n[/] Dzielenie\n");

            noOperation = false;
            switch(sc.nextLine())
            {
                case "+":
                    System.out.println(var1 + " + " + var2 + " = " + (var1 + var2));
                    break;
                case "-":
                    System.out.println(var1 + " - " + var2 + " = " + (var1 - var2));
                    break;
                case "*":
                    System.out.println(var1 + " * " + var2 + " = " + (var1 * var2));
                    break;
                case "/":
                    System.out.println(var1 + " / " + var2 + " = " + (var1 / var2));
                    break;
                default:
                    System.out.println("Niepoprawne działanie. Spróbuj jeszcze raz");
                    noOperation = true;
            }
        }
    }
}
