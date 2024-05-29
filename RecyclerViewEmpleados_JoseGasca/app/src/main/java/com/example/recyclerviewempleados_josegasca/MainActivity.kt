package com.example.recyclerviewempleados_josegasca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewempleados_josegasca.adapters.adapter_empleado
import com.example.recyclerviewempleados_josegasca.models.empleado

class MainActivity : AppCompatActivity() {

     lateinit var ListEmpleado:MutableList<empleado>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //se incializa el mutableList
        ListEmpleado= mutableListOf()
        //se agrega los elementos
       //var empleado=empleado("jose","aprendiz")
       // ListEmpleado.add(empleado)
        ListEmpleado.add(empleado("jose","Ingeniero full stack"))
        ListEmpleado.add(empleado("willy","aprendiz"))
        ListEmpleado.add(empleado("cristian","aprendiz"))
        ListEmpleado.add(empleado("steban","aprendiz"))
        ListEmpleado.add(empleado("bahamon","aprendiz"))
        ListEmpleado.add(empleado("yordy","aprendiz"))
        ListEmpleado.add(empleado("Erik","aprendiz"))
        ListEmpleado.add(empleado("Gasca","CEO"))
        ListEmpleado.add(empleado("Bonilla"," diseñador UI / UX"))
    //Se crea y se asocia una variable con el objeto de la vista
        var recycler=findViewById<RecyclerView>(R.id.RecycleEmpleado)
        recycler.layoutManager= LinearLayoutManager(applicationContext)
        //se crea el adaptador
        var adapterEmpleado= adapter_empleado(ListEmpleado,applicationContext)
        //se asocia el adaptador con el objeto
        recycler.adapter=adapterEmpleado
    }
}