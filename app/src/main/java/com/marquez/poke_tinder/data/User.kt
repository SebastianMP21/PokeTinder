package com.marquez.poke_tinder.data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marquez.poke_tinder.R
import java.io.Serializable

data class User(
        val id: String,
        val name: String,
        val email: String,
        val password: String
    ) : Serializable {
        fun getImage() = "https://graph.facebook.com/$id/picture?type=large&width=720&height=720"
    }
