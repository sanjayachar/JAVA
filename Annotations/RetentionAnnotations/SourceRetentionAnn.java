package Annotations.RetentionAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/*Retained only during source code compilation */
public @interface SourceRetentionAnn {
    public String value();
}
