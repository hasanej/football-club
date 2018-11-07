/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footballclub.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FootballClubItem (val logo: Int, val name: String, val description: String): Parcelable