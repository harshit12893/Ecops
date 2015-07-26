<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="registerPolice">
<s:textfield name="pstation_id" label="Police Station Id"/>
<s:textfield name="pstation_name" label="Police Station Name"/>
<s:textfield name="address" label="Police Station Address"/>
<s:textfield name="phone" label="Police Station Phone"/>
<s:textfield name="pstation_head" label="Police Station head"/>
<s:password name="password" label="Preferred Password"/>
<s:submit value="Register"/>
</s:form>