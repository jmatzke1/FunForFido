<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/20/16
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="container">
    <FORM class="text-center" ACTION="j_security_check" METHOD="POST">
        <TABLE>
            <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
            <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
            <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
        </TABLE>
    </FORM>
    <p>Not a member? Click <a href="/addNewMember">here</a> to sign up</p>
</div>

<!-- TODO: check for validation in the database , make unique in database -->
<!-- TODO: maybe change authenication -->