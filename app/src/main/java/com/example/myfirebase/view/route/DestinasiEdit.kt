package com.example.myfirebase.view.route

import com.example.myfirebase.R

object DestinasiEdit : Destinasi Navigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}
