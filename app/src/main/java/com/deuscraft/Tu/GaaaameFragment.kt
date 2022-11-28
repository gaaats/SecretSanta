package com.deuscraft.Tu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.deuscraft.Tu.databinding.FragmentGaaaameBinding
import com.google.android.material.snackbar.Snackbar


class GaaaameFragment : Fragment() {

    private fun gtttt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Exit, realy?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    var gtgtfgt = 0.8f
    var plfrfgtt = 0.05f

    private var dddvvb: FragmentGaaaameBinding? = null
    private val polafr
        get() = dddvvb ?: throw RuntimeException("FragmentGaaaameBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dddvvb = FragmentGaaaameBinding.inflate(inflater, container, false)
        return polafr.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            polafr.root.background.alpha = 220

            polafr.btnImgExit.setOnClickListener {
                gtttt()

            }



            polafr.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem9.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem10.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem11.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem12.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }
            polafr.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                gtgtgtg()
            }



        } catch (e: Exception) {
            ftgtgtt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun gtgtgtg() {
        if (hyjuujjuukik(polafr.btnElem1) && hyjuujjuukik(polafr.btnElem2) && hyjuujjuukik(
                polafr.btnElem3
            ) && hyjuujjuukik(polafr.btnElem4) && hyjuujjuukik(polafr.btnElem5) && hyjuujjuukik(
                polafr.btnElem6
            ) && hyjuujjuukik(polafr.btnElem7) && hyjuujjuukik(polafr.btnElem8) && hyjuujjuukik(
                polafr.btnElem9
            ) && hyjuujjuukik(polafr.btnElem10) && hyjuujjuukik(polafr.btnElem11) && hyjuujjuukik(
                polafr.btnElem12
            )
        ) {
            findNavController().navigate(R.id.action_gaaaameFragment_to_reloadFragment)
        }
    }

    override fun onDestroy() {
        dddvvb = null
        super.onDestroy()
    }




    private fun hyjuujjuukik(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }


    private fun ftgtgtt() {
        Snackbar.make(
            polafr.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }




}