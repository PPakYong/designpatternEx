object SingletonTestObject {
    val testValue = lazy/*(LazyThreadSafetyMode.SYNCHRONIZED)*/ {
        "testValue by lazy set"
    }

    val testValue2 by lazy {
        "testValue2 by lazy set"
    }
}