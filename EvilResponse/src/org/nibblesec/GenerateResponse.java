package org.nibblesec;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GenerateResponse extends HttpServlet {
  private static final long serialVersionUID = -8468973522391456197L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    int code = Integer.valueOf(request.getParameter("code"));
    String msg = request.getParameter("message");
    response.sendError(code, msg);
  }
}
