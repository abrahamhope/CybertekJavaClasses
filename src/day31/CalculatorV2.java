package day31;

public class CalculatorV2 {
    public static void calculator(char operator, int num1, int num2){
        switch (operator){
            case '+':
                System.out.println("Addition result is "+ (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result is "+ (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result is "+ (num1*num2));
                break;
            case '/':
                System.out.println("Divider result is "+ (num1/num2));
                break;
            default:
                System.out.println("Invalid Operator");
    }
    }

    public static void main(String[] args) {

        calculator('/',15,3);


        }
    }

