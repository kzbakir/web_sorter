package org.studwork.sort.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

public class MainAction implements BaseAction {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String textArea = request.getParameter("textarea");
        int[] numbers = Arrays.stream(textArea.split(",")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        session.setAttribute("array",numbers);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
