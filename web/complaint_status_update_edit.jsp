<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="StatusUpdate">
<s:textfield name="id" label="Complaint id"/>
<s:textfield name="status" label="New Status"/>
<s:submit value="Update Status"/>
</s:form>