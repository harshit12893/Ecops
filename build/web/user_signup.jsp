<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="usersignup">
    <s:textfield name="name" label="Your Name"></s:textfield>
     <s:textfield name="email" label="Your Email"></s:textfield>
     <s:textfield name="loginid" label="Preferred username"/>
     <s:password name="password" label="Password"/>
     <s:submit label="Register"/>
</s:form>