/*
 * <https://www.androhub.com>
 *
 * Copyright (c) 2024 Androhub
 * All rights reserved.
 *
 * Last modified 12/02/24, 2:11 pm
 */

package com.subratsss.networkmodule

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://www.androhub.com/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}