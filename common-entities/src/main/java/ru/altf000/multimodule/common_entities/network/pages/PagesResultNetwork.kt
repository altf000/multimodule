package ru.altf000.multimodule.common_entities.network.pages

import com.google.gson.annotations.SerializedName

data class PagesResultNetwork(
    @SerializedName("result") val result: PageNetwork? = null
)
