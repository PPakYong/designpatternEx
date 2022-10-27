data class BuilderTestData(
    val item1: String = "item1",
    val item2: String = item1,
    val item3: Int = 100,
    val item4: List<String>? = ArrayList<String>(),
    val item5: SingletonTestObject? = SingletonTestObject,
    val item6: DummyClass? = DummyClass()
)
