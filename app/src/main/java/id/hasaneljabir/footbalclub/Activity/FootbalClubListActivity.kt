/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footbalclub.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import id.hasaneljabir.footbalclub.Adapter.FootballClubAdapter
import id.hasaneljabir.footbalclub.Model.FootballClubItem
import id.hasaneljabir.footbalclub.R
import kotlinx.android.synthetic.main.activity_footbal_club_list.*

class FootbalClubListActivity : AppCompatActivity() {
    private var footballClubItems: MutableList<FootballClubItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_footbal_club_list)

        initData()

        rvFootballClubList.layoutManager = LinearLayoutManager(this)
        rvFootballClubList.adapter = FootballClubAdapter(this, footballClubItems) {
            val intent = Intent(this, FootbalClubDetailActivity::class.java)
            intent.putExtra("logo", it.logo)
            intent.putExtra("name", it.name)
            intent.putExtra("description", it.description)
            startActivity(intent)
        }
    }

    private fun initData() {
        val logo = resources.obtainTypedArray(R.array.football_club_logo)
        val name = resources.getStringArray(R.array.football_club_name)
        val description = resources.getStringArray(R.array.football_club_description)
        footballClubItems.clear()
        for (i in name.indices) {
            footballClubItems.add(FootballClubItem(logo.getResourceId(i, 0), name[i], description[i]))
        }

        logo.recycle()
    }
}