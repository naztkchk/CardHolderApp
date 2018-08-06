package com.tkachuk.cardholderapp.data.model

data class BusinessCard(
        val id: Int,
        var name: String,
        var description: String,
        var site: String,
        var email: String,
        var phone: String,
        var location: String,
        var photoPath: String)