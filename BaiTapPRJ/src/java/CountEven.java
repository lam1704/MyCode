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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/count"})
public class CountEven extends HttpServlet {

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
            out.println("<title>Servlet CountEven</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CountEven at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        List<Integer> prime = new ArrayList<>();
        try {
            int number = Integer.parseInt(request.getParameter("number"));
            if (number % 2 == 1) {
                throw new Exception("You must input an even number");
            } else {
                prime = findPrime(number);
                int sum = 0;
                for (int i : prime) {
                    if (i != number) {
                        sum++;
                    }
                }
                out.print(sum);
            }
        } catch (Exception e) {
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("MyExam.jsp").forward(request, response);
        }
    }

    public static List<Integer> addNumber(int n) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            number.add(i + 1);
        }
        return number;
    }

    public static List<Integer> findPrime(int n) {
        List<Integer> number = new ArrayList<>();
        int row = (int) Math.sqrt(n) + 1;
        List<Integer> removeNumber = new ArrayList<>();
        number = addNumber(n);
        for (int i = 2; i <= row; i++) {
            for (int j : number) {
                if (j % i == 0 && j > i) {
                    removeNumber.add(j);
                }
            }
        }
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            for (int j : removeNumber) {
                if (i == j) {
                    iterator.remove();
                    break;
                }
            }
        }
        number.remove(0);
        number.remove(1);
        return number;
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
