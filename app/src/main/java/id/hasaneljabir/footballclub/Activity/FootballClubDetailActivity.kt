/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footballclub.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.hasaneljabir.footballclub.Model.FootballClubItem
import id.hasaneljabir.footballclub.UI.FootballClubDetailActivityUI
import org.jetbrains.anko.setContentView

class FootballClubDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intentExtra = intent.getParcelableExtra<FootballClubItem>(FootballClubDetailActivityUI.intentExtra)
        FootballClubDetailActivityUI(intentExtra).setContentView(this)
    }
}