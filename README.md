Spring Security Role-Based Authentication — Simple Demo

This is a simple Spring Boot + Spring Security application demonstrating:

In-memory users

Role-based URL protection

Default login page

USER vs ADMIN access levels


In browser 
http://localhost:1212/login  or  http://localhost:1212/public   ->(for all users no login required)

http://localhost:1212/secure   ->(for users with user username and password)

before moving to admin login we should logout from user so redirect to -->http://localhost:1212/logout

http://localhost:1212/admin   ->(for admin login)

