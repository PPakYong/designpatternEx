class SingletonClassV2 private constructor(name : String) {
    companion object {
        @Volatile
        private var INSTANCE: SingletonClassV2? = null

        private lateinit var name : String

        fun getInstance(name : String): SingletonClassV2 =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: SingletonClassV2(name).also {
                    this.name = name
                    INSTANCE = it
                }
            }
    }
}