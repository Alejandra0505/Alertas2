package com.example.myapplication

import android.app.Dialog
import android.app.ProgressDialog
import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsave.setOnClickListener {
            alerta()
        }
        binding.btntoast.setOnClickListener {
            alerta2()
        }
        binding.btnsna.setOnClickListener {
            alerta3()
        }
        binding.btnsna2.setOnClickListener {
            alerta4()
        }
        binding.btnpro.setOnClickListener {
            alerta5()
        }
    }

    fun alerta() {
        AlertDialog.Builder(this)
            .setTitle("Alerta Basica (Titulo) ")
            .setMessage("BUENOS DIAS :D (Area de contenido)")
            .setPositiveButton("Aceptar(N°1)") { dialog, which ->
                // Acción cuando se hace click en el botón Aceptar
            }
            .setNegativeButton("Cancelar(N°2)") { dialog, which ->
                // Acción cuando se hace click en el botón Cancelar
            }
            .show()
    }

    fun alerta2() {
        Toast.makeText(this, "Alerta Toast", Toast.LENGTH_SHORT).show();
    }

    fun alerta3() {
        Snackbar.make(binding.root, "Alerta Snackbar", Snackbar.LENGTH_SHORT).show();
    }

    fun alerta4() {
        val snackbar =
            Snackbar.make(binding.root, "Alerta Snackbar Custom", Snackbar.LENGTH_LONG)
        snackbar.setTextColor(Color.WHITE)
        snackbar.view.setBackgroundColor(Color.BLACK)
        snackbar.setAction("Click") {
            Toast.makeText(this, "Alerta Toast", Toast.LENGTH_SHORT).show();
            // Acción cuando se hace clic en la acción personalizada
        }
        snackbar.setActionTextColor(Color.YELLOW)
        snackbar.duration = Snackbar.LENGTH_LONG
        snackbar.show()
    }

    fun alerta5() {
        val progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Process Dialog")
        progressDialog.setMessage("Cargando...")
        progressDialog.show()
    }
}