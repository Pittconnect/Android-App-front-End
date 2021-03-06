package org.coepi.android.extensions

import android.util.Base64

fun String.hexToByteArray(): ByteArray {
    val carr = toCharArray()
    val size = carr.size
    val res = ByteArray(size / 2)
    var i = 0
    while (i < size) {
        val hex2 = "" + carr[i] + carr[i + 1]
        val byte: Byte = hex2.toLong(radix = 16).toByte()
        res[i / 2] = byte
        i += 2
    }
    return res
}

fun String.toBase64(): String =
    Base64.encodeToString(toByteArray(), Base64.NO_WRAP)
