<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html>
    
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>duke's soccer league</title>
</head>
<body>
<table border="1" bgcolor="yellow" align="center">
 <tr>
<td><h2>ADD NEW CD COLLECTION</h2></td>
 </tr>
</table>

 
 <form action="processForm" method="post">
  <div class="form-group">
    <label >CD Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  
  <div class="form-group">
    <label>CD TYPE</label>
    <select class="form-control" name="typo">
      <option value="Unknown">Select...</option>
      <option value="International">INTERNATIONAL</option>
      <option value="Winter">SPL EDISION</option>
     
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">RELEASE YEAR</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="year" name="year">
  </div>
   
  
 <input type="submit" value="submit"/>
 <input type="reset"/> 
</form>
 
</body>
</html>