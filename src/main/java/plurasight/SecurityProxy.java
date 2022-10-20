package plurasight;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//This is basically a small factory thats going to grab an instance of an object back
public class SecurityProxy implements InvocationHandler {

    private Object obj;

    private SecurityProxy(Object obj){
        this.obj = obj;
    }

    //Proxy pattern: return statement is passing in the obj classes and interfaces
    //Its building a proxy around the class (SecurityProxy) and interfaces its implementing
    // then returns a new SecurityProxy object that its wrapping
    public static Object newInstance(Object obj){
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj
                .getClass().getInterfaces(), new SecurityProxy(obj));
    }

    //This is where the proxy comes into play
    //this tells which methods to and not to invoke on when the method is called
    //This is saying it will pass any method you give to it and return the result from it
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try{
            result = method.invoke(obj, args);
        }catch(InvocationTargetException ex){
            throw ex.getTargetException();
        }catch(Exception ex){
            throw new RuntimeException("unexpected invocation exception: "
                    + ex.getMessage());
        }

        return result;
    }
}