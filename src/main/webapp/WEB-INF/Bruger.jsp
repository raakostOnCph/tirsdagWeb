<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 06/04/2021
  Time: 10.52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> velkomme du er nu logget ind !</h1>

${requestScope.msg}

dit navn er ${sessionScope.brugernavn}
<br>
dit sessionid er ${sessionScope.sessionid}


<h1> Her kan du tilfeje emner til din huskesedel</h1>

du har nu til ${sessionScope.emneListeSize} emner   // ser her

<form action="TilfoejEmne" method="post">
    <label for="emne">Emne:</label><br>
    <input type="text" id="emne" name="emne" value="Børst tænder"><br>

    <input type="submit" value="Tilføj emne">
</form>



<%--<%=request.getAttribute("brugernavn")%>   // scriptlets  nogo--%>


</body>
</html>
