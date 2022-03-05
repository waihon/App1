<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html:html>
  <head>
    <html:base />
    <meta charset="ISO-8859-1">
    <title>Customer Details</title>
  </head>

  <body>
    <html:errors />
    <html:form action="/submitCustomerForm">
      <bean:message key="prompt.customer.firstname" />:
      <html:text property="firstName" size="16" maxlength="16" />
      <bean:message key="prompt.customer.lastname" />:
      <html:text property="lastName" size="16" maxlength="16" />
      <br />
      <html:submit property="step">
        <bean:message key="button.save" />
      </html:submit>
      &nbsp;
      <html:submit property="step">
        <bean:message key="button.spike" />
      </html:submit>
      &nbsp;
      <html:cancel>
        <bean:message key="button.cancel" />
      </html:cancel>
    </html:form>
  </body>
</html:html>
