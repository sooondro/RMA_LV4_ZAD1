package hr.ferit.sandroblavicki.rma_lv4_zad1.di

import hr.ferit.sandroblavicki.rma_lv4_zad1.model.BirdCounter
import hr.ferit.sandroblavicki.rma_lv4_zad1.ui.viewmodels.BirdCounterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory<BirdCounter> { BirdCounter() }
}

val viewModelModule = module {
    viewModel<BirdCounterViewModel> { BirdCounterViewModel(get()) }
}