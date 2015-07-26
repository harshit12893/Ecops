<%-- 
    Document   : adminloggedin
    Created on : 9 Jul, 2015, 12:02:06 PM
    Author     : Harshit Srivastava
--%>

<%@taglib  prefix="s" uri="/struts-tags" %>
<h1>Welcome ${sessionScope.user}</h1>
<center>
    <ol>
        <li><s:a action="AddComplain">File Complaint</s:a></li>
        <li><s:a action="SeeComplaint">View Complaints</s:a></li>
    </ol>
</center>
        