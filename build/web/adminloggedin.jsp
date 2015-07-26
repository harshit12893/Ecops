<h5>Welcome ${sessionScope.user}</h5>
<%@taglib  prefix="s" uri="/struts-tags" %>
<ol>
    <li> <s:a action="RegisterPoliceStation">Register New Police Station</s:a> </li> 
 <li> <s:a action="DeletePoliceStation">Delete Police Station</s:a> </li> 
<li> <s:a action="UpdatePoliceStationData">Update Police Station data</s:a> </li>
<li> <s:a action="AddNews">Add/Broadcast News</s:a> </li>
<li> <s:a action="DeleteNews">Delete old News</s:a> </li>
<li> <s:a action="UpdateNews">Update old News</s:a> </li>
</ol>

