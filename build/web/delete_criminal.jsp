<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:head/>
<h2> Criminal list</h2>
<br>
<hr>
<br>
<s:form action="DeleteSelectedCriminal">

    <table border="1">
        <tr bgcolor="green"> <th> ID </th> <th> Name </th> <th> Gender </th><th> Height </th><th> Weight </th><th> PstationId </th><th> Crime Level </th><th> Status </th><th> Photo </th></tr>
                <s:iterator value="cs" status="pos">
            <tr bgcolor="yellow">

                <td><s:property value="criminalId" /></td>
                <td><s:property value="name"/></td> 
                <td><s:property value="gender"/></td> 
                <td><s:property value="height"/></td> 
                <td><s:property value="weight"/></td> 
                <td><s:property value="pstation_id"/></td> 
                <td><s:property value="crimelevel"/></td> 
                <td><s:property value="status"/></td> 
                <td><img src="<s:url value="showPhoto?criminalId=%{criminalId}" />" width="50" height="50"/></td>

                <td><s:radio name="ch" list="{criminalId}" theme="simple" /></td>   
            </tr>
        </s:iterator>
    </table>

    <s:submit value="Delete Criminal" />
</s:form>
