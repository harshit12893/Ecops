<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="UpdateComplaintStatus">
<table>
 <table border="1">
     <tr bgcolor="green"> <th> ID </th> <th> Description </th> <th> Police Station Id </th><th> Login ID </th><th>Criminal Id</th><th>Complaint Status</th></tr>
             
     <s:iterator value="em" status="pos">
     <tr bgcolor="yellow">
         <td><s:property value="id"/></td>
         <td> <s:property value="description"/></td>
         <td><s:property value="policeStation.pstationId"/></td>
         <td> <s:property value="login.loginid"/></td>
         <td><s:property value="criminal.criminalId"/></td>
         <td> <s:property value="status"/></td>
     </tr>
     
</s:iterator>
     <s:submit value="Update Complaint Status"/>
</table>
    </s:form>