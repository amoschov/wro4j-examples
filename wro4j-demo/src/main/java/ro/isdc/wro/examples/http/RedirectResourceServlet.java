/**
 * Copyright Alex Objelean
 */
package ro.isdc.wro.examples.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alex Objelean
 */
@SuppressWarnings("serial")
public class RedirectResourceServlet extends HttpServlet {
  /**
   * {@inheritDoc}
   */
  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
    throws ServletException, IOException {
    resp.sendRedirect("http://code.jquery.com/jquery-1.4.2.js");
  }
}
