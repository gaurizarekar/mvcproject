<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="project.model.result"
    import="java.util.*"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         table, th, td {
           border: 5px solid black;
           border-collapse:collapse;
           }

        table {
        width: 100%;
        }
        th{
            background-color:#009999;
            color:white;
        }
        </style>
    </head>
    <body>
        
    
    <center>  <table border="1">
           <tr>
               <th>sid</th>
               <th>sname</th>
               <th>date</th>
               <th>marks</th>
                <th>Update</th>
                <th>Delete</th>


               
           </tr>
      
        <%
         ArrayList<result> al=(ArrayList)request.getAttribute("list");
        for(result r:al)
        {
        
        
        %>
           
      
       
           <tr>
          
             <td><%=r.getId()%></td>
             <td><%=r.getName()%></td>
             <td><%=r.getDate()%></td>
             <td><%=r.getMark()%></td>
             <td><a href="update?id=<%=r.getId()%>">update</td>
             <td><a href="delete?id=<%=r.getId()%>">delete</td>
                   
           </tr>
      
      
         
       <%
        }
       %>

      
        </table> </center> 
    </body>
</html>
