/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


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
@WebServlet(urlPatterns={"/yourMemberCodeSecondPage"})
public class yourMemberCodeSecondPage extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            out.println("<title>Servlet yourMemberCodeSecondPage</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet yourMemberCodeSecondPage at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String userName = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        if (userName == null || userName.isEmpty()) {
            resp.sendRedirect("/index.html");  
        } else {
            out.println("<html><head><title>Second Page</title></head><body>");
            out.println("<h2>Hello, " + userName + "!</h2>");
            out.println("<form action=\"yourMemberCodeSecondPage\" method=\"post\">");
            out.println("Univerisy: <input type=\"text\" name=\"textInput\"/><br>");
            out.println("Date of : <input type=\"number\" name=\"numberInput\"/><br>");
            out.println("Radio Options:<br>");
            
                out.println("<input type=\"radio\" name=\"radioOptions\" value=\""  + "\"> Freshman "  + "<br>");
                out.println("<input type=\"radio\" name=\"radioOptions\" value=\"" + "\"> Somophore "  + "<br>");
                out.println("<input type=\"radio\" name=\"radioOptions\" value=\"" + "\"> Junior "  + "<br>");
                out.println("<input type=\"radio\" name=\"radioOptions\" value=\"" + "\"> Senior "  + "<br>");

            out.println("Checkbox Options:<br>");
                out.println("<input type=\"checkbox\" name=\"checkboxOptions\" value=\"" + "\"> Option "  + "<br>");
                out.println("<input type=\"checkbox\" name=\"checkboxOptions\" value=\"" + "\"> Option "  + "<br>");
                out.println("<input type=\"checkbox\" name=\"checkboxOptions\" value=\"" + "\"> Option "  + "<br>");
                

            out.println("Date: <input type=\"date\" name=\"dateInput\"/><br>");

            out.println("<input type=\"submit\" value=\"Submit\"/>");
            out.println("<input type=\"submit\" name=\"logout\" value=\"Log out\"/>");

            out.println("</form></body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        if (req.getParameter("logout") != null) {
            resp.sendRedirect("yourMemberCode.jsp");  // Redirect to the login page if "Log out" is pressed
        } else {
            out.println("<html><head><title>Submitted Information</title></head><body>");
            out.println("<h2>Submitted Information:</h2>");

            out.println("Text: " + req.getParameter("textInput") + "<br>");
            out.println("Number: " + req.getParameter("numberInput") + "<br>");

            out.println("Selected Radio Option: " + req.getParameter("radioOptions") + "<br>");

            // Retrieve and display selected checkbox options
            String[] checkboxOptions = req.getParameterValues("checkboxOptions");
            if (checkboxOptions != null) {
                out.println("Selected Checkbox Options: " + String.join(", ", checkboxOptions) + "<br>");
            }

            out.println("Date: " + req.getParameter("dateInput") + "<br>");

            out.println("</body></html>");
        }
    }
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
