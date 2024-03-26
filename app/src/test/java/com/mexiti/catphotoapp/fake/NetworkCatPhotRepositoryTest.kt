package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.data.NetworkCatPhotoRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Test

class NetworkCatPhotRepositoryTest {
    @Test
    fun networkCatPhotoRepository_getCatPhotos_verifyPhotoList(){
        runTest {
            val repository = NetworkCatPhotoRepository(
                catApiService = FakeCatApiService()
            )
            assertEquals(FakeDataSource.photoList,repository.getCatPhotos())

        }


    }

}