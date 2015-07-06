package heritage.controller

import javax.servlet.annotation.WebServlet
import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}



@WebServlet(Array("/upload"))
class UploadImages extends HttpServlet {

  override def doPost(request:HttpServletRequest, response:HttpServletResponse) = {

  }

}
