package observer;

public class Subscriber implements Observer {
    
    private String  name;

    public          Subscriber(String name)
    {
        this.name = name;
    }

    public void     update(String msg)
    {
        System.out.println("User " + this.name + "recieved message: " + msg);
    }
}
