package generics;

public class GetId {
    public static void main(String[] args) {
        GenericExample<GenericChildClass> genericExample = new GenericExample<>();
        genericExample.element = new GenericChildClass();
        System.out.println(genericExample.element.isEnabled());
        System.out.println(genericExample.element.printMyName());
    }
}
