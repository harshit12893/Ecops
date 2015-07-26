<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
                <style type="text/css">
<!--
body {
        font-family: Verdana, Arial, Helvetica, sans-serif;
        margin: 0;
        font-size: 80%;
        font-weight: bold;
        background: #FFF;
        }

h2 {
        font: bold 14px Verdana, Arial, Helvetica, sans-serif;
        color: #000;
        margin: 0px;
        padding: 0px 0px 0px 15px;
}

ul {
        list-style: none;
        margin: 0;
        padding: 0;
        }

img {
    border: none;
}

/*- Menu 7--------------------------- */

#menu7 {
        width: 200px;
        margin: 10px;
        }

#menu7 li a {
        height: 32px;
          voice-family: "\"}\"";
          voice-family: inherit;
          height: 24px;
        text-decoration: none;
        }

#menu7 li a:link, #menu7 li a:visited {
        color: #FFF;
        display: block;
        background:  url(menu7.gif);
        padding: 8px 0 0 30px;
        }

#menu7 li a:hover, #menu7 li #current {
        color: #FFF;
        background:  url(menu7.gif) 0 -32px;
        padding: 8px 0 0 30px;
        }
-->
</style>
        </head>

        <body>
             
                <div id="menu7">
                        <ul>
                                <!-- CSS Tabs -->
                                <li> <s:a action="wel" id="current">Home</s:a></li>
                                <li><a href="about_us.jsp" >About Us</a></li>
                                <li><a href="services.jsp">Services</a></li>
<li><s:a action="wel">News</s:a></li>
<li><a href="emergency_numbers.jsp">Emergency contacts</a></li>
<li><a href="contact.jsp">Contact</a></li>

                        </ul>
                </div>
</body>
</html>