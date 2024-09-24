package eu.tutorials.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(icon = R.drawable.baseline_format_list_bulleted_24, name = "Playlist"),
    Lib(icon = R.drawable.baseline_person_24, name = "Artists"),
    Lib(icon = R.drawable.baseline_album_24, name = "Album"),
    Lib(icon = R.drawable.baseline_music_note_24, name = "Songs"),
    Lib(icon = R.drawable.baseline_library_music_24, name = "Genre")
)