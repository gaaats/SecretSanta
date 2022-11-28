package com.deuscraft.Tu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.deuscraft.Tu.databinding.FragmentChooseGameBinding
import com.google.android.material.snackbar.Snackbar

class ChooseGameFragment : Fragment() {
    private fun gtggtgt() {
        Snackbar.make(
            njmk.root,
            "I have error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var deesc: FragmentChooseGameBinding? = null
    private val njmk
        get() = deesc ?: throw RuntimeException("FragmentChooseGameBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        deesc = FragmentChooseGameBinding.inflate(inflater, container, false)
        return njmk.root
    }


    override fun onDestroy() {
        deesc = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            njmk.root.background.alpha = 220

            njmk.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_chooseGameFragment_to_gaaaameFragment)
            }

        } catch (e: Exception) {
            gtggtgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }
}
