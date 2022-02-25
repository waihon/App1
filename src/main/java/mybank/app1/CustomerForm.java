package mybank.app1;

import org.apache.struts.action.ActionForm;

public class CustomerForm extends ActionForm {
    private String firstName;
    private String lastName;
    
    public CustomerForm() {
        firstName = "";
        lastName = "";
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String s) {
        this.firstName = s;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String s) {
        this.lastName = s;
    }
}
