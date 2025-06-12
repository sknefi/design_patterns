package observer;

public class TestObserver {

    public static void  test()
    {
        YtChannel   yt = new YtChannel();
        Subscriber  s1 = new Subscriber("Filip");
        Subscriber  s2 = new Subscriber("Saheed");
        Subscriber  s3 = new Subscriber("Messi");
    
        yt.add(s1);
        yt.add(s2);
        yt.add(s3);
        yt.notify_observers("Mr. Beast new video");
    }
}
