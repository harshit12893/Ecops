<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="AddCriminalData" enctype="multipart/form-data" method="post">
<s:textfield name="criminal_id" label="Criminal Id"/>
<s:textfield name="name" label="Criminal Name"/>
<s:textfield name="gender" label="Criminal Gender"/>
<s:textfield name="height" label="Criminal Height"/>
<s:textfield name="weight" label="Criminal Weight"/>
<s:textfield name="pstation_id" label="Your Police Station Id"/>
<s:textfield name="crimelevel" label="Crimelevel"/>
<s:textfield name="status" label="Criminal Status"/>
<s:file name="photo" label="Select Photo"/>
<s:submit value="Add Criminal"/>
</s:form>