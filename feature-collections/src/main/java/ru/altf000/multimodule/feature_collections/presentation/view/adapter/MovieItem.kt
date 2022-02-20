package ru.altf000.multimodule.feature_collections.presentation.view.adapter

import ru.altf000.multimodule.common_entities.domain.Content
import ru.altf000.multimodule.common_ui.adapterdelegates.DItem

internal data class MovieItem(private val content: Content) : DItem() {
    override val identifier: Int = content.hashCode()
    override val data: Content = content
}