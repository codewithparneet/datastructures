package generics;

public class GenericExample<T extends DupCheck>{

    public T element;

    public void printElement(){
        System.out.println(element);
    }

}
