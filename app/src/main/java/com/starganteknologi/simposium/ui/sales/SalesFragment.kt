package com.starganteknologi.simposium.ui.sales

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.starganteknologi.simposium.R

class SalesFragment : Fragment() {

    private lateinit var salesViewModel: SalesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        salesViewModel =
                ViewModelProviders.of(this).get(SalesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sales, container, false)
        val textView: TextView = root.findViewById(R.id.text_sales)
        salesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}