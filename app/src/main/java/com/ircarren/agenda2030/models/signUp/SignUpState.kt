package com.ircarren.agenda2030.models.signUp

data class SignUpState(
    val isLoading: Boolean = false,
    val isSuccess: String ?="",
    val isError: String ?=""
)
