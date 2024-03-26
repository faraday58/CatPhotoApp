package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.data.CatPhotoRespository
import com.mexiti.catphotoapp.model.CatPhoto

class FakeNetworkCatPhotoRepository: CatPhotoRespository  {
    override suspend fun getCatPhotos(): List<CatPhoto> {
        return FakeDataSource.photoList
    }
}