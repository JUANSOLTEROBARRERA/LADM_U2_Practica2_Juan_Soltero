package mx.tecnm.tepic.ladm_u2_practica2_juan_soltero

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*


class MainActivity : AppCompatActivity() {
    //var player: MediaPlayer? = null


    //var cartas = Array<Carta>(54, {Carta("",this,BitmapFactory.decodeResource(resources, R.drawable.carta1))}).toMutableList()
    var cartas = Array<Carta>(54, {Carta("", this)}).toMutableList()
    var ejecutar = false
    var contador = 54

    fun corrutina() = GlobalScope.launch{
        while(true) {
            runOnUiThread {
                findViewById<TextView>(R.id.restantes).setText("Cartas Restantes: ${contador}")
            }
            delay(50L)
        }
    }
    //lateinit var shuffAlp : Array<Carta>
    //var imagen = BitmapFactory.decodeResource(resources, R.drawable.carta1)
    lateinit var imagen: Bitmap
    fun dameaudio(id:Int):MediaPlayer{
        var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.gallo)
        when(id){
            1 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.gallo)
            return audio1}
            2 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.diablito)
                return audio1}
            3 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.dama)
                return audio1}
            4 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.catrin)
                return audio1}
            5 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.paraguas)
                return audio1}
            6 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.sirena)
                return audio1}
            7 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.escalera)
                return audio1}
            8 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.botella)
                return audio1}
            9 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.barril)
                return audio1}
            10 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.arbol)
                return audio1}
            11 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.melon)
                return audio1}
            12 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.valiente)
                return audio1}
            13 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.gorrito)
                return audio1}
            14 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.muerte)
                return audio1}
            15 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.pera)
                return audio1}
            16 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.bandera)
                return audio1}
            17 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.bandolon)
                return audio1}
            18 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.violoncello)
                return audio1}
            19 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.garza)
                return audio1}
            20 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.pajaro)
                return audio1}
            21 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.mano)
                return audio1}
            22 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.bota)
                return audio1}
            23 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.luna)
                return audio1}
            24 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.cotorro)
                return audio1}
            25 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.borracho)
                return audio1}
            26 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.negrito)
                return audio1}
            27 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.corazon)
                return audio1}
            28 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.sandia)
                return audio1}
            29 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.tambor)
                return audio1}
            30 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.camaron)
                return audio1}
            31 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.jaras)
                return audio1}
            32 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.musico)
                return audio1}
            33 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.arania)
                return audio1}
            34 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.soldado)
                return audio1}
            35 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.estrella)
                return audio1}
            36 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.cazo)
                return audio1}
            37 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.mundo)
                return audio1}
            38-> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.apache)
                return audio1}
            39 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.nopal)
                return audio1}
            40 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.alacran)
                return audio1}
            41 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.rosa)
                return audio1}
            42 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.calavera)
                return audio1}
            43 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.campana)
                return audio1}
            44 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.cantarito)
                return audio1}
            45 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.venado)
                return audio1}
            46 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.sol)
                return audio1}
            47 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.corona)
                return audio1}
            48 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.chalupa)
                return audio1}
            49 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.pino)
                return audio1}
            50 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.pescado)
                return audio1}
            51 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.palma)
                return audio1}
            52 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.maceta)
                return audio1}
            53 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.arpa)
                return audio1}
            54 -> {var audio1: MediaPlayer = MediaPlayer.create(this, R.raw.rana)
                return audio1}
        }
        return audio1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        corrutina()
        findViewById<Button>(R.id.suspender).visibility = View.GONE
        findViewById<Button>(R.id.verificar).visibility = View.GONE
        findViewById<Button>(R.id.terminar).visibility = View.GONE
        //setTitle("Lotería")
        cartas[0].nombre="El Gallo"
        imagen = BitmapFactory.decodeResource(resources, R.drawable.carta3)
        //findViewById<ImageView>(R.id.cartaimg).setImageResource(imagen);
        //cartas[0].imagen = imagen
        cartas[1].nombre="El Diablito"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta2)
        //cartas[1].imagen = imagen
        cartas[2].nombre="La Dama"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta3)
        //cartas[2].imagen = imagen
        cartas[3].nombre="El Catrin"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta4)
        //cartas[3].imagen = imagen
        cartas[4].nombre="El Paraguas"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta5)
        //cartas[4].imagen = imagen
        cartas[5].nombre="La Sirena"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta6)
        //cartas[5].imagen = imagen
        cartas[6].nombre="La Escalera"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta7)
        //cartas[6].imagen = imagen
        cartas[7].nombre="La Botella"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta8)
        //cartas[7].imagen = imagen
        cartas[8].nombre="El Barril"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta9)
        //cartas[8].imagen = imagen
        cartas[9].nombre="El Árbol"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta10)
        //cartas[9].imagen = imagen
        cartas[10].nombre="El Melón"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta11)
        //cartas[10].imagen = imagen
        cartas[11].nombre="El Valiente"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta12)
        //cartas[11].imagen = imagen
        cartas[12].nombre="El Gorrito"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta13)
        //cartas[12].imagen = imagen
        cartas[13].nombre="La Muerte"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta14)
        //cartas[13].imagen = imagen
        cartas[14].nombre="La Pera"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta15)
        //cartas[14].imagen = imagen
        cartas[15].nombre="La Bandera"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta16)
        //cartas[15].imagen = imagen
        cartas[16].nombre="El Bandolón"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta17)
        //cartas[16].imagen = imagen
        cartas[17].nombre="El Violoncello"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta18)
        //cartas[17].imagen = imagen
        cartas[18].nombre="La Garza"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta19)
        //cartas[18].imagen = imagen
        cartas[19].nombre="El Pajaro"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta20)
        //cartas[19].imagen = imagen
        cartas[20].nombre="La Mano"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta21)
        //cartas[20].imagen = imagen
        cartas[21].nombre="La Bota"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta22)
        //cartas[21].imagen = imagen
        cartas[22].nombre="La Luna"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta23)
        //cartas[22].imagen = imagen
        cartas[23].nombre="El Cotorro"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta24)
        //cartas[23].imagen = imagen
        cartas[24].nombre="El Borracho"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta25)
        //cartas[24].imagen = imagen
        cartas[25].nombre="El Negrito"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta26)
        //cartas[25].imagen = imagen
        cartas[26].nombre="El Corazón"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta27)
        //cartas[26].imagen = imagen
        cartas[27].nombre="La Sandía"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta28)
        //cartas[27].imagen = imagen
        cartas[28].nombre="El Tambor"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta29)
        //cartas[28].imagen = imagen
        cartas[29].nombre="El Camarón"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta30)
        //cartas[29].imagen = imagen
        cartas[30].nombre="Las Jaras"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta31)
        //cartas[30].imagen = imagen
        cartas[31].nombre="El Músico"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta32)
        //cartas[31].imagen = imagen
        cartas[32].nombre="La Araña"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta33)
        //cartas[32].imagen = imagen
        cartas[33].nombre="El Soldado"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta34)
        //cartas[33].imagen = imagen
        cartas[34].nombre="La Estrella"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta35)
        //cartas[34].imagen = imagen
        cartas[35].nombre="El Cazo"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta36)
        //cartas[35].imagen = imagen
        cartas[36].nombre="El Mundo"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta37)
        //cartas[36].imagen = imagen
        cartas[37].nombre="El Apache"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta38)
        //cartas[37].imagen = imagen
        cartas[38].nombre="El Nopal"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta39)
        //cartas[38].imagen = imagen
        cartas[39].nombre="El Alacran"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta40)
        //cartas[39].imagen = imagen
        cartas[40].nombre="La Rosa"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta41)
        //cartas[40].imagen = imagen
        cartas[41].nombre="La Calavera"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta42)
        //cartas[41].imagen = imagen
        cartas[42].nombre="La Campana"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta43)
        //cartas[42].imagen = imagen
        cartas[43].nombre="El Cantarito"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta44)
        //cartas[43].imagen = imagen
        cartas[44].nombre="El Venado"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta45)
        //cartas[44].imagen = imagen
        cartas[45].nombre="El Sol"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta46)
        //cartas[45].imagen = imagen
        cartas[46].nombre="La Corona"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta47)
        //cartas[46].imagen = imagen
        cartas[47].nombre="La Chalupa"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta48)
        //cartas[47].imagen = imagen
        cartas[48].nombre="El Pino"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta49)
        //cartas[48].imagen = imagen
        cartas[49].nombre="El Pescado"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta50)
        //cartas[49].imagen = imagen
        cartas[50].nombre="La Palma"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta51)
        //cartas[50].imagen = imagen
        cartas[51].nombre="La Maceta"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta52)
        //cartas[51].imagen = imagen
        cartas[52].nombre="El Arpa"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta53)
        //cartas[52].imagen = imagen
        cartas[53].nombre="La Rana"
        //imagen = BitmapFactory.decodeResource(resources, R.drawable.carta54)
        //cartas[53].imagen = imagen

        var shuffAlp = cartas.shuffled() //AQUI SE BARAJA------------------------------------------
        val hilo1 = Hilo(this,shuffAlp)
        //val hilo1 = Hilo(this,cartas)

        //hilo1.start()
        var btninicio = findViewById<Button>(R.id.iniciar)
        var btnsuspender = findViewById<Button>(R.id.suspender)
        var btnverificar = findViewById<Button>(R.id.verificar)
        var btnterminar = findViewById<Button>(R.id.terminar)
        btninicio.setOnClickListener {
            hilo1.start()
            findViewById<Button>(R.id.iniciar).visibility = View.GONE
            findViewById<Button>(R.id.suspender).visibility = View.VISIBLE
        }
        btnsuspender.setOnClickListener {
            if (!hilo1.estapausado()) hilo1.pausarHilo()
            findViewById<Button>(R.id.suspender).visibility = View.GONE
            findViewById<Button>(R.id.verificar).visibility = View.VISIBLE
        }
        btnverificar.setOnClickListener {
            hilo1.despausarHilo()
            findViewById<Button>(R.id.verificar).visibility = View.GONE

        }
        btnterminar.setOnClickListener {
            finish()
        }
    }

}