package com.example.trendyolclone

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolclone.databinding.CardTasarimBinding

class UrunlerAdapter(var mContext: Context,var UrunlerListesi:List<Urunler>):RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim=tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater =LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
    val urun =UrunlerListesi.get(position)
        val t =holder.tasarim
        t.imageUrunResim.setImageResource(mContext.resources.getIdentifier(urun.urunResim,"drawable",mContext.packageName))
        t.txtUrunAdi.text=urun.urunAdi
        t.txtUrunAciklama.text =urun.UrunAciklama
        t.txtAciklama2.text =urun.urunAciklama2
        t.star1.setImageResource(mContext.resources.getIdentifier(urun.urunYildzi,"drawable",mContext.packageName))
        t.txtUrunDeger.text=urun.urunDeger


    }

    override fun getItemCount(): Int {
       return UrunlerListesi.size
    }
}