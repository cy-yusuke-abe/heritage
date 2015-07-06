package heritage.controller

import javax.servlet.annotation.WebServlet
import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}

import heritage.service.ListingImagesService

@WebServlet(Array("/images"))
class GetImages extends HttpServlet {

  override def doGet(request:HttpServletRequest, response:HttpServletResponse) = {

    val images = new ListingImagesService().images

    response.getWriter.println(s"$images")
  }


}
