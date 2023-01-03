package annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DinosaurInfo {
    String dinosaurGenera() default "N/A";

    double size() default 0;
}
