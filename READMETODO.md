# FunForFido
This is the start of my enterprise java project

### Hi


- [ ] It is possible to bind and connect to localhost:8080 at the same time - 
    application server will probably compete with some other software on the port ( command to find this out ? )
- [ ] Look into how authenication works, tie memebr id into username or list all info in member,
    can I copy from exercise ?

- [ ] figure out servlet parameters and pass them into map
 
 
    <security-constraint>
        <web-resource-collection>
            <web-resource-name>administrator</web-resource-name>
        <url-pattern></url-pattern>
        </web-resource-collection>

    </security-constraint>
    <login-config>
    <auth-method>POST</auth-method>
    <form-login-config>
        <form-login-page>/login.jsp</form-login-page>
        <form-error-page>/login-error.jsp</form-error-page>
    </form-login-config>
</login-config>