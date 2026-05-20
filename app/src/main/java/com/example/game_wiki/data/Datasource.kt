package com.example.game_wiki.data

import com.example.game_wiki.R
import com.example.game_wiki.model.Game

class Datasource {
    fun loadGameList(): List<Game> {
        return listOf(
            Game(
                titleResourceId = R.string.game1,
                descriptionResourceId = R.string.game1_description,
                imageResourceId = R.drawable.game1
            ),
            Game(
                titleResourceId = R.string.game2,
                descriptionResourceId = R.string.game2_description,
                imageResourceId = R.drawable.game2
            ),
            Game(
                titleResourceId = R.string.game3,
                descriptionResourceId = R.string.game3_description,
                imageResourceId = R.drawable.game3
            ),
            Game(
                titleResourceId = R.string.game4,
                descriptionResourceId = R.string.game4_description,
                imageResourceId = R.drawable.game4
            ),
            Game(
                titleResourceId = R.string.game5,
                descriptionResourceId = R.string.game5_description,
                imageResourceId = R.drawable.game5
            )
        )
    }
}