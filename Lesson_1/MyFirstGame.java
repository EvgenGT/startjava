public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 5;
        int humanNumber = 4;
        int min = 1;
        int max = 100;

        while (min <= max) {

            if (humanNumber == computerNumber) {
                System.out.println("Вы победили!");
                    break;
            } else if (humanNumber < computerNumber) {
                System.out.println("Число " +  humanNumber + " меньше того, что загадал компьютер");
                    break;
            } else {
                System.out.println("Число " +  humanNumber + " больше того, что загадал компьютер"); 
                    break;
            }
        }
    }
}
