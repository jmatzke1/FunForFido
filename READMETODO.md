# FunForFido
This is the start of my enterprise java project

### Hi


- [ ] It is possible to bind and connect to localhost:8080 at the same time - 
    application server will probably compete with some other software on the port ( command to find this out ? )
- [ ] Look into how authenication works, tie memebr id into username or list all info in member,
    can I copy from exercise ?

- [ ] figure out servlet parameters and pass them into map ?


<!-- <c:if test="${sessionScope.LOGGEDINUSER.groupname == 'member'}">  // or whatever your object is called -->

<!-- <c:if> -->
 pre-populate forms
 http://www.javapractices.com/topic/TopicAction.do?Id=177
 http://www.geonames.org/export/web-services.html
 
 http://stackoverflow.com/questions/5585957/get-latlng-from-zip-code-google-maps-api
 http://stackoverflow.com/questions/3177733/how-to-avoid-java-code-in-jsp-files
 http://stackoverflow.com/questions/14128950/jsp-how-to-check-if-a-user-is-logged-in
    <security-constraint>
        <web-resource-collection>
            <web-resource-name>administrator</web-resource-name>
        <url-pattern></url-pattern>
        </web-resource-collection>


in servlet:
    try {
         if(notLoggedOn {
         resp.sendRedirect("/logon");
         }
     } set ? on response resp.setHeader ?
     return
    </security-constraint>
    <login-config>
    <auth-method>POST</auth-method>
    <form-login-config>
        <form-login-page>/login.jsp</form-login-page>
        <form-error-page>/login-error.jsp</form-error-page>
    </form-login-config>
</login-config>