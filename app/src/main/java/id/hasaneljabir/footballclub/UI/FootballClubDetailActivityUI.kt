package id.hasaneljabir.footballclub.UI

import android.os.Build
import android.support.annotation.RequiresApi
import android.view.Gravity
import android.widget.LinearLayout
import com.squareup.picasso.Picasso
import id.hasaneljabir.footballclub.Activity.FootballClubDetailActivity
import id.hasaneljabir.footballclub.Model.FootballClubItem
import org.jetbrains.anko.*

class FootballClubDetailActivityUI(var intentExtra: FootballClubItem) : AnkoComponent<FootballClubDetailActivity> {
    companion object { val intentExtra = "intent_extra" }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<FootballClubDetailActivity>) = with(ui){
        linearLayout {
            orientation = LinearLayout.VERTICAL
            lparams(matchParent, matchParent)

            imageView {
                Picasso.get().load(intentExtra.logo).into(this)
                padding = dip(10)
                this@linearLayout.gravity = Gravity.CENTER_HORIZONTAL
            }.lparams(dip(150), dip(150))

            textView {
                text = intentExtra.name
                textSize = dip(8).toFloat()
                gravity = Gravity.CENTER_HORIZONTAL
                padding = dip(10)
            }

            textView {
                text = intentExtra.description
                padding = dip(10)
            }

        }
    }
}