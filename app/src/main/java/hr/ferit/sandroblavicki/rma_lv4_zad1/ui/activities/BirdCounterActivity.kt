package hr.ferit.sandroblavicki.rma_lv4_zad1.ui.activities

import android.graphics.Color.blue
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import hr.ferit.sandroblavicki.rma_lv4_zad1.BirdCounterApp
import hr.ferit.sandroblavicki.rma_lv4_zad1.R
import hr.ferit.sandroblavicki.rma_lv4_zad1.databinding.ActivityBirdCounterBinding
import hr.ferit.sandroblavicki.rma_lv4_zad1.ui.viewmodels.BirdCounterViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class BirdCounterActivity : AppCompatActivity() {

    private val viewModel by viewModel<BirdCounterViewModel>()
    private lateinit var binding: ActivityBirdCounterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdCounterBinding.inflate(layoutInflater).also {
            it.bBlueBird.setOnClickListener { viewModel.seeBird(ContextCompat.getColor(BirdCounterApp.context, R.color.blue)) }
            it.bRedBird.setOnClickListener { viewModel.seeBird(ContextCompat.getColor(BirdCounterApp.context, R.color.red)) }
            it.bGreenBird.setOnClickListener { viewModel.seeBird(ContextCompat.getColor(BirdCounterApp.context, R.color.green)) }
            it.bYellowBird.setOnClickListener { viewModel.seeBird(ContextCompat.getColor(BirdCounterApp.context, R.color.yellow)) }
            it.bReset.setOnClickListener { viewModel.resetBirdCount() }
        }

        setContentView(binding.root)

        viewModel.birdsSeen.observe(this, { binding.tvBirdCounter.text = it.value.toString() })
        viewModel.birdColor.observe(this, { it.value?.let { it1 ->
            binding.tvBirdCounter.setBackgroundColor(
                it1
            )
        } })
    }
}