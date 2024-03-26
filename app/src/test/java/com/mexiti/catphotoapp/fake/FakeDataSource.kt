package com.mexiti.catphotoapp.fake

import com.mexiti.catphotoapp.model.CatPhoto

object FakeDataSource{
    const val idOne = "idCat1"
    const val idTwo = "idCat2"
    const val imgOne = "url.1"
    const val imgTwo = "url.2"
    const val widthOne = 225
    const val heigtOne = 225
    const val widthTwo = 125
    const val heightTwo = 125


    val photoList = listOf(
        CatPhoto(
            idOne,
            imgOne,
            widthOne,
            heightTwo
        ),
        CatPhoto(idTwo,
            imgTwo,
            widthTwo,
            heightTwo)
    )
}