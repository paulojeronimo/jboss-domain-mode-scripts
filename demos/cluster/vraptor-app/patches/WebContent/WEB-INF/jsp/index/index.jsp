<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
  basePath = <b><%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()%></b><br>
  host (VRaptor variable) = <b>${host}</b><br>
  sessionId = <b><%=session.getId()%></b><br>
  nodeId (System property) = <b><%=System.getProperty("jboss.node.name")%></b><br>
  hostName (System property) = <b><%=System.getProperty("jboss.server.name")%></b><br>
  counter (Session attribute) = <b>${counter}</b>
</body>
</html>
