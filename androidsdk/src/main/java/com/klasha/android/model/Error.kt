package com.klasha.android.model

enum class Error {
    NO_INTERNET,
    INVALID_CARD_PIN,
    INVALID_OTP,
    INVALID_CREDENTIALS,
    TRANSACTION_NOT_SUPPORTED,
    UNAUTHORISED,
    SERVER_ERROR,
    BAD_REQUEST,
    BAD_EXCHANGE_REQUEST,
    LIMITED_CONNECTIVITY,
    SDK_NOT_INITIALISED,
    ZERO_AMOUNT,
    INVALID_WALLET_LOGIN
}