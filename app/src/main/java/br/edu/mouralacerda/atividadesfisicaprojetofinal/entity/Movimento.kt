package br.edu.mouralacerda.atividadesfisicaprojetofinal.entity

data class Movimento(
    val id: Int,
    val timestamp: String,
    val accelX: Double,
    val accelY: Double,
    val accelZ: Double,
    val latitude: Double,
    val longitude: Double,
    val atleta: String
) {}