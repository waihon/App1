package mybank.app1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CustomerAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        // The isCancelled() method is defined in the parent Action class
        if (isCancelled(request)) {
            System.out.println("Cancel operation performed");
            return mapping.findForward("mainpage");
        }

        CustomerForm custForm = (CustomerForm)form;
        String firstName = custForm.getFirstName();
        String lastName = custForm.getLastName();
        System.out.println("Customer First Name is " + firstName);
        System.out.println("Customer Last Name is " + lastName);

        ActionForward forward = mapping.findForward("success");
        return forward;
    }
}
