package Donuts;

public abstract class Donut {
    private DonutsType type;

    public Donut(DonutsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "type=" + type +
                '}';
    }
}
