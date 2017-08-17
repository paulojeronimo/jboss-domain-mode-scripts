<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
  <c:choose>
    <c:when test="${ variable == 'created' }">
      <b>Session attribute (poc) created! Please, refresh your browser!</b>
    </c:when>
    <c:otherwise>
      session.getAttribute("poc") = <b>${variable}</b>
    </c:otherwise>
  </c:choose>
</body>
</html>
