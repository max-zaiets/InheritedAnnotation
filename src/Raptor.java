import annotation.ClassPreamble;
import annotation.DinosaurAction;
import annotation.DinosaurInfo;

@ClassPreamble(
        author = "Anastasiia Dolbina",
        date = "28-12-2022",
        lastModified = "28-12-2022"
)
@DinosaurInfo(dinosaurGenera = "Raptor", size = 3.9)
public class Raptor extends Dinosaur {
    @Override
    @DinosaurAction(act = "eating")
    public void actionNow(String act) {
        System.out.println(" is " + act);
    }
}
