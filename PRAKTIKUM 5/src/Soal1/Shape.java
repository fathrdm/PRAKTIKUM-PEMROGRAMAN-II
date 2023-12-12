package Soal1;
public abstract class Shape {
    String name;
    public Shape(String shapeName) {
        name = shapeName;
    }
    public abstract double area();
    public String toString() {
        return name;
    }
}

