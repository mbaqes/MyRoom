package com.example.myroom.pages.homepage

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.myroom.core.recourc.Recourc
import com.example.myroom.pages.homepage.data.composible.ProductItem
import com.example.myroom.pages.homepage.data.model.StoreModel
import com.example.myroom.router.AppNavigator
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect

@Composable
fun HomePage(
    navcontroller: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    //var state = homeViewModel.state.collectAsState(Recourc.Loading<StoreModel>())
    FatchStateUI(
        state = homeViewModel.state,
        collect = { newState ->
            Log.d("sss", newState.toString())
        }) {
        Button(onClick = { homeViewModel.emitNewState() }) {
            Text(text = "Ckick")
        }
    }

}

@Composable
fun <S> FatchStateUI(
    state: Flow<S>,
    collect: (S) -> Unit,
    content: @Composable() (ColumnScope.() -> Unit)
) {

    Column(
        Modifier
            .defaultMinSize(
                minWidth = ButtonDefaults.MinWidth,
                minHeight = ButtonDefaults.MinHeight
            )
            .padding(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        content = content
    )

    LaunchedEffect(Unit) {
        state.collect(collect)
    }
}
