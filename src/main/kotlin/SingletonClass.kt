class SingletonClass() {

    companion object {
        val testValue = "testValue by companion object";
         val testValue2 = lazy {
            "testValue2 by companion object (lazy)"
        }
    }

    val testValue3 = "testValue3"
}