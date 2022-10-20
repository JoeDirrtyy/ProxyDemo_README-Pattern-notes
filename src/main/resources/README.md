-Singleton Design Pattern

-The Singleton pattern is commonly the most used
due to its simplicity to implement and the type of problem it solves
-The Singleton gaurentees only one instance is going to be created and guarentees control over a resource
-usually  "Lazily loaded"
-The singleton is responsible for creating its self and managing its life cycle. static in nature
-Private instance and private constructor, so the singleton its self can call the constructor and nobody else
-No parameters or interfaces
-Should have a getInstance method for the singleton you created
-Lazily loaded is the process of delaying the process of instantiating the class until required.
basically a design to not fetch all the instances in the application at once, creating slow start up
and taking up memory
-Thread safe is code that can safely be utilized or shared in concurrent or multi-threading environment
-You should not make everything a singleton as it will slow you application down the more you use it
-singletons are also difficult to unit test

-Builder Pattern

-The builder pattern is a  design pattern that lets you construct complex objects step by step
-The builder patter handles complex constructors and a large number of parameters
-The builder pattern can help pick which constructor to choose from
-Negates the need for exposed setters





-Proxy Pattern

-Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
- A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
-If you need to execute something either before or after the primary logic of the class, the proxy lets you do this without changing that class
-The proxy pattern is a a pattern that acts as an interface to something else
-You would create an interface to an object by wrapping it with a class to create a proxy
-You Can add More functionality to that wrapped object
-The proxy its self would be called to access the real object
-So you'll have an interface, then a proxy thats wrapping the real object, and then the underlying object