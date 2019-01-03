<%-- 
    Document   : greetings.jsp
    Created on : Oct 9, 2010, 11:30:33 AM
    Author     : Lecturer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<HTML>
<HEAD>
<TITLE>Greetings</TITLE>
</HEAD>

<BODY>
<H2>Greetings</H2>
<c:set var="ss" value="${param.j}"/>
<c:out value="${ss}"/>
</BODY>
</HTML>
