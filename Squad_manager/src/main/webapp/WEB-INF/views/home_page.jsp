<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Squad Manager</title>
</head>
<body>
<h2>Welcome to Squad Manger</h2>
<div>
<button>Sign in</button><button>Sign up</button>


        <div className="inputs">
            <div className="input">
                <label>
                <input type="UserName" placeholder="Username" 
                name = "username"
               />
                </label>
            </div>
            <div className="input">
                <input type="Password" placeholder="Password" 
                name="password"/>
            </div>

        </div>
        <div className="forget-password">Forget Password? <span> <a href=" ">Click Here</a></span></div>    
            <div className="submit-container">
            <div> 
            <form action="sign_in" method="post"> <button }>Sign Up</button></form><span>
            
              <form action=""> <button  >Sign In</button></form></span>
              </div>
            
                    </div>

</div>
</body>
</html>