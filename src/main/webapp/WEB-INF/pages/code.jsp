<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<body>

<h1>
    <div id="flags">
        <a href="?lang=en"><img alt="en" title="English" src="<c:url value="/resources/img/flags/en.png"/>"></a>
        <a href="?lang=de"><img alt="de" title="Deutsch" src="<c:url value="/resources/img/flags/de.png"/>"></a>
        <a href="?lang=ua"><img alt="ru" title="Українська" src="<c:url value="/resources/img/flags/ua.png"/>"></a>
    </div>
</h1>

<div>
    Code is ${uidCode}
    <br>
    Message from service: ${serviceMessage}
</div>

</body>
</html>
