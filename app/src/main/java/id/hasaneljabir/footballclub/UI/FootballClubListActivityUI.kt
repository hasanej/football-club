/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footballclub.UI

import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import id.hasaneljabir.footballclub.Activity.FootballClubDetailActivity
import id.hasaneljabir.footballclub.Activity.FootballClubListActivity
import id.hasaneljabir.footballclub.Adapter.FootballClubAdapter
import id.hasaneljabir.footballclub.Model.FootballClubItem
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class FootballClubListActivityUI(var footballClubItem : MutableList<FootballClubItem>) : AnkoComponent<FootballClubListActivity> {
    override fun createView(ui: AnkoContext<FootballClubListActivity>) = with(ui) {
        verticalLayout {
            lparams(matchParent, matchParent)
            orientation = LinearLayout.VERTICAL

            recyclerView {
                lparams(matchParent, matchParent)
                layoutManager = LinearLayoutManager(context)
                adapter = FootballClubAdapter(footballClubItem){
                    startActivity<FootballClubDetailActivity>(FootballClubDetailActivityUI.intentExtra to it)
                }
            }

        }
    }
}