package com.example.calendar;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class CalendarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        LocalDate d = LocalDate.now();
        String month = d.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int year = d.getYear();

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Calendar</h2>");
        resp.getWriter().println("<p>" + month + " " + year + "</p>");
    }
}
