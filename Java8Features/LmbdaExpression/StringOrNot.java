package Java8Features.LmbdaExpression;

@FunctionalInterface
interface Check{
    boolean string(String str);
}
public class StringOrNot {
    public static void main(String[] args) {
        Check ck=(String s)->(s!=null)&&(!s.equals(""))&&(s.chars().allMatch(Character::isLetter));
        System.out.println(ck.string("Sanjay"));
    }
}
