# DataBindingExampleMVVM
In this ripo, you can learn data binding as well as viewBinding : HAPPY CODING ❤️
Note: in this code pls change your BaseURL
object Retrofit {
    fun createBaseApiService(
        baseUrl: String = //BASEURL
        connectTimeoutInSec: Long = 10,
        readTimeoutInSec: Long = 30,
        writeTimeoutInSec: Long = 60
    ): ApiInterface {

      
