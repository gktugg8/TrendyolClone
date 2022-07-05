package com.example.trendyolclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.trendyolclone.databinding.FragmentAnaSayfa2Binding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfa2Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim =FragmentAnaSayfa2Binding.inflate(inflater, container, false)



        tasarim.rv.layoutManager =StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi =ArrayList<Urunler>()

        val u1 =Urunler(1,"Philips","HD123134 Daily Collection ", "Kahve Makinesi","kahve","(88)","star1")
        val u2 =Urunler(2,"Yumoş","Konsantre Çamaşır Yumuşatıcısı ","Hanımeli 1440 Ml 30570092","yumoss","(10)","star2")
        val u3 =Urunler(3,"TeknoClass","Pilates Bandı " ,"Kas Germe Lastiği 1 Adet teknolastik","pilatess","(140)","star1")
        val u4 =Urunler(4,"HomePlus","Çift Kişilik  " ,"Nevresim Takımı","carsaf","(50)","star4")

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)

        val adapter = UrunlerAdapter(requireContext(),urunlerListesi)
        tasarim.rv.adapter=adapter
        return tasarim.root
    }


}