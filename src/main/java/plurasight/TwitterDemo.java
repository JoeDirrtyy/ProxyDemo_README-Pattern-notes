package plurasight;

public class TwitterDemo {
 //https://refactoring.guru/design-patterns/proxy
//Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
// A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
//If you need to execute something either before or after the primary logic of the class, the proxy lets you do this without changing that class
    public static void main(String[] args) {
        //printing what is in the TwitterStub Class
        //you can only have 1 proxy instance
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("ScreenName"));

    }
}
