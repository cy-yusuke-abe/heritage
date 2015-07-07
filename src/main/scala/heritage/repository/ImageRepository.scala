package heritage.repository

import java.io.File
import javax.servlet.http.HttpServlet

import com.typesafe.config.{ConfigFactory, Config}
import heritage.configuration.Configuration
import org.basex.api.client.{Query, ClientSession}

class ImageRepository {

  lazy val config = Configuration.load("database")

  def find(name:String) = {
    // not implemented yet
  }

  def all:String = {
    query { session =>
      session.query("image").execute()
    }
  }

  private def createSession():ClientSession = {
    val session = new ClientSession(
      config.getString("basex.host"),
      config.getInt("basex.port"),
      config.getString("basex.username"),
      config.getString("basex.password")
    )
    session.execute("open TestDB")
    session
  }

  private def closeSession(session:ClientSession) = {
    session.close()
  }

  /**
   * @param f  closure for query
   * @tparam A result
   * @return
   */
  private def query[A](f:(ClientSession) => A):A = {
    val session = createSession()
    try {
      f(session)
    }
    finally {
      closeSession(session)
    }
  }

}
