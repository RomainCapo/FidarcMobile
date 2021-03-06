package ch.hearc.fidarc.ui.data.model

data class Token(
    val token_type: String,
    val expires_in: Int,
    val access_token: String,
    val refresh_token: String
)