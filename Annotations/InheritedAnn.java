package Annotations;
import java.lang.annotation.*;
/*@Inherited annotation is a built in meta annotation in java used to indicate that an annotation 
 * should be inherited by subclasses of annotation classes.
 * It allows annotations to be automatically inherited by subclass without the need to reapply the annotation
 * explicitly.
 * 
 * 1)If an annotation is marked with @Inherited, and a class is annotated with @Inherited marked annotation,
 * then its subclasses will be considered to have the annotation, even if they do not explicitly declare it
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MyInheritedAnn{
    public String value();
}

@MyInheritedAnn("Inherited annotation: so the Parent class is declared as\n MyInherited Then we need not to worry about \nchild class to add MyInherited annotation")
class Parent{

}
class Child extends Parent{

}
public class InheritedAnn {
    public static void main(String[] args) {
        MyInheritedAnn parentAnn=Parent.class.getAnnotation(MyInheritedAnn.class);
        MyInheritedAnn childAnn=Child.class.getAnnotation(MyInheritedAnn.class);

        System.out.println("Parent Annotation: "+parentAnn+"\nChild Annotation: "+childAnn);
    }
}
