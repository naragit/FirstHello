<%@ page import="java.util.Date" %>
<body>
<h3>Hi Dhana</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>
<br>
    Parameter Name is : <%= request.getParameter("username") %>
    <br>
     Parameter Name is : <%= request.getParameter("txt") %>
 <br>
   Radio Sel Name is : <%= request.getParameter("gender") %>
    <br>

   Check Sel Name is : <%= request.getParameter("chk") %>
    <br>
   chk Sel Name is : <%= request.getParameter("chk1") %>
   <br>
   <br>
    Select Name is : <%= request.getParameter("selname") %>
    <br>
    <h2>  Mar 2019 </h2>
    <h3> End of Document </h3>
    <h3> Set 3</h3>
    
    
   
   returns filename only rather than whole path: <%= request.getParameter("upload") %>
 
</body>