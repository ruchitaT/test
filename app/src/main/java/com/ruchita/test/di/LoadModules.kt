package com.ruchita.test.di


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.ruchita.test.data.Repository
import com.ruchita.test.viewmodel.ListViewModel
import com.ruchita.test.data.Repository.Companion.KEY_NAME
import com.ruchita.test.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
val appModule = module {
    single{
        Firebase.database.getReference(KEY_NAME)
    }
    single {
        Repository.getInstance(get())
    }
    single {FirebaseAuth.getInstance() }
    viewModel { ListViewModel(get()) }
    viewModel { MainViewModel(get()) }
}
