package com.geeksforless.tfedorenko.taskservletsgfl;

import java.io.*;

import com.geeksforless.tfedorenko.taskservletsgfl.beans.CalculateFunction;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "calculateServlet", value = {"/calculate-servlet", "/calculate"})
public class MainServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Calculate Function";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double x = Double.parseDouble(request.getParameter("x"));
        CalculateFunction calculateFunction =new CalculateFunction(x);
        request.setAttribute("calculate",calculateFunction);
        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }

    public void destroy() {
    }
}