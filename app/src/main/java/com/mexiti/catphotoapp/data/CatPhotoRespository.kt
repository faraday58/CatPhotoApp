package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.CatPhoto
import com.mexiti.catphotoapp.network.CatApi

interface CatPhotoRespository {
    suspend fun getCatPhotos(): List<CatPhoto>
}

class NetworkCatPhotoRepository: CatPhotoRespository{
    override suspend fun getCatPhotos(): List<CatPhoto> {
        return CatApi.retrofitService.getPhotos()
    }

}

