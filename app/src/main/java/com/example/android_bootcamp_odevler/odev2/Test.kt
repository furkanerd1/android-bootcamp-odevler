package com.example.android_bootcamp_odevler.odev2

fun main() {
    // İlk bölüm
    val funcs = FonksiyonlarIlkBolum()
    println("25derece = ${funcs.derecedenFahrenheit(25.0)} fahrenheit")
    println("Kenarları 5 ve 10 olan dikdörtgenin çevresi = ${funcs.dikdortgenCevresi(5, 10)}")
    println("5! = ${funcs.faktoriyel(5)}")
    println("'Ankara' kelimesinde 'a' harfi sayısı = ${funcs.aHarfiSayisi("Ankara")}")

    println("-----------------------")

    // ikinci bölüm
    val funcs2 = FonksiyonlarIkıncıBolum()
    println("5 kenarlı çokgenin iç açıları toplamı = ${funcs2.icAcıToplam(5)} derece")
    println("22 gün çalışan birinin maaşı = ${funcs2.maasHesapla(22)}tl")
    println("65 GB internet kullanım ücreti = ${funcs2.ucretHesapla(65)} tl")
}

