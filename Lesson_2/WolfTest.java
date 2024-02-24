public class WolfTest {

    String gender;
    String nickname;
    String color;
    int weight;
    int age;

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        
        wolf.setGender("мужской");
        wolf.setNickname("Aspen"); 
        wolf.setColor("светлый");
        wolf.setWeight(50);
        wolf.setAge(15);

        System.out.println(wolf.getGender());
        System.out.println(wolf.getNickname());
        System.out.println(wolf.getColor());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
    }
}