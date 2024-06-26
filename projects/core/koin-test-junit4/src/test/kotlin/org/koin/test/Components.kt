package org.koin.test

import org.koin.core.qualifier.Qualifier
import java.util.*

@Suppress("unused")
class Simple {
    class ComponentA
    class ComponentB(val a: ComponentA)
    class ComponentC(val b: ComponentB)
    class ComponentD()
    class ComponentE(val d: ComponentD)
    class MyString(val s: String)
    class MyComplexString(val s: String, val a : ComponentA)
    class MyComplexString2(val a : ComponentA, val s: String)
    class MyComplexBool(val a : ComponentA, val b : Boolean)

    class UUIDComponent {
        fun getUUID() = UUID.randomUUID().toString()
    }
}

object UpperCase : Qualifier {
    override val value: String = "UpperCase"
}
