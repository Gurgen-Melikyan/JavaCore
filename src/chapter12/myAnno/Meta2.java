package chapter12.myAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Anno test class")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {
    @What(description = "Anno test class")
    @MyAnno(str ="Testing", val = 100)
    public static void myMeth(){
        Meta2 ob = new Meta2();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Bce аннотации для метода myMeth() :");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }

        } catch (NoSuchMethodException e) {
            System.out.println("method does not exists");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
