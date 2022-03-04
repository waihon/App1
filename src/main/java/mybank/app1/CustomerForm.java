package mybank.app1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CustomerForm extends ActionForm {
    private String firstName;
    private String lastName;
    private String step;

    public CustomerForm() {
        firstName = "";
        lastName = "";
        step = "";
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

    public String getStep() {
        return step;
    }

    public void setStep(String s) {
        this.step = s;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (firstName == null || firstName.trim().equals("")) {
            errors.add("firstName", new ActionError("error.required", "First Name"));
        }
        return errors;
    }
}
