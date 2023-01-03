package annotation;

import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
    String author();

    String date();

    String lastModified() default "N/A";
}
