package com.emrehancetin.top30kdramas.adapter
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emrehancetin.top30kdramas.DetailActivity
import com.emrehancetin.top30kdramas.MySingleton
import com.emrehancetin.top30kdramas.databinding.RecyclerRowBinding
import com.emrehancetin.top30kdramas.model.Drama
class DramaAdapter(val dramaList:ArrayList<Drama>):RecyclerView.Adapter<DramaAdapter.DramaViewHolder>() {
    class DramaViewHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DramaViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DramaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dramaList.size
    }

    override fun onBindViewHolder(holder: DramaViewHolder, position: Int) {
        holder.binding.name1.text ="#" +dramaList[position].rank + " " +dramaList[position].name
        holder.binding.image1.setImageResource(dramaList[position].image)


        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)

            MySingleton.choosenDrama = dramaList[position]

            holder.itemView.context.startActivity(intent)
        }
    }
}