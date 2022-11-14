package com.viona.hiltlesson1.navigator

import androidx.fragment.app.FragmentActivity
import com.viona.hiltlesson1.R
import com.viona.hiltlesson1.ui.ButtonsFragment
import com.viona.hiltlesson1.ui.LogsFragment

/**
 * Navigator implementation.
 */
class AppNavigatorImpl(private val activity: FragmentActivity) : AppNavigator {

    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.BUTTONS -> ButtonsFragment()
            Screens.LOGS -> LogsFragment()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }
}
