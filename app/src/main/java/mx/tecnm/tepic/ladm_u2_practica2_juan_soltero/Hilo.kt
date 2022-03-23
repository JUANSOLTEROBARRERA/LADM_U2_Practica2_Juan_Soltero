package mx.tecnm.tepic.ladm_u2_practica2_juan_soltero

import android.media.MediaPlayer
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Hilo(este:MainActivity, baraja:List<Carta>) : Thread(){
    private var ejecutar = true
    private var pausar = false
    var contador = 0
    val este = este
    val baraja = baraja
    override fun run() {
        super.run()
        while(ejecutar){
            if(!pausar){
                contador++
                if(contador!=54){
                este.runOnUiThread {
                    este.contador--
                    este.findViewById<TextView>(R.id.nomcarta).setText(baraja[contador].nombre)
                    if(baraja[contador].nombre.equals("El Gallo")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta1)
                    //var audio1: MediaPlayer = este.dameaudio()
                        este.dameaudio(1).start()}
                    if(baraja[contador].nombre.equals("El Diablito")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta2)
                        este.dameaudio(2).start()}
                    if(baraja[contador].nombre.equals("La Dama")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta3)
                        este.dameaudio(3).start()}
                    if(baraja[contador].nombre.equals("El Catrin")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta4)
                        este.dameaudio(4).start()}
                    if(baraja[contador].nombre.equals("El Paraguas")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta5)
                        este.dameaudio(5).start()}
                    if(baraja[contador].nombre.equals("La Sirena")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta6)
                        este.dameaudio(6).start()}
                    if(baraja[contador].nombre.equals("La Escalera")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta7)
                        este.dameaudio(7).start()}
                    if(baraja[contador].nombre.equals("La Botella")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta8)
                        este.dameaudio(8).start()}
                    if(baraja[contador].nombre.equals("El Barril")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta9)
                        este.dameaudio(9).start()}
                    if(baraja[contador].nombre.equals("El Árbol")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta10)
                        este.dameaudio(10).start()}
                    if(baraja[contador].nombre.equals("El Melón")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta11)
                        este.dameaudio(11).start()}
                    if(baraja[contador].nombre.equals("El Valiente")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta12)
                        este.dameaudio(12).start()}
                    if(baraja[contador].nombre.equals("El Gorrito")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta13)
                        este.dameaudio(13).start()}
                    if(baraja[contador].nombre.equals("La Muerte")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta14)
                        este.dameaudio(14).start()}
                    if(baraja[contador].nombre.equals("La Pera")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta15)
                        este.dameaudio(15).start()}
                    if(baraja[contador].nombre.equals("La Bandera")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta16)
                        este.dameaudio(16).start()}
                    if(baraja[contador].nombre.equals("El Bandolón")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta17)
                        este.dameaudio(17).start()}
                    if(baraja[contador].nombre.equals("El Violoncello")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta18)
                        este.dameaudio(18).start()}
                    if(baraja[contador].nombre.equals("La Garza")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta19)
                        este.dameaudio(19).start()}
                    if(baraja[contador].nombre.equals("El Pajaro")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta20)
                        este.dameaudio(20).start()}
                    if(baraja[contador].nombre.equals("La Mano")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta21)
                        este.dameaudio(21).start()}
                    if(baraja[contador].nombre.equals("La Bota")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta22)
                        este.dameaudio(22).start()}
                    if(baraja[contador].nombre.equals("La Luna")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta23)
                        este.dameaudio(23).start()}
                    if(baraja[contador].nombre.equals("El Cotorro")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta24)
                        este.dameaudio(24).start()}
                    if(baraja[contador].nombre.equals("El Borracho")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta25)
                        este.dameaudio(25).start()}
                    if(baraja[contador].nombre.equals("El Negrito")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta26)
                        este.dameaudio(26).start()}
                    if(baraja[contador].nombre.equals("El Corazón")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta27)
                        este.dameaudio(27).start()}
                    if(baraja[contador].nombre.equals("La Sandía")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta28)
                        este.dameaudio(28).start()}
                    if(baraja[contador].nombre.equals("El Tambor")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta29)
                        este.dameaudio(29).start()}
                    if(baraja[contador].nombre.equals("El Camarón")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta30)
                        este.dameaudio(30).start()}
                    if(baraja[contador].nombre.equals("Las Jaras")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta31)
                        este.dameaudio(31).start()}
                    if(baraja[contador].nombre.equals("El Músico")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta32)
                        este.dameaudio(32).start()}
                    if(baraja[contador].nombre.equals("La Araña")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta33)
                        este.dameaudio(33).start()}
                    if(baraja[contador].nombre.equals("El Soldado")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta34)
                        este.dameaudio(34).start()}
                    if(baraja[contador].nombre.equals("La Estrella")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta35)
                        este.dameaudio(35).start()}
                    if(baraja[contador].nombre.equals("El Cazo")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta36)
                        este.dameaudio(36).start()}
                    if(baraja[contador].nombre.equals("El Mundo")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta37)
                        este.dameaudio(37).start()}
                    if(baraja[contador].nombre.equals("El Apache")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta38)
                        este.dameaudio(38).start()}
                    if(baraja[contador].nombre.equals("El Nopal")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta39)
                        este.dameaudio(39).start()}
                    if(baraja[contador].nombre.equals("El Alacran")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta40)
                        este.dameaudio(40).start()}
                    if(baraja[contador].nombre.equals("La Rosa")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta41)
                        este.dameaudio(41).start()}
                    if(baraja[contador].nombre.equals("La Calavera")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta42)
                        este.dameaudio(42).start()}
                    if(baraja[contador].nombre.equals("La Campana")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta43)
                        este.dameaudio(43).start()}
                    if(baraja[contador].nombre.equals("El Cantarito")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta44)
                        este.dameaudio(44).start()}
                    if(baraja[contador].nombre.equals("El Venado")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta45)
                        este.dameaudio(45).start()}
                    if(baraja[contador].nombre.equals("El Sol")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta46)
                        este.dameaudio(46).start()}
                    if(baraja[contador].nombre.equals("La Corona")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta47)
                        este.dameaudio(47).start()}
                    if(baraja[contador].nombre.equals("La Chalupa")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta48)
                        este.dameaudio(48).start()}
                    if(baraja[contador].nombre.equals("El Pino")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta49)
                        este.dameaudio(49).start()}
                    if(baraja[contador].nombre.equals("El Pescado")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta50)
                        este.dameaudio(50).start()}
                    if(baraja[contador].nombre.equals("La Palma")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta51)
                        este.dameaudio(51).start()}
                    if(baraja[contador].nombre.equals("La Maceta")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta52)
                        este.dameaudio(52).start()}
                    if(baraja[contador].nombre.equals("El Arpa")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta53)
                        este.dameaudio(53).start()}
                    if(baraja[contador].nombre.equals("La Rana")){este.findViewById<ImageView>(R.id.cartaimg).setImageResource(R.drawable.carta54)
                        este.dameaudio(54).start()}
                //println(este.cartas[it].nombre)
                }
                }else{
                    pausar=true
                    este.runOnUiThread {
                        este.findViewById<TextView>(R.id.nomcarta).setText("El juego ha terminado.")
                        este.findViewById<ImageView>(R.id.cartaimg).visibility = View.GONE
                        este.findViewById<Button>(R.id.suspender).visibility = View.GONE
                        este.findViewById<Button>(R.id.terminar).visibility = View.VISIBLE
                        este.findViewById<TextView>(R.id.restantes).visibility = View.GONE
                    }
                }
                sleep(3000)

            }
        }
    }
    fun terminarHilo(){
        ejecutar = false
    }
    fun pausarHilo(){
        pausar = true
    }
    fun despausarHilo(){
        pausar = false
    }
    fun estapausado(): Boolean{
        return pausar
    }
}