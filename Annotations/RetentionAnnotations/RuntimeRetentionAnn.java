package Annotations.RetentionAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/*Retained in the compiled bytecode and accessible at runtime */
public @interface RuntimeRetentionAnn {
    public String value();
}
