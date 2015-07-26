<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="UpdateSelectedCriminal" enctype="multipart/form-data" method="post">
    <s:textfield name="criminal_id" label="Criminal Id" />
    <s:textfield name="name" label="Name" />
    <s:textfield name="gender" label="Gender" />
    <s:textfield name="height" label="Height" />
    <s:textfield name="weight" label="Weight" />
    <s:textfield name="pstation_id" label="Police Station Id" />
    <s:textfield name="crimelevel" label="Crime level" />
    <s:textfield name="status" label="Status" />
    <s:file name="photo" label="Select Photo" />
    <s:submit value="Update Criminal data"/>
</s:form>