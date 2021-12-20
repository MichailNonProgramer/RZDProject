package hotelService.imageService

import models.hotel.HotelImages

interface IHotelImageService {
    fun getImages(hotelIds: List<Long>) : Map<Long, HotelImages>
}