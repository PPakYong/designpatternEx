import SingletonTestObject.testValue

fun main(args: Array<String>) {
    singletonTest()
    builderTest()
    abstractFactoryTest()
}

fun singletonTest() {
    val singletonTestObject1 = SingletonTestObject;
    val singletonTestObject2 = SingletonTestObject;

    if (singletonTestObject1.equals(singletonTestObject2)) {
        println("singletonTestObject 1 and 2 is ==")
    }

    if (singletonTestObject1 == singletonTestObject2) {
        println("singletonTestObject 1 and 2 is equal!")
        var objectValue1 = singletonTestObject1.testValue;
        println("objectValue1 : $singletonTestObject1.$testValue")
        var objectValue2 = singletonTestObject1.testValue.value;
        println("objectValue1 : $objectValue2")
    }

    val singletonTestClass1 = SingletonClass;
    val singletonTestClass2 = SingletonClass;

    if (singletonTestClass1 == singletonTestClass2) {
        println("singletonTestClass 1 and 2 is ==")
        val classValue1 = singletonTestClass1.testValue;
        val classValue2 = singletonTestClass2.testValue2.value;

        if (singletonTestClass1.testValue2.equals(singletonTestClass2.testValue2)) {
            println("testValue2 is equals!");
        }
    }

    if (singletonTestClass1.equals(singletonTestClass2)) {
        println("singletonTestClass 1 and 2 is equals!");
    }
}

fun builderTest() {
    val builderTestData1 = BuilderTestData();
    val builderTestData2 = BuilderTestData(
        "test1",
        "test2",
        300
    )

    val testList = arrayOf<String>("array1", "array2", "array3").asList()
    val builderTestData3 = BuilderTestData(
        "", "", 999, testList
    )

    val builderTestData4 = BuilderTestData(
        "test4",
    "test6",
        123,
        null,
        SingletonTestObject,
        DummyClass()
    )


    val builderTestData5 = BuilderTestData(
        "test4",
        "test6",
        123,
        null,
        null,
        DummyClass()
    )

    println(builderTestData1)
    println(builderTestData2)
    println(builderTestData3)
    println(builderTestData4)
    println(builderTestData5)
}

fun abstractFactoryTest() {
    val jongheon = NexonKorea()
    jongheon.pay = 200000000
    jongheon.currencyType = "won"

    val owen = NexonJapan()
    owen.pay = 30000000
    owen.currencyType = "yen"

    val tom = NexonAmerica()
    tom.pay = 60000

    println(jongheon)
    println(owen)
    println(tom)

    println(jongheon.exchange("yen"))
    println(owen.exchange("dollor"))
}
