public class Jaeger {

    private String modelName;
    private String mark;
    private int weight;

    // конструктор
    public Jaeger() {
    }

    // конструктор
    public Jaeger(String modelName, String mark, int weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void move() {
        System.out.println("Робот начал передвижение");
    }

    void attack() {
        System.out.println("Робот атакует");
    }
}