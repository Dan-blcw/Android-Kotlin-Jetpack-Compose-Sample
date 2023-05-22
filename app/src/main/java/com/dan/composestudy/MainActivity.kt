package com.dan.composestudy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private var idt = 0
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //image card
//            val painter = painterResource(id = R.drawable.img_demo)
//            val description = "img in drawable"
//            val title = "Eve on Twitter(Source: Pinterest)"
//
//            Row() {
//                Box(
//                    modifier = Modifier
//                        .padding(start = 2.dp)
//                        .background(Color.White)
//                        .fillMaxSize(0.5f)
//                ){
//                    ImageCard(painter = painter, contentDescription = description, title = title)
//
//                }
//                Box(
//                    modifier = Modifier
//                        .padding(end = 2.dp)
//                        .background(Color.White)
//                        .fillMaxHeight(0.50f)
//                ){
//                    ImageCard(painter = painter, contentDescription = description, title = title)
//                }
//            }

            //FontFamily
//            val font = FontFamily(
//                Font(R.font.robotoslab_bold, FontWeight.Bold),
//                Font(R.font.robotoslab_black, FontWeight.Black),
//                Font(R.font.robotoslab_extrabold, FontWeight.ExtraBold),
//                Font(R.font.robotoslab_extralight, FontWeight.ExtraLight),
//                Font(R.font.robotoslab_medium, FontWeight.Medium),
//                Font(R.font.robotoslab_regular, FontWeight.Normal),
//                Font(R.font.robotoslab_semibold, FontWeight.SemiBold),
//                Font(R.font.robotoslab_thin, FontWeight.Thin)
//            )
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .background(Color(0xFF018786))
//
//            ){
//                Text(
////                    text = "DO something",
//                    text = buildAnnotatedString {
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Black,
//                                fontSize = 48.sp
//                            )
//                        ){
//                            append("J")
//                        }
//                        append("etpack ")
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.White,
//                                fontSize = 48.sp
//                            )
//                        ){
//                            append("C")
//                        }
//                        append("ompose")
//                    },
//                    color = Color.Black,
//                    fontSize = 30.sp,
//                    fontFamily = font,
//                    fontStyle = FontStyle.Italic,
//                    fontWeight = FontWeight.Bold,
//                    textDecoration = TextDecoration.LineThrough
//                )
//            }

            //stateColor
//            Column(modifier = Modifier.fillMaxSize()) {
//                val color = remember{
//                    mutableStateOf(Color.Blue)
//                }
//                ColorBox(
//                    Modifier.fillMaxSize().weight(1f)
//                ){
//                    color.value = it
//                }
//                Box(
//                    modifier = Modifier
//                        .background(color.value)
//                        .weight(1f)
//                        .fillMaxSize()
//                )
//            }

            //textfields = edt, button, showing snackbars
//            Snackbar() {
//                Text(text = "Hello Dan")
//            }
//            val scope = rememberCoroutineScope()
//            val scaffoldState = rememberScaffoldState()
//            var textFieldState by remember {
//                mutableStateOf("")
//            }
//            Scaffold(
//                modifier = Modifier.fillMaxSize(),
//                scaffoldState = scaffoldState,
//            ) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 30.dp)
//                ) {
//                    TextField(
//                        value = textFieldState,
//                        label = {
//                            Text(text = "Enter your name")
//                        },
//                        onValueChange = {
//                            textFieldState = it
//                        },
//                        singleLine = true,
//                        modifier = Modifier.fillMaxWidth(),
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(onClick = {
//                        scope.launch {
//                            scaffoldState.snackbarHostState.showSnackbar(
//                                "Hello $textFieldState"
//                            )
//                        }
//                    }) {
//                        Text("Pls greet me")
//                    }
//                }
//            }


                //List: Cach1
//            val scrollState = rememberScrollState()
//            Column(
//                modifier = Modifier.verticalScroll(scrollState)
//            ) {
//                for(i in 1..50){
//                    Text(
//                        text = "Item $i",
//                        fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }
                //cach2
//            LazyColumn{
//                itemsIndexed(
//                    listOf("This", "is", "Jetpack", "Compose")
//                ){ index, item ->
//                    Text(
//                        text = "$item",
//                        fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
                    //cach3
//                items(60){
//                    Text(
//                        text = "Item $it",
//                        fontSize = 24.sp,
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }

//            //constraintsLayout
//            val constraints = ConstraintSet{
//                val greenBox = createRefFor("greenBox")
//                val redBox = createRefFor("redBox")
//
//                val guideline = createGuidelineFromTop(0.5f)
//
//                constrain(greenBox){
//                    top.linkTo(guideline)
////                    top.linkTo(parent.top)
//                    start.linkTo(parent.start)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//                }
//                constrain(redBox){
//                    top.linkTo(parent.top)
//                    start.linkTo(greenBox.end)
//                    width = Dimension.value(100.dp)
////                    width = Dimension.fillToConstraints
//                    height = Dimension.value(100.dp)
//                }
//                // dàn đều, cách đều ra hàng ngang
////                createHorizontalChain(greenBox,redBox)
//                // 2 box ở giữa, cạnh nhau trung tâm hàng ngang
//                createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
//            }
//            ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
//                Box(modifier = Modifier
//                    .background(Color(0xFF018786))
//                    .layoutId("greenBox")
//                )
//                Box(modifier = Modifier
//                    .background(Color.Black)
//                    .layoutId("redBox")
//                )
//            }

        //Effect Handlers: Trình xử lý hiệu ứng
//            var text by remember {
//                mutableStateOf("do some thing")
//            }
//            LaunchedEffect(key1 = text){
//                delay(1000L)
////                Text(text = text, modifier = Modifier.fillMaxSize(0.5f))
//                println("The text is $text")
//            }
//            Text(
//                text = text,
//                fontSize = 24.sp,
//                textAlign = TextAlign.Center,
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 24.dp)
//            )

            //Simple Animations
            var sizeState by remember{ mutableStateOf(200.dp) }
            //tạo ra hiệu ứng đối với trạng thái của mình(trở lên trơn trượt hơn =)))
            val size by animateDpAsState(
                targetValue = sizeState,
                tween(
                    durationMillis = 2000,
                    delayMillis = 300,
//                    easing = Easing {  }
                )
            )
            Box(
                modifier = Modifier
                    .size(size)
                    .background(Color(0xff018786)),
                contentAlignment = Alignment.Center
            ){
                Button(onClick =  {
                    sizeState += 50.dp
                }){
                    Text("Increase Size")
                }
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxSize(),
        shape = RoundedCornerShape(15.dp),
//        elevation = 140.dp
    ) {
        Box(modifier = Modifier.wrapContentSize()){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
            ){

            }
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(Color.White, fontSize = 16.sp))
            }
        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
){
    Box(modifier = modifier
        .background(Color.DarkGray)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
}

