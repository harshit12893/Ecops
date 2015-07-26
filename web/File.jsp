<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="View">
    <s:combobox name="pstation_id" list="f" headerValue="--Select--" label="Police Station Id" headerKey="-1"/>
    <s:textfield name="description" label="Description"/>
    <s:combobox name="loginid"   list="f1" headerValue="--Select--" label="Your Login Id" headerKey="-1"/>
    <s:combobox name="criminalid" list="f2" headerValue="--Select" label="Criminal id(if possible)" headerKey="-1"/>
    <s:submit value="Add Complaint"/>
</s:form>