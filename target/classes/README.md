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
-Easy to implement and few drawbacks


-Prototype Pattern

-The prototype pattern is another form of creational patterns
-Used to copy an instantiated object
-Typically doesnt use the keyword new
-Usually implemented with a Registry to store the original object and clones
-Shallow copies do not store differences between original and clones registry
-Deep copies store and return changes made
-Used by implementing cloneable or prototype interfaces in object classes
-used to help create multiple instances of an object quickly
-often uses an interface for prototype instances
-Can utilize parameters in a clone method for construction
-it is better to use a deep copy than a shallow copy


-Factory Method Pattern

-The Factory method pattern is one of the more used patterns
-In some ways, the factory pattern can be opposite of the singleton pattern
-It doesnt expose the instantiation logic so the client on the opposite end will not know about the object being created
-The parameters are used to determine the concrete type
-The method to request an object is usually parameterized
-The factory exposes common interfaces so the client on the opposite end will know about the interfaces
-The facrory method is responsible for creating instances and managing its lifecycle
-It suggests you replace creating new objects by using the new operator which will then call the special factory method




-Proxy Pattern

-Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
- A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
-If you need to execute something either before or after the primary logic of the class, the proxy lets you do this without changing that class
-The proxy pattern is a a pattern that acts as an interface to something else
-You would create an interface to an object by wrapping it with a class to create a proxy
-You Can add More functionality to that wrapped object
-The proxy its self would be called to access the real object
-So you'll have an interface, then a proxy thats wrapping the real object, and then the underlying object