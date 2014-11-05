package p4_innerClasses;

interface Service{
    void method();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    private Implementation1() {};
    public void method(){
        System.out.println("Impl1 meth1");
    }
    // you create a field which is initialized with nameless factory constructor
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}
class Implementation2 implements Service{
    private Implementation2() {};
    public void method(){
        System.out.println("Impl2 meth1");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

public class FactoriesRevisited { // this class has no knowledge about concrete services !!!
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method();
    }
    public static void main(String[] args){
        serviceConsumer(Implementation1.factory); // implementations are completely
        // interchangeable
        serviceConsumer(Implementation2.factory);
    }
}
