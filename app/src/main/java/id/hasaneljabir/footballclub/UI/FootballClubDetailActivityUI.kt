package id.hasaneljabir.footballclub.UI

import android.os.Build
import android.support.annotation.RequiresApi
import android.view.Gravity
import android.widget.LinearLayout
import id.hasaneljabir.footballclub.Activity.FootballClubDetailActivity
import org.jetbrains.anko.*

class FootballClubDetailActivityUI : AnkoComponent<FootballClubDetailActivity> {
    companion object {
        val imgFootballClubLogo = 1
        val txtFootballClubName = 2
        val txtFootballClubDescription = 2
        val intentExtra = "intent_extra"
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<FootballClubDetailActivity>) = with(ui){
        linearLayout {
            orientation = LinearLayout.VERTICAL
            lparams(matchParent, matchParent)

            imageView {
                id = imgFootballClubLogo
                padding = dip(10)
                this@linearLayout.gravity = Gravity.CENTER_HORIZONTAL
            }.lparams(dip(80), dip(80))

            textView {
                id = txtFootballClubName
                textSize = sp(10).toFloat()
                gravity = Gravity.CENTER_HORIZONTAL
                padding = dip(10)
            }

            textView {
                id = txtFootballClubDescription
                padding = dip(10)
            }

        }
    }
}