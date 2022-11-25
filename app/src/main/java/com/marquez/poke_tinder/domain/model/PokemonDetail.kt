package com.marquez.poke_tinder.domain.model

import com.marquez.poke_tinder.data.model.*

data class PokemonDetail(
    val id: Int,
    val base_experience: Int,
    val height: Int,
    val weight: Int,
    val stats: List<Stats>,
    val types: List<Types>,
    val abilities: List<Abilities>
) {
    fun PokemonDetailModel.ToDomain() = PokemonDetail(
        id = id,
        base_experience = base_experience,
        height = height,
        weight = weight,
        stats = stats,
        types = types,
        abilities = abilities
    )
}