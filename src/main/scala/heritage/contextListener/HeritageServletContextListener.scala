package heritage.contextListener

import javax.servlet.annotation.WebListener
import javax.servlet.{ServletContextEvent, ServletContextListener}

import heritage.configuration.Configuration

@WebListener
class HeritageServletContextListener extends ServletContextListener {

  override def contextInitialized(ctx:ServletContextEvent) = {
    Configuration.setContext(ctx.getServletContext)
  }

  override def contextDestroyed(ctx:ServletContextEvent) = {

  }
}
