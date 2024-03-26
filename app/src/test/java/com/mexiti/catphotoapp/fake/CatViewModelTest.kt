package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.fake.rules.TestDispatcherRule
import com.mexiti.catphotoapp.viewmodel.CatUiState
import com.mexiti.catphotoapp.viewmodel.CatViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class CatViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun catViewModel_getCatPhotos_verifyCatUiStateSuccess(){
        runTest {
            val catViewModel = CatViewModel(
                catPhotoRepository = FakeNetworkCatPhotoRepository()
            )
            assertEquals(CatUiState.Success(FakeDataSource.photoList),catViewModel.catUiState)
        }
    }

}