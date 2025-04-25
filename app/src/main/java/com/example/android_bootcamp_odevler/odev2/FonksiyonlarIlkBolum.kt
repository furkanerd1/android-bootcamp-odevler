package com.example.android_bootcamp_odevler.odev2

class FonksiyonlarIlkBolum {

    fun derecedenFahrenheit(derece:Double):Double{
       return derece*1.8 +32
    }

    fun dikdortgenCevresi(uzunKenar:Int , kısaKenar:Int) : Int{
        return  2 * (uzunKenar + kısaKenar)
    }

    fun faktoriyel(sayi:Int) :Long{
        var fak:Long=1
        for (i in 1..sayi){
            fak *= i
        }
        return fak
    }

    fun aHarfiSayisi(kelime:String) : Int{
        var miktar=kelime.count { it=='A' || it=='a'}
        return miktar
    }
}