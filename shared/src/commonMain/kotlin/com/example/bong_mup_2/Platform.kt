package com.example.bong_mup_2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform