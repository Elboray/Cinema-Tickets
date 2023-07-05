package com.example.cinematickets

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){
    object Home : BottomNavItem("Home", R.drawable.homemovie,"home")
    object Search: BottomNavItem("Search",R.drawable.search,"search")
    object Tickets: BottomNavItem("Tickets",R.drawable.ticket,"tickets")
    object Profile: BottomNavItem("Profile",R.drawable.profile,"profile")
}
