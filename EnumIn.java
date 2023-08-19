/*Java Enumeration is a class type although we don't need to instantiate using new keyword 
 * 
 * Basically enum is a static and final so we can access it by using enum name 
 * (eg: InsideColor.INRED)
 * Since it is final we can't create child enums
 * We can declare the main method inside the enum
 * 
 * Enum and inheritance:
 *-------------------------
 All enums implicitly extends the java.lang.Enum class, As a class can only extend one parent in java, an enum cannot extend anything else
*/
public class EnumIn {
    //We can declare it inside the class
    Day day;
    public EnumIn(Day day){this.day=day;}

    public void dayIsLike(){
        switch (day) {
            case MONDAY:
                System.out.println("It's monday");
                break;
            case FRIDAY:
            System.out.println("It's friday");
            break;
            case SATURDAY:
            System.out.println("It's saturday");
            break;
            default:
            System.out.println("Midweek days are so-so");
                break;
        }
    }

    enum InsideColor{
        //below are individual objects of class InsideColor
        INRED,INBLUE,INBLACK;
    }
    public static void main(String[] args) {
        Color c1=Color.RED;
        InsideColor c2=InsideColor.INRED;
        System.out.println(c1+"\n"+c2);

        EnumIn em=new EnumIn(Day.valueOf("MONDAY"));
        em.dayIsLike();
    }
}
//Every enum is internally implemented by using Class
enum Color{
    RED,BLUE,BLACK;
}
enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
