package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
        //Binding
        private lateinit var binding: ActivityMainBinding

        //Other
        private lateinit var navController: NavController
        private lateinit var appBarConfiguration: AppBarConfiguration

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            //InitViews
           binding.apply {
                navController = findNavController(R.id.navHost)
                appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.detailFragment))
                setupActionBarWithNavController(navController, appBarConfiguration)
                //bottomNav.setupWithNavController(navController)
            }
        }

        override fun onNavigateUp(): Boolean {
            return navController.navigateUp() || super.onNavigateUp()
        }


}
