package com.example.nestednavigationgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationgraph.graph.SetupNavGraph
import com.example.onboardingwithjetpackcompose.ui.MyComposeAppTheme

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme() {
                // Navigation()
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}