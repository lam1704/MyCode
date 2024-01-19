/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/yourMemberCodeFirstPage"})
public class yourMemberCodeFirstPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet yourMemberCodeFirstPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet yourMemberCodeFirstPage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String user = req.getParameter("user");
        String code = req.getParameter("validation");
        String age = req.getParameter("age");
        if (user == null || code == null || age == null) {
            resp.getWriter().println("Please provide all required information.");
            return;
        }

        ServletContext context = getServletContext();
        int minAge = 16;
        int maxAge = 65;
        String validationCode = "a";

        try {
            int userAge = Integer.parseInt(age);

            if (user.isEmpty()) {
                resp.getWriter().println("You must provide a name.");
            } else if (!code.equals(validationCode)) {
                resp.getWriter().println("The validation code is not correct.");
            } else if (userAge < minAge || userAge > maxAge) {
                resp.getWriter().println("You cannot use this site. Please input again.");
            } else {
                resp.sendRedirect("yourMemberCodeSecondPage?name=" + user + "&page=firstPage");
            }
        } catch (NumberFormatException e) {
            resp.getWriter().println("Invalid age format. Please input a valid number.");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
