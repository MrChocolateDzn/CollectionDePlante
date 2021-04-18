package fr.chocobon.naturecollection.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.chocobon.naturecollection.MainActivity
import fr.chocobon.naturecollection.PlantRepository
import fr.chocobon.naturecollection.R
import fr.chocobon.naturecollection.adapter.PlantAdapter
import fr.chocobon.naturecollection.adapter.PlantItemDecoration

class FamillyFragment (
        private val context : MainActivity
) : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_family, container, false)
        //Recuperer ma recyclerview1
        val famillyRecyclerView = view.findViewById<RecyclerView>(R.id.family_recycler_list_rosacees)
        famillyRecyclerView.adapter = PlantAdapter(context, PlantRepository.Singleton.plantList.filter { it.familly.equals("Famille : Rosacées")}, R.layout.item_vertical_plant)
        famillyRecyclerView.layoutManager = LinearLayoutManager(context)
        famillyRecyclerView.addItemDecoration(PlantItemDecoration())

        //Recuperer ma recyclerview1
        val famillyRecyclerView1 = view.findViewById<RecyclerView>(R.id.family_recycler_list_gramine)
        famillyRecyclerView1.adapter = PlantAdapter(context, PlantRepository.Singleton.plantList.filter { it.familly.equals("Famille : Graminées")}, R.layout.item_vertical_plant)
        famillyRecyclerView1.layoutManager = LinearLayoutManager(context)
        famillyRecyclerView1.addItemDecoration(PlantItemDecoration())

        //Recuperer ma recyclerview2
        val famillyRecyclerView2 = view.findViewById<RecyclerView>(R.id.family_recycler_list_Asparagaceae)
        famillyRecyclerView2.adapter = PlantAdapter(context, PlantRepository.Singleton.plantList.filter { it.familly.equals("Famille : Asparagaceae")}, R.layout.item_vertical_plant)
        famillyRecyclerView2.layoutManager = LinearLayoutManager(context)
        famillyRecyclerView2.addItemDecoration(PlantItemDecoration())

        //Recuperer ma recyclerview2
        val famillyRecyclerView3 = view.findViewById<RecyclerView>(R.id.family_recycler_list_others)
        famillyRecyclerView3.adapter = PlantAdapter(context, PlantRepository.Singleton.plantList.filter { it.familly.equals("Famille : Autres")}, R.layout.item_vertical_plant)
        famillyRecyclerView3.layoutManager = LinearLayoutManager(context)
        famillyRecyclerView3.addItemDecoration(PlantItemDecoration())
        return view
    }
}