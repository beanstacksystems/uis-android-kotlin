package com.bss.uis.util

interface Mapper<I, O> {
    fun map(input: I): O
}