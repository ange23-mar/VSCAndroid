package com.example.appAndroid

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppAndroidApplication

fun main(args: Array<String>) {
	runApplication<AppAndroidApplication>(*args)
}
