/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footballclub.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import id.hasaneljabir.footballclub.Model.FootballClubItem
import id.hasaneljabir.footballclub.UI.FootballClubItemUI
import kotlinx.android.extensions.LayoutContainer
import org.jetbrains.anko.AnkoContext

class FootballClubAdapter(private val footballClubItem: List<FootballClubItem>, private val listener: (FootballClubItem) -> Unit)
    : RecyclerView.Adapter<FootballClubAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(FootballClubItemUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(footballClubItem[position], listener)
    }

    override fun getItemCount(): Int = footballClubItem.size

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        var imgFootballClubLogo : ImageView
        var txtFootballClubName : TextView

        init {
            imgFootballClubLogo = itemView.findViewById(FootballClubItemUI.imgFootballClubLogo)
            txtFootballClubName = itemView.findViewById(FootballClubItemUI.txtFootballClubName)
        }

        fun bindItem(footballClubItem: FootballClubItem, listener: (FootballClubItem) -> Unit) {
            footballClubItem.logo?.let { Picasso.get().load(it).into(imgFootballClubLogo) }
            txtFootballClubName.text = footballClubItem.name

            itemView.setOnClickListener { listener(footballClubItem) }
        }
    }
}