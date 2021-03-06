package com.worldsnas.domain.mappers.server

import com.worldsnas.domain.model.repomodel.TranslationRepoModel
import com.worldsnas.domain.model.servermodels.TranslationServerModel
import com.worldsnas.panther.Mapper
import javax.inject.Inject

class TranslationServerRepoMapper @Inject constructor(
) : Mapper<TranslationServerModel, TranslationRepoModel> {
    override fun map(item: TranslationServerModel): TranslationRepoModel =
        TranslationRepoModel(
            0,
            item.iso_3166_1,
            item.iso_639_1,
            item.name,
            item.englishName,
            item.data?.title ?: "",
            item.data?.overview ?: "",
            item.data?.homePage ?: ""
        )
}