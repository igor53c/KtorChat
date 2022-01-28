package com.ipcoding.ktorandroidchat.presentation.chat

import com.ipcoding.ktorandroidchat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)

