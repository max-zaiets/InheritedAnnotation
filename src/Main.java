import annotation.DinosaurAction;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        Class<?> clDino = dinosaur.getClass();
        Annotation[] classAnnotations = clDino.getAnnotations();

        System.out.println((char)27 + "[34m" + clDino.getName() +(char)27 + "[38m" + "\nAnnotations:");
        for (Annotation annotation : classAnnotations) {
            System.out.println("\t" + annotation);
        }
        try {
            Method methodDino = clDino.getMethod("actionNow", String.class);
            DinosaurAction dinosaurActionDino = methodDino.getAnnotation(DinosaurAction.class);
            System.out.print("\t" + clDino.getName());
            dinosaur.actionNow(dinosaurActionDino.act());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Dinosaur raptor = new Raptor();
        Class<?> clRaptor = raptor.getClass();
        Annotation[] classAnnoRaptor = clRaptor.getAnnotations();

        System.out.println((char)27 + "[34m" + clRaptor.getName() + (char)27 + "[38m" + "\nAnnotations:");
        for (Annotation annotation : classAnnoRaptor) {
            System.out.println("\t" + annotation);
        }
        try {
            Method methodRaptor = clRaptor.getMethod("actionNow", String.class);
            DinosaurAction dinosaurActionRaptor = methodRaptor.getAnnotation(DinosaurAction.class);
            System.out.print("\t" + clRaptor.getName());
            raptor.actionNow(dinosaurActionRaptor.act());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        Dinosaur triceratops = new Triceratops();
        Class<?> clTric = triceratops.getClass();
        Annotation[] classAnnoTric = clTric.getAnnotations();

        System.out.println((char)27 + "[34m" + clTric.getName() + (char)27 + "[38m" + "\nAnnotations:");
        for (Annotation annotation : classAnnoTric) {
            System.out.println("\t" + annotation);
        }
        try {
            Method methodTric = clTric.getMethod("actionNow", String.class);
            DinosaurAction dinosaurActionTric = methodTric.getAnnotation(DinosaurAction.class);
            System.out.print("\t" + clTric.getName());
            triceratops.actionNow(dinosaurActionTric.act());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
