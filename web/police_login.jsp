<%@taglib prefix="s" uri="/struts-tags" %>
<s:head/>
<h3 style="color: black;font-weight:bold;" >Police Station Login</h3>
<s:form action="login_police">
    <s:textfield name="pstation_id" label="Police Station Id"/>
    <s:password name="password" label="Password"/>
    <s:submit value="Login"/>
    
</s:form>