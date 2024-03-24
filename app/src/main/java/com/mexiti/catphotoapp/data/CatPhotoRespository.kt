package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.CatPhoto
import com.mexiti.catphotoapp.network.CatApiService

interface CatPhotoRespository {
    suspend fun getCatPhotos(): List<CatPhoto>
}

class NetworkCatPhotoRepository(
    private val catApiService: CatApiService
): CatPhotoRespository{
    override suspend fun getCatPhotos(): List<CatPhoto> = catApiService.getPhotos()

}

