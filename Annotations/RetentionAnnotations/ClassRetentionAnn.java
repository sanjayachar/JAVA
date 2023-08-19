package Annotations.RetentionAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/*Retained in the compiled bytecode but not accessible at runtime*/
public @interface ClassRetentionAnn {
    public String value();
}
