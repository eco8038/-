package com.example.appex2

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

data class OpenAiRequest(val prompt: String, val max_tokens: Int)
data class OpenAiResponse(val choices: List<Choice>)
data class Choice(val text: String)

interface OpenAiApiService {
    @Headers("Content-Type: application/json")
    @POST("v1/engines/davinci-codex/completions")
    fun getCompletion(
        @Header("Authorization") auth: String,
        @Body request: OpenAiRequest
    ): Call<OpenAiResponse>
}
