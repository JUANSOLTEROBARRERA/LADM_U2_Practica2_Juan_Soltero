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

        cartas[0].nombre="El Gallo"
        imagen = BitmapFactory.decodeResource(resources, R.drawable.carta3)
        cartas[1].nombre="El Diablito"
        cartas[2].nombre="La Dama"
        cartas[3].nombre="El Catrin"
        cartas[4].nombre="El Paraguas"
        cartas[5].nombre="La Sirena"
        cartas[6].nombre="La Escalera"
        cartas[7].nombre="La Botella"
        cartas[8].nombre="El Barril"
        cartas[9].nombre="El Árbol"
        cartas[10].nombre="El Melón"
        cartas[11].nombre="El Valiente"
        cartas[12].nombre="El Gorrito"
        cartas[13].nombre="La Muerte"
        cartas[14].nombre="La Pera"
        cartas[15].nombre="La Bandera"
        cartas[16].nombre="El Bandolón"
        cartas[17].nombre="El Violoncello"
        cartas[18].nombre="La Garza"
        cartas[19].nombre="El Pajaro"
        cartas[20].nombre="La Mano"
        cartas[21].nombre="La Bota"
        cartas[22].nombre="La Luna"
        cartas[23].nombre="El Cotorro"
        cartas[24].nombre="El Borracho"
        cartas[25].nombre="El Negrito"
        cartas[26].nombre="El Corazón"
        cartas[27].nombre="La Sandía"
        cartas[28].nombre="El Tambor"
        cartas[29].nombre="El Camarón"
        cartas[30].nombre="Las Jaras"
        cartas[31].nombre="El Músico"
        cartas[32].nombre="La Araña"
        cartas[33].nombre="El Soldado"
        cartas[34].nombre="La Estrella"
        cartas[35].nombre="El Cazo"
        cartas[36].nombre="El Mundo"
        cartas[37].nombre="El Apache"
        cartas[38].nombre="El Nopal"
        cartas[39].nombre="El Alacran"
        cartas[40].nombre="La Rosa"
        cartas[41].nombre="La Calavera"
        cartas[42].nombre="La Campana"
        cartas[43].nombre="El Cantarito"
        cartas[44].nombre="El Venado"
        cartas[45].nombre="El Sol"
        cartas[46].nombre="La Corona"
        cartas[47].nombre="La Chalupa"
        cartas[48].nombre="El Pino"
        cartas[49].nombre="El Pescado"
        cartas[50].nombre="La Palma"
        cartas[51].nombre="La Maceta"
        cartas[52].nombre="El Arpa"
        cartas[53].nombre="La Rana"


        barajarinicio()
        val hilo1 = Hilo(this,cartas)

        fun barajear(){
            barajarinicio()
            hilo1.baraja = cartas
            hilo1.contador = 0
            hilo1.despausarHilo()
        }

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
            barajear()
            contador = 54
            findViewById<Button>(R.id.terminar).visibility = View.GONE
            findViewById<Button>(R.id.suspender).visibility = View.VISIBLE
        }
    }

    //AQUI SE BARAJEA************************************************************
    fun barajarinicio() {
        var cont = 53
        while (cont >= 0) {
            var j = Math.floor(Math.random() * (cont + 1)).toInt()
            var k = cartas[cont]
            cartas[cont] = cartas[j]
            cartas[j] = k
            cont--
        }
    }
}