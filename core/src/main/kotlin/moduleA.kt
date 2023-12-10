package test

open class moduleA {

    val a_public = "public"
    fun m_public() = println("public")

    internal val a_internal = "internal"
    internal fun m_internal() = println("internal")

    protected val a_protected = "protected"
}