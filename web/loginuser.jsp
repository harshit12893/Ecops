<%@taglib prefix="s" uri="/struts-tags" %>
<h3 style="color: black;font-weight:bold;" >User Login</h3>
<s:form action="login">
     <s:textfield name="loginid" label="Username"/>
    <s:password name="password" label="Password"/>
    <s:submit label="Login"/>
</s:form>
New User? <s:a action="registeruser">  Register Here </s:a>
  