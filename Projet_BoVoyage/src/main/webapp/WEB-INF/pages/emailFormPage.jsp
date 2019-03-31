<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC Email Example</title>
        <style type="text/css">
            #sendEmailBtn {
                float: left;
                margin-top: 22px;
            }
        </style>
    </head>
 
    <body>
      
            <h2>Spring MVC Email Example</h2>
            <form id="sendEmailForm" method="post" action="sendMail" enctype="multipart/form-data">
                <table id="emailFormBeanTable" border="0" width="80%">
                    <tr>
                        <td>Email To: </td>
                        <td><input id="receiverMail" type="text" name="mailTo" size="65" /></td>
                    </tr>
                    <tr>
                        <td>Subject: </td>
                        <td><input id="mailSubject" type="text" name="subject" size="65" /></td>
                    </tr>
                    <tr>
                        <td>Message: </td>
                        <td><textarea id="mailMessage" cols="50" rows="10" name="message"></textarea></td>
                    </tr>
                    <tr>
                    
                        <td colspan="2" align="center"><input id="sendEmailBtn" type="submit" value="Send Email" /></td>
                    </tr>
                </table>
            </form>
        
    </body>
</html>