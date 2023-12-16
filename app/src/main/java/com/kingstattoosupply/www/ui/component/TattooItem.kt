package com.kingstattoosupply.www.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.kingstattoosupply.www.R
import com.kingstattoosupply.www.ui.theme.KingsTattooTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TattooItem() {
    val items = listOf(R.drawable.tattoo1,R.drawable.tattoo2,R.drawable.tattoo3)
    Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary), elevation = CardDefaults.cardElevation(defaultElevation = 15.dp)) {
        Image(
            modifier = Modifier.height(200.dp),
            painter = painterResource(id = items.random()),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "TRIDENT MX",
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                fontSize = 13.sp,
                fontWeight = FontWeight.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier.wrapContentHeight(unbounded = true),
                text = "WIRELESS TATTOO PEN MACHINE V5",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontSize = 13.sp,
                softWrap = true,
                fontWeight = FontWeight.Light,
                style = LocalTextStyle.current.merge(
                    TextStyle(
                        lineHeight = 1.em,
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        ),
                        lineHeightStyle = LineHeightStyle(
                            alignment = LineHeightStyle.Alignment.Center,
                            trim = LineHeightStyle.Trim.None
                        )
                    )
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    text = "\u20B9 20,000",
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraLight,
                    textDecoration = TextDecoration.LineThrough
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "\u20B9 10,000",
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
@Preview
private fun ProductInfoItemPreview() {
    KingsTattooTheme {
        ProductInfoItem()
    }
}