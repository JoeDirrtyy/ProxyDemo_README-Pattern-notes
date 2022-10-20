package plurasight;//The proxy pattern is a a pattern that acts as an interface to something else
//You would create an interface to an object by wrapping it with a class to create a proxy
//Can add More functionality to that wrapped object
//The proxy its self would be called to access the real object
//So you'll have an interface, then a proxy thats wrapping the real object, and then the underlying object

public interface TwitterService{
    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);

}
