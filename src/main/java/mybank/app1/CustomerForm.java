package mybank.app1;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public final class CustomerForm extends ValidatorForm implements Serializable {
    private static final long serialVersionUID = 1L;
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

    /**
     * Reset all properties to their default values.
     *
     * @param mapping The mapping used to select this instance
     * @param request The servlet request we are processing
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        firstName = null;
        lastName = null;
        step = null;
    }
}
