package com.example.appex2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _searchQuery = MutableLiveData<String>()
    val searchQuery: LiveData<String> get() = _searchQuery

    private val _apiResponse = MutableLiveData<String>()
    val apiResponse: LiveData<String> get() = _apiResponse

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
        // 여기에 API 호출 로직을 추가하여 결과를 설정합니다.
        setApiResponse("결과: $query") // API 호출 결과로 변경해야 합니다.
    }

    fun setApiResponse(response: String) {
        _apiResponse.value = response
    }
}
