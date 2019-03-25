import com.sun.jdi.IntegerValue;

public class Command {

   String name;
   String step;

    public Command(String name, String step) {
        this.name = name;
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public String getStep() {
        return step;
    }
}



