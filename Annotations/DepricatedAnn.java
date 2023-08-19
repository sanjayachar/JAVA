package Annotations;
/*This annotation marks a class, method, or field as deprecated, indicating that it is no longer recommended to use.
 * It helps developers understand that the element may be removed in future versions.
 */
public class DepricatedAnn {
    @Deprecated
    static public void oldMethod(){
        System.out.println("This is older version of method and also it is depricated using depricated Annotation");
    }
    public static void newMethod(){
        System.out.println("It is the new version of older method oldMethod");
    }
    public static void main(String[] args) {
        /*when it is suggested while typing the vscode recommeds to not use this 
        method means we can use new method*/
        oldMethod();
        newMethod();
    }
    
}
