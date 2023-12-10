import test.moduleA

fun main(args: Array<String>) {

    println(moduleA().a_public)
    println(moduleA().m_public())

    println(moduleA().a_internal)
    println(moduleA().m_internal())

    println(protectedTest().test())
}

class protectedTest : moduleA(){
    fun test() = println(a_protected)
}