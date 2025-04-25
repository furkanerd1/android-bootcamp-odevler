package com.example.android_bootcamp_odevler.odev2

class FonksiyonlarIkıncıBolum {

    fun icAcıToplam(kenarSayisi:Int):Int{
        return (kenarSayisi-2)*180
    }

    fun maasHesapla(gunSayisi:Int):Int{
        val calisilanSaat = gunSayisi * 8
        var maas = 0

        if (calisilanSaat > 160) {
            val mesaiSaat = calisilanSaat - 160
            maas = 160 * 10 + mesaiSaat * 20
        } else {
            maas = calisilanSaat * 10
        }
        return maas
    }

    fun ucretHesapla(kotaMiktari:Int): Int{
        val temelKota = 50
        val temelUcret = 100
        val asimMiktari = maxOf(kotaMiktari - temelKota, 0)
        return temelUcret + (asimMiktari * 4)
    }
}