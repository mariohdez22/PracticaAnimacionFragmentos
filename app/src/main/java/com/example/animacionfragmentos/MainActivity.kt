package com.example.animacionfragmentos

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    lateinit var navegacion : NavigationBarView
    private val opcionMenuSeleccionado = NavigationBarView.OnItemSelectedListener{

        item -> when(item.itemId){

                    R.id.fragmento1 -> {

                        supportFragmentManager.commit{

                            replace<PrimerFragmento>(R.id.fragment_container_view)
                            setReorderingAllowed(true)
                            addToBackStack("replacement")
                        }
                        return@OnItemSelectedListener true
                    }
                    R.id.fragmento2 -> {

                        supportFragmentManager.commit{

                            replace<SegundoFragmento>(R.id.fragment_container_view)
                            setReorderingAllowed(true)
                            addToBackStack("replacement")
                        }
                        return@OnItemSelectedListener true
                    }
                    R.id.fragmento3 -> {

                        supportFragmentManager.commit{

                            replace<TercerFragmento>(R.id.fragment_container_view)
                            setReorderingAllowed(true)
                            addToBackStack("replacement")
                        }
                        return@OnItemSelectedListener true
                    }
                    R.id.fragmento4 -> {

                        supportFragmentManager.commit{

                            replace<CuartoFragmento>(R.id.fragment_container_view)
                            setReorderingAllowed(true)
                            addToBackStack("replacement")
                        }
                        return@OnItemSelectedListener true
                    }
                }
                false
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<PrimerFragmento>(R.id.fragment_container_view)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }

        navegacion = findViewById(R.id.navmenu)

        navegacion.setOnItemSelectedListener(opcionMenuSeleccionado)

    }
}