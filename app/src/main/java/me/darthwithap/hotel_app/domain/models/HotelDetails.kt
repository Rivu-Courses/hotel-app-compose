package me.darthwithap.hotel_app.domain.models

import me.darthwithap.hotel_app.domain.values.AmenityIconResId

data class HotelDetails(
  val hotel: Hotel,
  val description: String,
  val images: List<String>,
  val hotelInformation: HotelInformation,
  val features: List<Amenity>,
  val reviews: List<Review>,
  val rooms: List<Room>,
  val roomTypes: List<RoomType>,
  val topSpots: List<TopSpot>,
  val bookedDates: List<String>
) {

  data class HotelInformation(
    val numberOfBedrooms: Int,
    val numberOfBathrooms: Int,
    val squareMeters: Int
  )
}

data class Room(
  val basePrice: Double,
  val roomType: RoomType,
  val thumbnailImage: String,
  val images: List<String>
)

data class Amenity(
  val amenity: String,
  val description: String,
  val iconId: AmenityIconResId
)

data class RoomType(
  val typeName: String,
  val amenities: List<Amenity>,
  val minimumCapacity: Int,
  val maximumCapacity: Int
)

data class TopSpot(
  val title: String,
  val location: Location,
  val placeName: String,
  val pricePerPerson: Double,
  val thumbnailImage: String,
  val isWishlisted: Boolean = false
)