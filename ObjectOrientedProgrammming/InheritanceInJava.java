package ObjectOrientedProgrammming;
/*Inheritance:
---------------
 * It is a mechanism in java by which one class is allowed to inherit the features of another class
 * A class that inherits fromanother class can reuse the method and fields of that class.
 * In addition, you can add new fields and methods to your current class as well
 *
 * Need of Inheritance in java:
 * ----------------------------
 * Code reusability
 * Method overriding
 * Abstraction
 */
class Bicycle{
    public int gear,speed;
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public Bicycle(){}
    public void applayBreak(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    @Override
    public String toString(){
        return "No of gear are\n---------------------"+"\n"+"speed of bicycle is "+speed;
    }
}
class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear,int speed,int startHeight){
        super(gear, speed);//if we inherit the parent class we must call the constructor if it is parameterized
        seatHeight=startHeight;
    }
    public MountainBike(){}
    public void setHeight(int newValue){
        seatHeight=newValue;
    }
    @Override
    public String toString(){
        return super.toString()+"\nseat height is "+seatHeight;
    }
}
public class InheritanceInJava {
    public static void main(String[] args) {
        MountainBike mk=new MountainBike(3, 100, 25);
        System.out.println(mk.toString());
        Bicycle bc=new MountainBike();
        System.out.println(bc);
        // MountainBike mk=new Bicycle();
    }
}
