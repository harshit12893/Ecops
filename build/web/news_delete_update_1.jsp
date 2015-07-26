<%@taglib prefix="s" uri="/struts-tags" %>
<s:head/>
<h2> News list</h2>
<br>
<hr>
<br>
  <s:form action="UpdateSelectedNews"> 
  
<table border="1">
    <tr bgcolor="green"> <th> Sno </th> <th> Description </th> </tr>
            <s:iterator value="es" status="pos">
        <tr bgcolor="yellow">
            <td><s:property value="sno"/></td>
            <td><s:property value="description"/></td>
              
        </tr>
            </s:iterator>
            </table>
 <s:submit value="Update News" />
</s:form>