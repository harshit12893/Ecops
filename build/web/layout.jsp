<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>

<c:choose>
    <c:when test="${sessionScope.user ne null}"> 
        
    
<html xmlns="http://www.w3.org/1999/xhtml">
   
<head>
 <!--   <style type="text/css">
<!--
 #id1 {
	background-image: url(images/bg2.jpg);
}

</style> -->
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Welcome to E-cops portals | Register Complain | Locate Police Stations....</title>
</head>

    <body>
        <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFCC">
  <!--DWLayoutTable-->
  <tr>
    <td width="28" height="28">&nbsp;</td>
    <td colspan="6" valign="top"><t:insertAttribute name="header"/></td>
    <td width="14">&nbsp;</td>
  </tr>
  <tr>
    <td height="15"></td>
    <td width="109"></td>
    <td width="149"></td>
    <td width="235"></td>
    <td width="371"></td>
    <td width="156"></td>
    <td width="47"></td>
    <td></td>
  </tr>
  <tr>
    <td height="46"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td rowspan="2" valign="top" bgcolor="grey"><t:insertAttribute name="user"/></td>
    <td></td>
    <td></td>
  </tr>
  
  
  
  
  <tr>
    <td height="15"></td>
    <td rowspan="3" valign="top"><t:insertAttribute name="menu"/></td>
    <td></td>
    <td rowspan="3" valign="top" ><t:insertAttribute name="body"/></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="16"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="67">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td valign="top"  bgcolor="grey"><t:insertAttribute name="police_login"/></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="25">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="25"></td>
    <td colspan="6" valign="top"><t:insertAttribute name="footer"/></td>
    <td></td>
  </tr>
  <tr>
    <td height="15"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
</body>
</html>
     
</c:when>
<c:otherwise>
    <%
    response.sendRedirect("wel.action");
    %>
</c:otherwise>
</c:choose> 

