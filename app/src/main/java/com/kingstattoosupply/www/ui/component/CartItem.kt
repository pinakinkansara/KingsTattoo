package com.kingstattoosupply.www.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

@Composable
fun CartItem() {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary),
        elevation = CardDefaults.cardElevation(defaultElevation = 15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(96.dp),
                painter = painterResource(id = R.drawable.tattoo),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.width(16.dp))
            Column {
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "1",
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Black
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painterResource(id = R.drawable.ic_remove) , contentDescription = null)
                    }
                }
            }
        }
    }
}

@Composable
@Preview
private fun CartItemPreview() {
    KingsTattooTheme {
        CartItem()
    }
}