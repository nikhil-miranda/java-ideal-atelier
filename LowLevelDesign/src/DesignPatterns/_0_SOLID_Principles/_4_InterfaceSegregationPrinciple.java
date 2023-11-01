package DesignPatterns._0_SOLID_Principles;

public class _4_InterfaceSegregationPrinciple {

    /**
     * Definition: Clients should not be forced to depend upon interfaces that they do not use.
     *
     * This is achieved by separating the interfaces into smaller interfaces.
     * Interface Pollution: When a class implements an interface that it doesn't use.
     *
     *      Example:
     *          - You have a class called Printer.java which has a print() method.
     *          - You have a class called Scanner.java which has a scan() method.
     *          - You have a class called Fax.java which has a fax() method.
     *          - You have a class called PrintScanner.java which implements Printer.java and Scanner.java.
     *          - You have a class called PrintScannerFax.java which implements Printer.java, Scanner.java, and Fax.java.
     *          - You want to create a new class called PrintFax.java which implements Printer.java and Fax.java.
     *          - You cannot create this class because it doesn't have the scan() method.
     *          - This is because of interface pollution.
     *          - This can be solved by separating the interfaces into smaller interfaces.
     *          - This way, you don't have to implement the scan() method in the PrintFax class.
     */

    public interface Printer {
        void print();
    }

    public interface Scanner {
        void scan();
    }

    public interface Fax {
        void fax();
    }

    public class PrintScanner implements Printer, Scanner {
        @Override
        public void print() {
            System.out.println("Print");
        }

        @Override
        public void scan() {
            System.out.println("Scan");
        }
    }

    public class PrintScannerFax implements Printer, Scanner, Fax {
        @Override
        public void print() {
            System.out.println("Print");
        }

        @Override
        public void scan() {
            System.out.println("Scan");
        }

        @Override
        public void fax() {
            System.out.println("Fax");
        }
    }

    public class PrintFax implements Printer, Fax {
        @Override
        public void print() {
            System.out.println("Print");
        }

        @Override
        public void fax() {
            System.out.println("Fax");
        }
    }

}
