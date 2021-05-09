package hr.ferit.sandroblavicki.rma_lv4_zad1.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            it.bBlueBird.setOnClickListener { viewModel.seeBird() }
            it.bRedBird.setOnClickListener { viewModel.seeBird() }
            it.bGreenBird.setOnClickListener { viewModel.seeBird() }
            it.bYellowBird.setOnClickListener { viewModel.seeBird() }
            it.bReset.setOnClickListener { viewModel.resetBirdCount() }
        }

        setContentView(binding.root)

        viewModel.birdsSeen.observe(this, {binding.tvBirdCounter.text = it.toString()})
    }
}