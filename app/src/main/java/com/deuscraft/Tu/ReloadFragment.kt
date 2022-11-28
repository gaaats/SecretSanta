package com.deuscraft.Tu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.deuscraft.Tu.databinding.FragmentReloadBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay


class ReloadFragment : Fragment() {
    private fun gthhy() {
        Snackbar.make(
            nhnjmkk.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fvfbg: FragmentReloadBinding? = null
    private val nhnjmkk
        get() = fvfbg ?: throw RuntimeException("FragmentReloadBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fvfbg = FragmentReloadBinding.inflate(inflater, container, false)
        return nhnjmkk.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                delay(1000)
                findNavController().navigate(R.id.action_reloadFragment_to_gaaaameFragment)
            }

        } catch (e: Exception) {
            gthhy()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fvfbg = null
        super.onDestroy()
    }

    private fun tgttgt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Current data will not be saved, EXIT?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().onBackPressed()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }
}