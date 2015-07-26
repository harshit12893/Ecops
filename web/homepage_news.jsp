<%@taglib prefix="s" uri="/struts-tags" %>
<s:head/>
<h2> Latest News </h2>
<br>
<hr>
<br>
<table border="0">
            <s:iterator value="es">
        <tr>
            <td >* </td>
            <td>&nbsp&nbsp;</td>
            <td ><s:property value="description"/></td>
        </tr>

            </s:iterator>
        </table>