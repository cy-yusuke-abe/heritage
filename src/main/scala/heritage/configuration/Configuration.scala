package heritage.configuration

import javax.servlet.ServletContext

import com.typesafe.config.{Config, ConfigFactory}


object Configuration {

  var context:ServletContext = null

  def setContext(context:ServletContext) = {
    this.context = context
  }

  /**
   * get configuration
   * @param configFileName base file name of configuration
   * @return Config
   */
  def load(configFileName:String):Config = {
    ConfigFactory.load("conf/" + configFileName)
  }

}
