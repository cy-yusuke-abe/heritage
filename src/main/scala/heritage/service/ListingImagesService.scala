package heritage.service

import heritage.repository.ImageRepository
import org.basex.api.client.ClientSession

class ListingImagesService {

  def images = {
    val repo = new ImageRepository()

    repo.all
  }

}
