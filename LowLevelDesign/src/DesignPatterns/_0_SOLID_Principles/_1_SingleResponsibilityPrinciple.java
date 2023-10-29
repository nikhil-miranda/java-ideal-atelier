package DesignPatterns._0_SOLID_Principles;

public class _1_SingleResponsibilityPrinciple {

    /**
     * Definition: There should never be more than one reason for a class to change.
     *
     * One class must have just one responsibility. If a class has more than one responsibility,
     * a change to one responsibility results in modification of the other responsibility.
     *
     * This is achieved by separating the responsibilities into different classes.
     *
     *   Example:
     *      - You have a class called User.java which has a name and an email.
     *      - You want to add a new user.
     *      - Then you will have to validate the user using a different class.
     *      - Then you will have to create a new user using this same class.
     *      - Then you will have to send a welcome email to the user using a different class.
     *      - This way, you don't have to modify the User class if validation and email sending logic changes.
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
