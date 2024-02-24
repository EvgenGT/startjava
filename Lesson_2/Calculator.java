public class Calculator {

    // в данном классе описывается логика вычислений
    // Переменные

    private int numberOne;
    private char sign;
    private int numberTwo;

     public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void calculation() {
        switch(sign) {
            case '+' :
                System.out.println(numberOne + numberTwo);
                break;
            case '-' :
                System.out.println(numberOne - numberTwo);
                break;
            case '*' :
                System.out.println(numberOne * numberTwo);
                break;
            case '/' :
                System.out.println(numberOne / numberTwo);
                break;
            case '%' :
                System.out.println(numberOne % numberTwo);
                break;
            case '^' :
                int result = 1;
                for (int i = 0; i < numberTwo; i++) {
                    result = result * numberOne;
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}




