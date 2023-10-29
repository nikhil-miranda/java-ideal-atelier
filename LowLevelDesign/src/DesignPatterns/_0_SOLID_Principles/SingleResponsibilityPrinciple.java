package DesignPatterns._0_SOLID_Principles;

public class SingleResponsibilityPrinciple {

    /**
     * Definition: There should never be more than one reason for a class to change.
     *
     * One class must have just one responsibility. If a class has more than one responsibility,
     * a change to one responsibility results in modification of the other responsibility.
     */

    private String name;

    // TODO: move to another class
    private boolean isValidUser(String name) {
        return true;
    }

    // create new user
    public String createNewUser() {
        if (this.isValidUser(name)) {
            return "Success";
        } else {
            return "Failure";
        }
    }

}
