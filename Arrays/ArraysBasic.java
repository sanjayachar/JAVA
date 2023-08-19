package Arrays;
import java.util.Arrays;

/*Arrays n java is different than c/c++ importent array features in java
 * In java arrays are dynamically allocated
 * Arrays are stored in continous memory
 * Since arrays are objects in java, so we can easily find the length using the object property length
 * Java arrays can also be declared as static feild. local feild, or a method parameter
 * The direct super class of array is Object
 * Every array type implements the interfaces called Clonable and Serializable.
 * 
 * The elements in the array allocated by new will automatically be initialized to 0(for numaricles)
 * , true(for boolean), or null(for references).
 * 
 *  So we can create the student class array
 * 
 * Cloning an array using clone mwthod we can copy the same contet or copy of an array
 */
public class ArraysBasic {
    public int rNo;
    public String name;
    ArraysBasic(int rNo,String name){
        this.rNo=rNo;
        this.name=name;
    }
    public static void main(String[] args) {
        int[] arr;//declares an Array of integers.
        arr=new int[5];//allocating memory for 5 integers.
        System.out.println(arr);
        ArraysBasic[]arrStd=new ArraysBasic[5];
        arrStd[0]=new ArraysBasic(10, "Sanjay0");
        arrStd[1]=new ArraysBasic(20, "Sanjay1");
        arrStd[2]=new ArraysBasic(30, "Sanjay2");
        arrStd[3]=new ArraysBasic(40, "Sanjay3");
        arrStd[4]=new ArraysBasic(50, "Sanjay4");
        for (ArraysBasic arraysBasic : arrStd)
            System.out.println(arraysBasic.rNo+" "+arraysBasic.name);
            
        //Array of objects also created below format also
        ArraysBasic[]arrStd2=new ArraysBasic[]{
            new ArraysBasic(60, "Sanjay5"),
            new ArraysBasic(70, "Sanjay6"),
            new ArraysBasic(80, "Sanjay7")
        };
        for (ArraysBasic arraysBasic : arrStd2)
            System.out.println(arraysBasic.rNo+" "+arraysBasic.name);

        //Cloning ofarrays
        int[]arrOrig={1,2,3,4,5};
        int[]cloneArray=arrOrig.clone();
        System.out.println(Arrays.toString(cloneArray));

    }
    
}
