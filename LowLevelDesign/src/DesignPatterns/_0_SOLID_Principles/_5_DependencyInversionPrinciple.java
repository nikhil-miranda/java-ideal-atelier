package DesignPatterns._0_SOLID_Principles;

public class _5_DependencyInversionPrinciple {

    /**
     * Definition: High-level modules should not depend on low-level modules.
     * Both should depend on abstractions.
     * <p>
     * Example:
     * - You have a class called FrontEnd.java which has a method called getDetails().
     * - You have a class called BackEnd.java which has a method called getDetails().
     * - You have a class called FrontEndImpl.java which implements FrontEnd.java.
     * - You have a class called BackEndImpl.java which implements BackEnd.java.
     * - You want to get the details from the front end.
     * - You can call the getDetails() method from the FrontEndImpl class.
     * - This way, you don't have to modify the BackEndImpl class.
     * - This is because the FrontEndImpl class doesn't depend on the BackEndImpl class.
     * - This is because both the classes depend on an abstraction.
     * - The FrontEndImpl class depends on the FrontEnd interface.
     * - The BackEndImpl class depends on the BackEnd interface.
     * - This is called dependency inversion.
     * - This is achieved by using interfaces and abstract classes.
     * - This is achieved by using dependency injection.
     */

    public interface FrontEnd {
        void getDetails();
    }

    public interface BackEnd {
        void getDetails();
    }

    public class FrontEndImpl implements FrontEnd {
        @Override
        public void getDetails() {
            System.out.println("FrontEndImpl");
        }
    }

    public class BackEndImpl implements BackEnd {
        @Override
        public void getDetails() {
            System.out.println("BackEndImpl");
        }
    }

}
