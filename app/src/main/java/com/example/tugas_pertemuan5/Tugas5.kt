
package com.example.tugas_pertemuan5

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormBiodata(modifier: Modifier = Modifier) {

    val context = LocalContext.current

    val daftarExp = stringArrayResource(R.array.daftar_experience)

    val daftarSkill = listOf(
        R.string.skill_android,
        R.string.skill_uiux,
        R.string.skill_web
    )

    var textDepan by remember { mutableStateOf("") }
    var textBelakang by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textTgl by remember { mutableStateOf("") }
    var textExp by remember { mutableStateOf("") }

    val skillDipilih = remember { mutableStateListOf<Int>() }

    var tampilDatePicker by remember { mutableStateOf(false) }
    var tampilDropdown by remember { mutableStateOf(false) }

    val datePickerState = rememberDatePickerState()

    val formatTanggal = stringResource(R.string.format_tanggal)
    val zonaWaktu = stringResource(R.string.zona_waktu)

    val bentukField = RoundedCornerShape(
        dimensionResource(R.dimen.radius_field)
    )

    val bentukKartu = RoundedCornerShape(
        topStart = dimensionResource(R.dimen.radius_kartu),
        topEnd = dimensionResource(R.dimen.radius_kartu)
    )


}
