package com.example.myapplication

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "SaveSessiondIdResponse")
data class ResponseTokenId(
    @Element(name = "SaveSessiondIdResult")
    var tokenId: String?=null
)
