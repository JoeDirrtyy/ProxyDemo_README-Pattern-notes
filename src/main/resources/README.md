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



-AbstractFactory pattern

-A creational design pattern that lets you produce familes of related objects without specifying thee concrete class
- Familys of products with different variants
-Explicitly declare interfaces for each distinct product of the product family
then you can make all variants of products follow those interfaces
-declare the Abstract Factory an interface with a list of creation methods for all products that are part of the product family
- These methods must return abstract product types represented by the interfaces
-For each variant of a product family, we create a separate factory class based on the AbstractFactory interface
- A factory is a class that returns products of a particular kind.
  



-Adapter pattern

-Structural design pattern that allows objects with incompatible interfaces to collaborate
-This is a special object that converts the interface of one object so that another object can understand it
-An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes
-The wrapped object isn’t even aware of the adapter
-The adapter gets an interface, compatible with one of the existing objects
-Using this interface, the existing object can safely call the adapter’s methods
-when receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects



-Composite pattern

- Structural design pattern that lets you compose objects into tree stuctures
Using the Composite pattern makes sense only when the core model of your app can be represented as a tree
-The Composite pattern suggests that you work with Products and Boxes through a common interface
-interface describes operations that are common to both simple and complex elements of the tree.
-Leaf is a basic element of a tree that doesn’t have sub-elements.
-Usually, leaf components end up doing most of the real work, since they don’t have anyone to delegate the work to
-The Container (aka composite) is an element that has sub-elements leaves or other containers.
-Upon receiving a request, a container delegates the work to its sub-elements,
-processes intermediate results and then returns the final result to the client.
-define the methods for adding and removal of child elements in the container



-Decorator

-Structural design pattern that lets you attach new behaviors to objects.
-Places objects inside special wrapper objects that contain the behaivors
-Componet is the common interface for both wrappers and wrapped objects
-Concrete Component is a class of objects being wrapped. It defines the basic behavior, which can be altered by decorators.
-The Base Decorator class has a field for referencing a wrapped object.
-The field’s type should be declared as the component interface so it can contain both concrete components and decorators.
-The base decorator delegates all operations to the wrapped object.
-Concrete decorators override methods of the base decorator and execute their behavior either before or after calling the parent method




-Facade

-Structural design pattern that provides a simplified interface to a library, a framework, or any complex set of classes
-provides a simple interface to a complex subsystem which contains lots of moving parts.
-limited functionality in comparison to working with the subsystem directly.
-it includes only those features that clients really care about.
-should be responsible for initializing the subsystem and managing its further life cycle
-Instead of making your code work with dozens of the framework classes directly,
-you create a facade class which encapsulates that functionality and hides it from the rest of the code.
-This structure also helps you to minimize the effort of upgrading to future versions of the framework or replacing it with another one.
-The only thing you’d need to change in your app would be the implementation of the facade’s methods

-Proxy Pattern

-Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
- A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
-If you need to execute something either before or after the primary logic of the class, the proxy lets you do this without changing that class
-The proxy pattern is a a pattern that acts as an interface to something else
-You would create an interface to an object by wrapping it with a class to create a proxy
-You Can add More functionality to that wrapped object
-The proxy its self would be called to access the real object
-So you'll have an interface, then a proxy thats wrapping the real object, and then the underlying object