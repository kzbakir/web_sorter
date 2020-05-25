package org.studwork.sort.controller;

import org.studwork.sort.action.BaseAction;
import org.studwork.sort.factory.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getAction(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getAction(request, response);
    }

    private void getAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            BaseAction baseAction = ActionFactory.getActionFactory().getAction(request);
            if (baseAction != null) {
                baseAction.execute(request, response);
            } else {
                //todo
            }
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

}
