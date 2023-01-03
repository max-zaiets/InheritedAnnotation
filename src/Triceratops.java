import annotation.ClassPreamble;
import annotation.DinosaurAction;

@ClassPreamble(
        author = "Anastasiia Dolbina",
        date = "28-12-2022",
        lastModified = "28-12-2022"
)
public class Triceratops extends Dinosaur {
    @Override
    @DinosaurAction
    public void actionNow(String act) {
        System.out.println(" is " + act);
    }

}
