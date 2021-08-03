package modernJava.code.ch02;

public class Apple {
    private Integer weight;
    private Color color;

    public Apple() {}

    public Apple(Integer weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

}
