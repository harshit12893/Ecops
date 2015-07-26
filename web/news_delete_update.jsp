<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:head/>
<h2> News list</h2>
<br>
<hr>
<br>
  <%--<s:form action="UpdateSelectedNews"> --%>
<s:form action="DeleteSelectedNews">
  
<table border="1">
    <tr bgcolor="green"> <th> Sno </th> <th> Description </th> </tr>
    <s:iterator value="es" status="pos">
        <tr bgcolor="yellow">
             <td><s:radio name="ch" list="{sno}" theme="simple" /></td>   
            <td><s:property value="sno" /></td>
            <td><s:property value="description"/></td>                                                 
        </tr>
            </s:iterator>
        </table>

    <s:submit value="Delete News" />
</s:form>


  <%--  <s:submit value="Update News" />
</s:form>--%>