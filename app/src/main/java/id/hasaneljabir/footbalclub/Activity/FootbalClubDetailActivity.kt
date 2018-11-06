/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footbalclub.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import id.hasaneljabir.footbalclub.R
import kotlinx.android.synthetic.main.activity_footbal_club_detail.*

class FootbalClubDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_footbal_club_detail)
        bindViews()
    }

    private fun bindViews() {
        Picasso.get().load(intent.getIntExtra("logo", 0)).into(imgFootballClubLogo)
        txtFootballClubName.text = intent.getStringExtra("name")
        txtFootballClubDescription.text = intent.getStringExtra("description")
    }
}