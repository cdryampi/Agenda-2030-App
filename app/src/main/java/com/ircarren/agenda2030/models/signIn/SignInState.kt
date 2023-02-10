package com.ircarren.agenda2030.models.signIn

data class SignInState(
    val isLoading: Boolean = false,
    val isSuccess: String ?="",
    val isError: String ?=""
)
