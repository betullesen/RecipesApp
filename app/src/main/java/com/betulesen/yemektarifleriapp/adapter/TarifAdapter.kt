package com.betulesen.yemektarifleriapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.betulesen.yemektarifleriapp.databinding.ReycylerRowBinding
import com.betulesen.yemektarifleriapp.model.Tarif
import com.betulesen.yemektarifleriapp.view.ListeFragmentDirections

class TarifAdapter(val tarifListesi : List<Tarif>) : RecyclerView.Adapter<TarifAdapter.TarifHolder>() {

    class TarifHolder(val binding : ReycylerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarifHolder {
        var recyclerRowBinding = ReycylerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TarifHolder(recyclerRowBinding)
    }

    override fun getItemCount(): Int {
        return tarifListesi.size
    }

    override fun onBindViewHolder(holder: TarifHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = tarifListesi[position].isim
        holder.itemView.setOnClickListener{
            val action = ListeFragmentDirections.actionListeFragment2ToTarifFragment(bilgi = "eski",id=tarifListesi[position].id)
            Navigation.findNavController(it).navigate(action)
        }
    }
}