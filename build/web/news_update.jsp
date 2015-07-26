<%@taglib  prefix="s" uri="/struts-tags" %>
<s:form action="UpdateNewsData">
    
    <s:textfield name="sno" label="Enter Serial No. of news record" />
    <s:textfield name="description" label="Enter New Description"/>
  
    <s:submit value="Update news"/>
</s:form> 

