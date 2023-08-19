package String;
/*
 * Strng vs StringBuilder vs StringBuffer
 * When do we use ?
 * String:- String is used when if string is going to remain constant throughout the program,
 * then we use the String object beacause a String object is immutable.
 * StringBuilder:-If string can change and will only be accessed from a single thread,
 * then we use StringBuilder beacuse it is mutable and not thread safe
 * StringBuffer:-If a string can change and be accessed from multiple thraeds, then
 * we use stringBuffer because it is mutable and thread safe(so multiple thrad can use)
 */
public class StrSbuildSbuffer {
    public static void main(String[] args) {
        String s1="Sanjay ";
        concat1(s1);
        /*when we print the String s1 after calling concat method which concats "BN"
         * then it won't change because of String immutability feature
         * altering the s1 String will crates the another object
         * since s1 in concat1() stores reference of new string. References s1 in main() an dconst1()
         * is different
         */
        System.out.println("String:-"+s1);
        StringBuilder s2=new StringBuilder("Sanjay");
        concat2(s2);
        /*When it comes to StringBuilder we pass String "Sanjay" and performs s2.append("BN")
         * which changes the actual value of the string in main to Sanjay BN this is due to 
         * mutable nature of StringBuilder
         */
        System.out.println("String Builder:-"+s2);
        StringBuffer s3=new StringBuffer("Sanjay");
        concat3(s3);
        /*When it comes to StringBuffer we pass String "Sanjay" and performs s3.append("BN")
         * which cnages the actual value of the string in main to Sanjay BN this is due to 
         * mutable nature of StringBuffer
         * except the mutable nature it thrad safe rather StringBuilder isn't
         */
        System.out.println("String Buffer:-"+s3);
        
        //we can convert the STringBuilder and STringBuffer to String by using below
        String cTOstr=s2.toString();
        String cTostr2=s3.toString();
        
        //If we want ro convert the STringBuilder to StringBuffer vice versa
        StringBuffer strbfr=new StringBuffer("Convert");
        String cTostr3=strbfr.toString();
        StringBuilder strbuilder=new StringBuilder(cTostr3); 
        System.out.println(strbfr+" "+strbuilder+" "+cTOstr+" "+cTostr2);


    }
    public static void concat1(String s1){
        s1=s1+"BN";
    }
    public static void concat2(StringBuilder s2){
        s2.append("BN");
    }
    public static void concat3(StringBuffer s3){
        s3.append("BN");
    }
}
