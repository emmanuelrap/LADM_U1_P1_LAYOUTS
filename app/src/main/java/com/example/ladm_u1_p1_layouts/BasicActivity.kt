package com.example.ladm_u1_p1_layouts

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ladm_u1_p1_layouts.databinding.ActivityBasicBinding
import com.example.ladm_u1_p1_layouts.ui.login.LoginActivity

class BasicActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityBasicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBasicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_basic)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            val fActivity= Intent(this,FullscreenActivity::class.java)
            startActivity(fActivity)
        }

        binding.regresar.setOnClickListener { view ->
            val lActivity= Intent(this,LoginActivity::class.java)
            startActivity(lActivity)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_basic)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}