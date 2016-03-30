package proxy.securityProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sa on 30.03.16.
 * Защитный заместитеьл управляет доступом к методам объекта
 * в зависимости от привелегии вызывающей стороны
 */
public class MatchMakingTestDrive {
    private Map<String,PersonBean> persons=new HashMap<>();
    public static void main(String[] args) {
        MatchMakingTestDrive test=new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initialDatabase();
    }

    private void initialDatabase() {
        persons.put("Joe Javabean",new PersonBeanImpl("Joe Javabean","Male","Byke",0,0));
    }

    private void drive() {
        PersonBean joe=getPersonFromDatabase("Joe Javabean");
        /**************  OwnerProxy  ***************************/
        PersonBean ownerProxy=getOwnerProxy(joe);
        System.out.println("Name is "+ownerProxy.getName());
        ownerProxy.setInterests("bowling,Go");
        System.out.println("Interest set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        }catch(Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is "+ownerProxy.getHotOrNotRating());

        /***************  NonOwnerProxy  **********************/
        PersonBean nonOwnerProxy=getNonOwnerProxy(joe);
        System.out.println("Name is "+nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling,Go");
        }catch(Exception e){
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is "+ nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private PersonBean getPersonFromDatabase(String s) {
        return persons.get(s);
    }
}
