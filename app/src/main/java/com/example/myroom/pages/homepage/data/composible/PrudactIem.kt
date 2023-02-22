package com.example.myroom.pages.homepage.data.composible

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.myroom.pages.homepage.data.model.Product


@Composable
fun ProductItem(product: Product,onSelectItme:()->Unit) {
    Card() {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .border(width = 5.dp, color = Color.Blue)
        ) {
            AsyncImage(
                model = product.images[0],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(100.dp)
                    .clickable {
                        onSelectItme()
                    },

                )
            Column() {
                Text(
                    text = product.title,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .background(
                            Color.Cyan
                        )
                        .fillMaxSize(),
                    style = TextStyle(fontSize = 20.sp),
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = product.description,
                    textAlign = TextAlign.Left,
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        }
}