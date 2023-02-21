package com.bss.uis.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/bss/uis/data/remote/PincodeInterface;", "", "fetchPinData", "Lretrofit2/Call;", "", "Lcom/bss/uis/data/remote/dto/response/PinCodeResponse;", "pin", "", "app_debug"})
public abstract interface PincodeInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{pin}")
    public abstract retrofit2.Call<java.util.List<com.bss.uis.data.remote.dto.response.PinCodeResponse>> fetchPinData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "pin")
    java.lang.String pin);
}