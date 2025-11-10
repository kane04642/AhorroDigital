package com.bcs.simulador.servidor;

import static spark.Spark.*;

public class LocalAuthServer {
    public static void main(String[] args) {
        port(4567);
        staticFiles.location("/public");

        get("/login", (req, res) -> {
            res.type("text/html");
            return "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "    <title>Login</title>" +
                    "</head>" +
                    "<body>" +
                    "    <h1>Login</h1>" +
                    "    <form action='/login' method='post'>" +
                    "        <div>" +
                    "            <label>Username:</label>" +
                    "            <input type='text' name='username' required>" +
                    "        </div>" +
                    "        <div>" +
                    "            <label>Password:</label>" +
                    "            <input type='password' name='password' required>" +
                    "        </div>" +
                    "        <button type='submit'>Login</button>" +
                    "    </form>" +
                    "    <p>Don't have an account? <a href='/register'>Register here</a></p>" +
                    "</body>" +
                    "</html>";
        });

        get("/register", (req, res) -> {
            res.type("text/html");
            return "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "    <title>Register</title>" +
                    "</head>" +
                    "<body>" +
                    "    <h1>Register</h1>" +
                    "    <form action='/register' method='post'>" +
                    "        <div>" +
                    "            <label>Username:</label>" +
                    "            <input type='text' name='username' required>" +
                    "        </div>" +
                    "        <div>" +
                    "            <label>Email:</label>" +
                    "            <input type='email' name='email' required>" +
                    "        </div>" +
                    "        <div>" +
                    "            <label>Password:</label>" +
                    "            <input type='password' name='password' required>" +
                    "        </div>" +
                    "        <div>" +
                    "            <label>Confirm Password:</label>" +
                    "            <input type='password' name='confirm_password' required>" +
                    "        </div>" +
                    "        <button type='submit'>Register</button>" +
                    "    </form>" +
                    "    <p>Already have an account? <a href='/login'>Login here</a></p>" +
                    "</body>" +
                    "</html>";
        });

        post("/login", (req, res) -> {
            // Lógica simple de validación
            String username = req.queryParams("username");
            String password = req.queryParams("password");

            if ("testuser".equals(username) && "Test1234".equals(password)) {
                return "<h1>Login Successful</h1><p>Welcome, " + username + "</p>";
            } else {
                return "<h1>Login Failed</h1><p>Invalid credentials</p><a href='/login'>Try again</a>";
            }
        });

        post("/register", (req, res) -> {
            // Lógica simple de validación
            String username = req.queryParams("username");
            String email = req.queryParams("email");
            String password = req.queryParams("password");
            String confirm = req.queryParams("confirm_password");

            if (!password.equals(confirm)) {
                return "<h1>Registration Failed</h1><p>Passwords don't match</p><a href='/register'>Try again</a>";
            }

            return "<h1>Registration Successful</h1><p>Account created for " + username + "</p><a href='/login'>Login now</a>";
        });
    }
}
