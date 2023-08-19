package Generics;
/*
 * Generics is a feature in java that allows us to create classes, interfaces and methods
 * that can work with different types in a type-safe manner.
 * 
 * It provides a way to parameterize types
 * 
 * 
 * 
 */
/*Generic class*/
class Box<T>{
    private T content;
    public Box(T content){
        this.content=content;
    }
    public T getContenet(){
        return content;
    }
}
/*Generic method*/
class GenMeth{
    public static <T>void printArray(T[]array){
        for(T item:array){
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
public class GenericsIn {
    public static void main(String[] args) {
        Box<String>bx=new Box<>("Sanjay");
        Box<Integer>bx2=new Box<>(22);
        Box<Float>bx3=new Box<>(12000.0f);
        System.out.println("Name: "+bx.getContenet()+"\n"+"Age: "+bx2.getContenet()+"\n"+"Salary: "+bx3.getContenet()+"\n");
        System.out.println("Arrays of String and Integer using Generic methods: ");
        Integer[]intArr={1,2,3,4,5};
        String[]stringArr={"'One'","'Two'","'Three'","'Four'"};
        GenMeth.printArray(intArr);
        GenMeth.printArray(stringArr);
        System.out.println("--------------------------------------------------------");
        
        System.out.println("Generics Interface\n---------------------------");
        System.out.println("String and Integer pair\n---------------------------------");
        Pair<String,Integer>pair=new GenericTwoPair<>("Sanjay", 22);
        System.out.println("First element: "+pair.getFirst());
        System.out.println("Second element: "+pair.getSecond()+"\n");
        pair.setFirst("Kavi");
        pair.setSecond(23);
        System.out.println("First element: "+pair.getFirst());
        System.out.println("Second element: "+pair.getSecond()+"\n");
        
        System.out.println("String and Character pair\n------------------------------------");
        Pair<String,Character>pair2=new GenericTwoPair<>("Sanjay", 'M');
        System.out.println("First element: "+pair2.getFirst());
        System.out.println("Second element: "+pair2.getSecond()+"\n");
        pair2.setFirst("Malware");
        pair2.setSecond('F');
        System.out.println("First element: "+pair2.getFirst());
        System.out.println("Second element: "+pair2.getSecond()+"\n");        
    }
}
