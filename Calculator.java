import java.util.*;

public class Calculator
{
    Scanner sc = new Scanner(System.in);

    int firstInputValue, secondInputValue;

    private int getInputValue()
    {
        while(true)
        {
            System.out.print("Podaj wartość: ");
            if(sc.hasNextInt())
            {
                return Integer.parseInt(sc.nextLine());
            }
            else
            {
                System.out.println("Niepoprawna wartość!");
                sc.nextLine();
            }
        }
    }

    public void setInputValues()
    {
        firstInputValue = getInputValue();
        secondInputValue = getInputValue();
    }

    // All basic operations
    private int add(final int a, final int b)
    {
        return a + b;
    }
    private int subtract(final int a, final int b)
    {
        return a - b;
    }
    private int multiply(final int a, final int b)
    {
        return a * b;
    }
    private int divide(final int a, final int b)
    {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero!");
            }
        }catch(ArithmeticException e)
        {
            System.out.println("Nie można dzielić przez zero!");
        }
        return a / b;
    }

    public void doOperation()
    {
        boolean noOperation = true;
        while(noOperation)
        {
            System.out.print("Wybierz działanie: \n[+] Dodawanie\n[-] Odejmowanie\n[*] Mnożenie \n[/] Dzielenie\n");

            noOperation = false;
            switch(sc.nextLine())
            {
                case "+":
                    System.out.println(firstInputValue + " + " + secondInputValue + " = " + add(firstInputValue, secondInputValue));
                    break;
                case "-":
                    System.out.println(firstInputValue + " - " + secondInputValue + " = " + subtract(firstInputValue, secondInputValue));
                    break;
                case "*":
                    System.out.println(firstInputValue + " * " + secondInputValue + " = " + multiply(firstInputValue, secondInputValue));
                    break;
                case "/":
                    System.out.println(firstInputValue + " / " + secondInputValue + " = " + divide(firstInputValue, secondInputValue));
                    break;
                default:
                    System.out.println("Niepoprawne działanie. Spróbuj jeszcze raz");
                    noOperation = true;
            }
        }
    }
}
