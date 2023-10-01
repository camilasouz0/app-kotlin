package com.example.orgs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.orgs.uistate.FormularioUiState

class FormularioProdutoActivityViewModel : ViewModel() {

    val state = MutableLiveData(FormularioUiState())

}