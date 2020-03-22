package org.coepi.android.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.coepi.android.R.id.bottom_navigation
import org.coepi.android.R.id.navHostFragment
import org.coepi.android.databinding.FragmentTabsContainerBinding.inflate

class TabsContainerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflate(inflater, container, false).apply {
        setupBottomNavigation(root)
    }.root

    private fun setupBottomNavigation(view: View) {
        val bottomNavigationView = view.findViewById<BottomNavigationView>(bottom_navigation)
        val fragmentContainer = view.findViewById<View>(navHostFragment)
        bottomNavigationView.setupWithNavController(Navigation.findNavController(fragmentContainer))
    }
}
