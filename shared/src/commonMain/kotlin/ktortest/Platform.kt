package ktortest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform