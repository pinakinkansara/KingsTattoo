package com.kingstattoosupply.www.ui.screen.cart

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kingstattoosupply.www.ui.component.CartItem
import com.kingstattoosupply.www.ui.theme.KingsTattooTheme

@Composable
fun CartScreen(modifier: Modifier) {

    CartScreenContent(modifier)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun CartScreenContent(modifier: Modifier = Modifier) {

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            items(count = 10) {
                CartItem()
            }
        })
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
private fun CartScreenPreview() {
    KingsTattooTheme {
        CartScreenContent()
    }
}