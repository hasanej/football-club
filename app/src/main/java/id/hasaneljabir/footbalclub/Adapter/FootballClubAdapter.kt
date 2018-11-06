/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footbalclub.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import id.hasaneljabir.footbalclub.Model.FootballClubItem
import id.hasaneljabir.footbalclub.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_football_club.*
import kotlinx.android.synthetic.main.item_football_club.view.*

class FootballClubAdapter(private val context: Context, private val footballClubItems: List<FootballClubItem>,
                          private val listener: (FootballClubItem) -> Unit)
    : RecyclerView.Adapter<FootballClubAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_football_club, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(footballClubItems[position], listener)
    }

    override fun getItemCount(): Int = footballClubItems.size

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer {
        fun bindItem(footballClubItems: FootballClubItem, listener: (FootballClubItem) -> Unit) {
            footballClubItems.logo?.let { Picasso.get().load(it).into(imgFootballClubLogo) }
            itemView.txtFootballClubName.text = footballClubItems.name

            itemView.setOnClickListener { listener(footballClubItems) }
        }
    }
}