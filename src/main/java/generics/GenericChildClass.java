package generics;

public class GenericChildClass implements DupCheck{

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String printMyName() {
        return "Rohit";
    }
}
