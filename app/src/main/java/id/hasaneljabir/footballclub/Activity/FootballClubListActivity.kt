/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footballclub.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.hasaneljabir.footballclub.Model.FootballClubItem
import id.hasaneljabir.footballclub.UI.FootballClubListActivityUI
import org.jetbrains.anko.setContentView
import id.hasaneljabir.footballclub.R

class FootballClubListActivity : AppCompatActivity() {
    var footballClubItem : MutableList<FootballClubItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FootballClubListActivityUI(footballClubItem).setContentView(this)
        initData()
    }

    private fun initData() {
        val logo = resources.obtainTypedArray(R.array.football_club_logo)
        val name = resources.getStringArray(R.array.football_club_name)
        val description = resources.getStringArray(R.array.football_club_description)
        footballClubItem.clear()

        for (i in name.indices){
            footballClubItem.add(FootballClubItem(logo.getResourceId(i, 0), name[i], description[i]))
        }

        logo.recycle()
    }
}