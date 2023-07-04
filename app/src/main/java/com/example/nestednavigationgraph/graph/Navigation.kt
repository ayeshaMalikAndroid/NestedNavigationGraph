//package com.example.onboardingwithjetpackcompose
//
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Button
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Text
//import androidx.compose.material.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import androidx.navigation.NavType
//import androidx.navigation.Navigation
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navArgument
//import com.example.onboardingwithjetpackcompose.ui.MyComposeAppTheme
//
//@Composable
//fun Navigation() {
//
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
//        composable(route = Screen.MainScreen.route) {
//            MainScreen(navController = navController)
//        }
//        //"/{name}" pass navigation augment to next screen
//        composable(route = Screen.NextScreen.route + "/{name}",
//            arguments = listOf(
//                navArgument("name") {
//                    type = NavType.StringType
//                    defaultValue = "AM"
//                    nullable = true
//                }
//            )
//        ) { entry ->
//            NextScreen(name = entry.arguments?.getString("name"))
//        }
//    }
//}
//
//@Composable
//fun MainScreen(navController: NavController) {
//    var text by remember {
//        mutableStateOf("")
//    }
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 50.dp)
//
//    ) {
//        TextField(
//            value = text, onValueChange = {
//                text = it
//            },
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        Button(
//            //navigate to new screen...
//            onClick = {
//                navController.navigate(Screen.NextScreen.withArugs(text))
//
//            },
//            modifier = Modifier.align(Alignment.End)
//        ) {
//            Text(text = "To NextScreen ")
//        }
//    }
//}
//
//@Composable
//fun NextScreen(name: String?) {
//    MyComposeAppTheme() {
//
//    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
//        Text(text = "Hello, $name" , fontWeight = FontWeight.Bold, fontSize = MaterialTheme.typography.h1.fontSize, color = MaterialTheme.colors.primary)
//    }
//
//    }
//}
//
