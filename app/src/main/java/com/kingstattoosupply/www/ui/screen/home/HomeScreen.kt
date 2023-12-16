package com.kingstattoosupply.www.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kingstattoosupply.www.ui.component.ProductInfoItem
import com.kingstattoosupply.www.ui.theme.KingsTattooTheme

@Composable
fun HomeScreen(modifier: Modifier) {

    HomeScreenContent(modifier)
}

@Composable
private fun HomeScreenContent(modifier: Modifier = Modifier) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        content = {
            items(10) {
                ProductInfoItem()
            }
        })
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun HomeScreenPreview() {
    KingsTattooTheme {
        HomeScreenContent()
    }
}