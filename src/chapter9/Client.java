package chapter9;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Meтoд callback(), " + "вызываемый со значением " + p);
    }
    void noniFaceMeth (){
        System.out.println("B классах, реализующих интерфейсы,"
                + "могут определяться и другие члены.");
    }
}
