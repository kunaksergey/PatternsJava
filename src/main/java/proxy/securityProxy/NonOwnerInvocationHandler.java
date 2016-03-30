package proxy.securityProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by sa on 30.03.16.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean personBean) {

        this.person = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("setHotOrNotRating")) {
                return method.invoke(person, args);
            }else if (method.getName().startsWith("get")) {
                return method.invoke(person,args);
            } else if (method.getName().startsWith("set"))
                throw new IllegalAccessException();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
