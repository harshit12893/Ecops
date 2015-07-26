<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="PoliceStationDataUpdate">
    <s:textfield name="pstation_id" label="Police Station Id"/>
    <s:textfield name="pstation_name" label="Police Station Name"/>
    <s:textfield name="address" label="Police Station Address"/>
    <s:textfield name="phone" label="Police Station Phone"/>
    <s:textfield name="pstation_head" label="Police Station Head"/>
    <s:textfield name="password" label="Police Station Password"/>
    <s:submit value="Update Data"/>
</s:form>