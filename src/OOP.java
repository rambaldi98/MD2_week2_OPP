
import java.util.Date;
import java.util.Objects;

public class OOP {
    public static void main(String[] args) {
        Fan opp = new Fan();
        opp.setOn(true);
        opp.setSpeed(6);
        System.out.println(opp.toString());


    }

}
// hcn
class Rectangle {
    double width, height;

    public void Rectangle() {
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void displayRect() {
        System.out.println("width= " + this.width + ", height= " + this.height);
    }
}
// ptb2
class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0)
            return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        return 0;
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0)
            return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        return 0;
    }
}















// stop wtach

class StopWatch extends Date {
    private final int startTime;
    private int endTime;

    public StopWatch() {
        this.startTime = super.getSeconds();
    }

    public int start() {

        return super.getSeconds();
    }


    public void stop(int secondStop) {
        this.endTime = secondStop;
    }

    public int getElapsedTime() {
        if (this.endTime < this.startTime)
            return 60 + this.endTime - this.startTime;
        return this.endTime - this.endTime;
    }
}


class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //

    @Override
    public String toString(){
        if(this.on)
            return "speed: "+ Objects.toString(this.speed)+", color: "+this.color+", radius:" +Objects.toString(this.radius)+", fan is on";
        else
            return "color: "+this.color+", radius:" +Objects.toString(this.radius)+", fan is off";
    }
}
//class A {
//    static public class B {
//    }
//
//    public class C {
//    }
//}