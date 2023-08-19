package CollectionFrameWork.Collection.Set;
import java.util.*;
 /*Enum is a group of named constants in programming language
  *EnumSet is one of the specialized implementations of the Set interface for use with the enumeration type. 
  
  Features:
  -----------------
  It extends AbstractSet class and implents Set interface in Java.
  EnumSet class isn't synchronized.
  It's high-performance set implementation, much faster than HashSet
  
  Use 'EnumSet' when we need to work with a fixed set of enum constants and want to perform set operations efficiently*/

  //enum
enum World{
    Welcome,To,The,New,World;
}
enum World2{
    Hello,Every,One;
}
  public class EnumSetIn {
    public static void main(String[] args) {
        //creating the SenumSet
        EnumSet<World>eSet=null;
        System.out.println(eSet);
        
        /*Generating all elements from World
         * allOf(Class elementType) is used to create an enum set that will contain all of the element in the specified elementType
        */
        eSet=EnumSet.allOf(World.class);
        System.out.println("The updated set is: "+eSet+"\n");

        /*clone is used make shallow copy of the existing or this set */
        EnumSet<World>eSet2=eSet.clone();
        System.out.println("EnumSet eSet2 is Shallow copy of eSet using clone() method: "+eSet2+"\n");
        eSet2.addAll(eSet);//the output won't give repeted value bcz Set won't take the duplicate value
        System.out.println(eSet2+"\n");
        
        /*the complemetOf method returns the other than inserted element */
        EnumSet<World>eSet3=EnumSet.of(World.Welcome, World.To, World.The);
        System.out.println("The enum set eSet3 is: "+eSet3);
        EnumSet<World>eSet4=EnumSet.complementOf(eSet3);
        System.out.println("The compliment of the eSet3 is eSet4: "+eSet4);

        /*copyAll method copies the all collection of enum to the new EnumSet */
        Collection<World2>cl=new ArrayList<>();
        cl.add(World2.Hello);
        cl.add(World2.Every);
        cl.add(World2.One);
        EnumSet<World2>eSet6=EnumSet.copyOf(cl);
        System.out.println(eSet6);


    }
    
}
