package com.example.recyclerviewempleados_josegasca.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewempleados_josegasca.R
import com.example.recyclerviewempleados_josegasca.models.empleado
import java.text.FieldPosition

//esra es la clase encargada de  cargar los datos
///al recyclerView


/*
para instanciar  la clase se requiere unos parametros
1.Lista elementos
2.Contexto de la aplicación



//Esta clase debe heredar de la clase
RecyclerView.Adapter
Paea heredear se utiliza : y la clase de donde se va a heredar

*/
class adapter_empleado(

    var ListaEmpleado: List<empleado>,
    var context:Context
): RecyclerView.Adapter<adapter_empleado.MyHolder>()


/*
          Se crea la clase MyHolder
           */


{

    inner class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        /*
         Dentro de la clase MyHolder se crea las variables
         y se asocian los objetos de la vista item
          */

        lateinit var lblName: TextView
        lateinit var lblPosition: TextView
        ///lateinit var lblimagen: ImageView



        init {
            lblName=itemView.findViewById(R.id.lblName)
            lblPosition=itemView.findViewById(R.id.lblPosition)
            //lblimagen = itemView.findViewById(R.id.lblimagen)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_empleado.MyHolder {
        var itemView= LayoutInflater.from(context).inflate(R.layout.item_empleado,parent,false )
        return MyHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapter_empleado.MyHolder, position: Int) {
        //obtener el registro
        val empleado=ListaEmpleado[position]
        //asignar valorese
        holder.lblName.text=empleado.nombre
        holder.lblPosition.text=empleado.cargo
    }

    /*
    getItemCount: retorna el número de elementos
    de la lista
     */
    override fun getItemCount(): Int {
        return ListaEmpleado.size
    }

    }


