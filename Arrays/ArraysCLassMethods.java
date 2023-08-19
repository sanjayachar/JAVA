package Arrays;
import java.util.*;
public class ArraysCLassMethods {
    //Basically asList is a method which takes the array as a argument and returns in the form of list
    public static void asListMeth(Integer[]arr){
        List<Integer>lst=Arrays.asList(arr);
        System.out.println(lst);
    }
    
    //to sort an array we use sort method
    public static void sortMeth(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //BinarySearch method in Arrays searches the element in binary search algorithm method
    public static void binarySearchMeth(int[]arr){
        //to search an element usign binarySearch method we have to make the array in sorted format
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,567));
    }

    //compare method compares two arrays passed as a paramaeters
    public static void compareMeth(int[]arr1,int[]arr2){
        System.out.println(Arrays.compare(arr1,arr2));
    }

    //copy method copies the conent of one array to another
    public static void copyOfMeth(int[]arr1,int[]arr2){
        arr2=Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        Integer[]arr1={10,20,30,40,50,60};
        asListMeth(arr1);
        int[]arr2={7,3,8,6,78,4,567,43,454};
        sortMeth(arr2);
        binarySearchMeth(arr2);

    //If the two arrays are equal then it returns 0
        int[]arr3={10,20,30,40};
        int[]arr4={10,20,30,40};
        compareMeth(arr3, arr4);

    //If the 1st array is larger than second array then returns 1
        int[]arr5={11,20,30,40};
        int[]arr6={10,20,30,40};
        compareMeth(arr5, arr6);
        
    //If the 1st array is less than second array then returns -1
        int[]arr7={10,20,30,40};
        int[]arr8={11,20,30,40};
        compareMeth(arr7, arr8);

        int[]arr9={};
        copyOfMeth(arr8, arr9);


        
    }
}
