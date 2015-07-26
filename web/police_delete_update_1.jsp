<%@taglib prefix="s" uri="/struts-tags" %>
<s:head/>
<h2> Police Stations list</h2>
<br>
<hr>
<br>
<table border="1">
    <s:form action="PoliceUpdateSelectedData">
    <tr bgcolor="green"> <th> Police St Id </th> <th> Police St Name </th> <th> Police St Address </th> <th> Police St Phone </th><th> Police St Head </th><th> Password </th></tr>
            <s:iterator value="ps" status="pos">
        <tr bgcolor="yellow">
            <td ><s:property value="pstationId"/></td>
            <td ><s:property value="pstationName"/></td>
            <td ><s:property value="address"/></td>
            <td ><s:property value="phone"/></td>
            <td ><s:property value="pstationHead"/></td>
            <td ><s:property value="password"/></td>
           
        </tr>

            </s:iterator>
            <s:submit value="Update data"/>
    </s:form>
        </table>