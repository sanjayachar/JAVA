package Annotations.RetentionAnnotations;
/*In Java the @Retention annotation is a meta-annotation used to specify the retention policy for a custom annotation.
 * It determines how long the annotation should be retained and meta available for inspection.
 * There are three possible retention policies:
 * 
 * RetentionPolicy.SOURCE:
 * -------------------------
 * This policy for custom annotation is retained only during the source code compilation.
 * The anootation won't be present in compiled bytecode
 * It won't be available at runtime.
 * 
 * RetentionPolicy.CLASS:
 * ------------------------
 * This retention policy for custom annotation is retained during the compilation process 
 * Stored in the compiled bytecode, 
 * But won't be available at runtime.
 * This is the default retention policy if no @Retention annotation is explicitly specified for a custom annotation
 * 
 * RetentionPolicy.RUNTIME:
 * -------------------------
 * The annotation is retained during the compilation process, 
 * Store in the compiled bytecode,
 * Can be accessed and examined at runtime
 */
@SourceRetentionAnn("Source annotation")
 @ClassRetentionAnn("Class annotation")
 @RuntimeRetentionAnn("Runtime annotation")
public class RetentionAnn {
    public static void main(String[] args) {
        SourceRetentionAnn src=RetentionAnn.class.getAnnotation(SourceRetentionAnn.class);
        ClassRetentionAnn cls=RetentionAnn.class.getAnnotation(ClassRetentionAnn.class);
        RuntimeRetentionAnn run=RetentionAnn.class.getAnnotation(RuntimeRetentionAnn.class);

        try{
            System.out.println("Source Annotation: "+src.value());
            System.out.println("Class Annotation: "+cls.value());
        }catch(NullPointerException e){
            System.out.println("Source Annotation is not running at runtime so: "+e.toString()+"\n");
            System.out.println("Class Annotation is not running at runtime so: "+e.toString()+"\n");

        }
        System.out.println("Runtime Annotation: "+run.value());
    }
    
}
